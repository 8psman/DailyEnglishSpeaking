package com.tannv.dailyenglishspeaking;

import java.io.InputStream;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class SingleContactActivity extends Activity {

	// JSON node keys
	private static final String TAG_GENDER = "gender";
	private static final String TAG_URL = "txturl";
	private static final String TAG_ANSWER = "answer";

	public static Context context;
	public static SingleContactActivity activity;

	static MediaPlayer mPlayer;
	Button buttonPlay;
	Button buttonStop;
	String txturl;
	public boolean flag;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_contact);

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		new DownloadImageTask((ImageView) findViewById(R.id.imageView1))
				.execute("http://dailyenglishspeaking.bugs3.com/topics_photo.jpg");

		// getting intent data
		Intent in = getIntent();

		// downloadFile = new DownloadFile();

		// Get JSON values from previous intent
		String id = in.getStringExtra("id");
		String name = in.getStringExtra(TAG_GENDER);
		txturl = in.getStringExtra(TAG_URL);
		String mobile = in.getStringExtra(TAG_ANSWER);

		System.out.println("Ket qua String tra ve: " + id);

		// Displaying all values on the screen
		TextView lblName = (TextView) findViewById(R.id.name_label);
		// TextView lblEmail = (TextView) findViewById(R.id.email_label);
		TextView lblMobile = (TextView) findViewById(R.id.mobile_label);

		TextView id_string = (TextView) findViewById(R.id.id_string);

		lblName.setText(name);
		// lblEmail.setText(email);
		lblMobile.setText(mobile);

		id_string.setText(id);

		mPlayer = new MediaPlayer();
		// buttonPlay = (Button) findViewById(R.id.nghe);
		// buttonPlay.setOnClickListener(new OnClickListener() {
		//
		// public void onClick(View v) {
		// // String url =
		// //
		// "http://www.virginmegastore.me/Library/Music/CD_001214/Tracks/Track1.mp3";
		// // // your URL here
		// Uri myUri = Uri.parse(txturl);
		// mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
		//
		// Intent intent = getIntent();
		// // Are we called from main or by our M3U intent?
		//
		// try {
		// mPlayer.setDataSource(getApplicationContext(), myUri);
		// } catch (IllegalArgumentException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (SecurityException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IllegalStateException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// try {
		// mPlayer.prepare();
		// } catch (IllegalStateException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// if (flag) {
		// // mPlayer.start();
		// flag = false;
		// buttonPlay.setText("Dừng");
		// // buttonPlay.setBackgroundResource(R.drawable.ic_launcher);
		// } else {
		// // mPlayer.stop();
		// flag = true;
		// buttonPlay.setText("Chơi");
		// // buttonPlay.setBackgroundResource(R.drawable.icon);
		// }
		// }
		// });

		// buttonStop = (Button) findViewById(R.id.dung);
		// buttonStop.setOnClickListener(new OnClickListener() {
		//
		// public void onClick(View v) {
		// // TODO Auto-generated method stub
		// if (mPlayer != null && mPlayer.isPlaying()) {
		// mPlayer.stop();
		// }
		// }
		// });
	}

	private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
		ImageView bmImage;

		public DownloadImageTask(ImageView bmImage) {
			this.bmImage = bmImage;
		}

		protected Bitmap doInBackground(String... urls) {
			String urldisplay = urls[0];
			Bitmap mIcon11 = null;
			try {
				InputStream in = new java.net.URL(urldisplay).openStream();
				mIcon11 = BitmapFactory.decodeStream(in);
			} catch (Exception e) {
				Log.e("Error", e.getMessage());
				e.printStackTrace();
			}
			return mIcon11;
		}

		protected void onPostExecute(Bitmap result) {
			bmImage.setImageBitmap(result);
		}
	}

	protected void onDestroy() {
		super.onDestroy();
		// TODO Auto-generated method stub
		if (mPlayer != null) {
			mPlayer.release();
			mPlayer = null;
		}
	}
}
