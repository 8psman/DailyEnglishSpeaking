/* Copyright (c) 2013, Intel Corporation
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 *
 * - Redistributions of source code must retain the above copyright notice, 
 *   this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright notice, 
 *   this list of conditions and the following disclaimer in the documentation 
 *   and/or other materials provided with the distribution.
 * - Neither the name of Intel Corporation nor the names of its contributors 
 *   may be used to endorse or promote products derived from this software 
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 *
 */

package com.tannv.dailyenglishspeaking;

import java.io.File;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoViewSample extends Activity {
	private VideoView mVideoView;

	private MediaController mController;

	MediaMetadataRetriever mMetadataRetriever;

	String recieve;
	String recieve_id6, recieve_id7, recieve_id8;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		mVideoView = (VideoView) findViewById(R.id.myplaysurface);

		mMetadataRetriever = new MediaMetadataRetriever();

		Bundle bundle = getIntent().getExtras();
		recieve = bundle.getString("id5");
		recieve_id6 = bundle.getString("id6");
		recieve_id7 = bundle.getString("id7");
		recieve_id8 = bundle.getString("id8");

		Intent intent = new Intent();
		//
		intent.setType("video/*");
		intent.setAction(Intent.ACTION_GET_CONTENT);

		File folder1 = new File(Environment.getExternalStorageDirectory()
				.toString() + recieve + recieve_id6);

		File folder2 = new File(Environment.getExternalStorageDirectory()
				.toString() + recieve + recieve_id7);

		File folder3 = new File(Environment.getExternalStorageDirectory()
				.toString() + recieve + recieve_id8);

		String extStorageDirectory1 = folder1.toString();
		String extStorageDirectory2 = folder2.toString();
		String extStorageDirectory3 = folder3.toString();

		// if (!folder1.exists() && !folder2.exists() && folder3.exists()) {
		// Toast.makeText(this, "Video nÃ y báº¡n chÆ°a download!",
		// Toast.LENGTH_LONG).show();
		// }

		if (folder2.exists()) {

			startPlayback(extStorageDirectory2);

		}

		if (!folder2.exists() && folder1.exists()) {

			startPlayback(extStorageDirectory1);

		}

		if (!folder2.exists() && !folder1.exists() && folder3.exists()) {

			startPlayback(extStorageDirectory3);

		}

		else
			Toast.makeText(this, "Video này bạn chưa download!",
					Toast.LENGTH_LONG).show();

		// startActivityForResult(
		// Intent.createChooser(intent, "Video File to Play"), 0);
	}

	// public void openFolder() {
	// Uri startDir = Uri.fromFile(new File(Environment
	// .getExternalStorageDirectory().getAbsolutePath() + recieve));
	// System.out.println("id5: " + recieve);
	// Intent intent = new Intent();
	// intent.setData(startDir);
	// intent.setType("*/*");
	// // intent.setType("video/*");
	// intent.setAction(Intent.ACTION_VIEW);
	// startActivity(intent);
	// }

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
	}

	@SuppressLint("NewApi")
	public void startPlayback(String videoPath) {
		mMetadataRetriever.setDataSource(videoPath);

		Uri uri = Uri.parse(videoPath);
		mVideoView.setVideoURI(uri);

		mController = new MediaController(this, false);
		mVideoView.setMediaController(mController);
		mVideoView.requestFocus();
		mVideoView.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.video_view_sample, menu);

		return true;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == 0) {
			if (resultCode == RESULT_OK) {
				Uri sourceUri = data.getData();
				String source = getPath(sourceUri);

				startPlayback(source);
			}
		}
	}

	public String getPath(Uri uri) {
		Cursor cursor = getContentResolver().query(uri, null, null, null, null);

		if (cursor == null) {
			return uri.getPath();
		} else {
			cursor.moveToFirst();

			int idx = cursor
					.getColumnIndex(MediaStore.Images.ImageColumns.DATA);

			return cursor.getString(idx);
		}
	}
}
