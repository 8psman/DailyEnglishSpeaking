package com.tannv.dailyenglishspeaking;

import java.io.File;
import java.io.IOException;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoActivity extends YouTubeBaseActivity implements
		YouTubePlayer.OnInitializedListener, OnClickListener {

	String recieve, recieve_tv, recieve_text;
	String recieve_download;
	TextView tv, tv2;

	static String id5, id6, id7, id8;

	Button bt_offline;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.youtube_player);

		Bundle bundle = getIntent().getExtras();
		id5 = bundle.getString("id5");
		id6 = bundle.getString("id6");
		id7 = bundle.getString("id7");
		id8 = bundle.getString("id8");

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		// System.out.println("id5: " + id5);

		bt_offline = (Button) findViewById(R.id.bt_offline);

		bt_offline.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent myIntent = new Intent(VideoActivity.this,
						VideoViewSample.class);
				myIntent.putExtra("id5", id5);
				myIntent.putExtra("id6", id6);
				myIntent.putExtra("id7", id7);
				myIntent.putExtra("id8", id8);

				startActivity(myIntent);
			}
		});

		tv = (TextView) findViewById(R.id.textView2);
		tv2 = (TextView) findViewById(R.id.textView1);

		YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube);
		youTubePlayerView.initialize(Variables.API_KEY, this);

		recieve = bundle.getString("id");
		recieve_tv = bundle.getString("id1");
		recieve_text = bundle.getString("id2");

		tv2.setText(recieve_text);
		tv.setText(recieve_tv);

		findViewById(R.id.action_download).setOnClickListener(this);
	}

	@Override
	public void onInitializationFailure(Provider provider,
			YouTubeInitializationResult result) {
		Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG)
				.show();
	}

	@Override
	public void onInitializationSuccess(Provider provider,
			YouTubePlayer player, boolean wasRestored) {

		/** add listeners to YouTubePlayer instance **/
		player.setPlayerStateChangeListener(playerStateChangeListener);
		player.setPlaybackEventListener(playbackEventListener);

		/** Start buffering **/
		if (!wasRestored) {
			player.cueVideo(recieve);
		}
	}

	private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {

		@Override
		public void onBuffering(boolean arg0) {

		}

		@Override
		public void onPaused() {

		}

		@Override
		public void onPlaying() {

		}

		@Override
		public void onSeekTo(int arg0) {

		}

		@Override
		public void onStopped() {

		}

	};

	private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {

		@Override
		public void onAdStarted() {

		}

		@Override
		public void onError(ErrorReason arg0) {

		}

		@Override
		public void onLoaded(String arg0) {

		}

		@Override
		public void onLoading() {
		}

		@Override
		public void onVideoEnded() {

		}

		@Override
		public void onVideoStarted() {

		}
	};

	private void onActionDownload() {
		// String link = linkEditor.getText().toString();
		// if (TextUtils.isEmpty(link)){
		// showMessage("Please input video link");
		// return ;
		// }
		// onDownloadLink(link);
		onDownloadLink("https://www.youtube.com/watch?v=" + recieve);
	}

	private void onDownloadLink(String link) {
		final ProgressDialog progressDialog = new ProgressDialog(this);
		progressDialog.setMessage("Getting video info ...");
		progressDialog.show();
		new AsyncTask<String, Void, YouviderInfo>() {
			@Override
			protected YouviderInfo doInBackground(String... links) {
				try {
					return Youvider.getVideoInfo(links[0]);
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			}

			@Override
			protected void onPostExecute(YouviderInfo youviderInfo) {
				super.onPostExecute(youviderInfo);
				if (youviderInfo == null) {
					showMessage("Could not parse video info");
					return;
				}
				if (youviderInfo.encodedStreams == null
						|| youviderInfo.encodedStreams.size() == 0) {
					showMessage("Could not parse video stream");
					return;
				}
				progressDialog.hide();
				onReceiveDownloadInfo(youviderInfo);
			}
		}.execute(link);
	}

	private void onReceiveDownloadInfo(final YouviderInfo info) {
		String[] streams = new String[info.encodedStreams.size()];
		for (int i = 0; i < info.encodedStreams.size(); i++)
			streams[i] = info.encodedStreams.get(i).itag.toString();

		AlertDialog dialog = new AlertDialog.Builder(this)
				.setTitle("Download video")
				.setItems(streams, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialogInterface,
							int position) {
						showMessage("Choose " + position);
						EncodedStream stream = info.encodedStreams
								.get(position);
						String fileName = info.videoTitle == null ? "Unknown title video"
								: Utils.getSafeFileNameFor(info.videoTitle);
						fileName += "." + stream.itag.format.toLowerCase();
						String path = getExternalStoragePath() + File.separator
								+ fileName;
						onChooseDownloadVideo(stream, path);
					}
				}).create();
		dialog.show();
	}

	private void onChooseDownloadVideo(final EncodedStream stream,
			final String path) {
		final ProgressDialog progressDialog = new ProgressDialog(this);
		progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		progressDialog.setTitle("Downloading...");
		progressDialog.setMax(100);
		progressDialog.show();

		new AsyncTask<Void, Integer, Boolean>() {
			@Override
			protected Boolean doInBackground(Void... voids) {
				return Youvider.downloadEncodedStream(stream, path,
						new Youvider.OnDownloadingProgress() {
							@Override
							public void onDownloadingProgress(int percent) {
								publishProgress(percent);
							}
						});
			}

			@Override
			protected void onProgressUpdate(Integer... values) {
				super.onProgressUpdate(values);
				progressDialog.setProgress(values[0]);
			}

			@Override
			protected void onPostExecute(Boolean result) {
				super.onPostExecute(result);
				progressDialog.hide();
				if (result) {
					showMessage("Video saved: " + path);
				} else {
					showMessage("Error downloading video");
				}
			}
		}.execute();

	}

	public static String getExternalStoragePath() {
		String path = null;
		// Create Folder
		File folder = new File(Environment.getExternalStorageDirectory()
				.toString() + id5);
		folder.mkdirs();
		// Save the path as a string value
		String extStorageDirectory = folder.toString();

		try {
			// path =
			// Environment.getExternalStorageDirectory().getAbsolutePath();
			path = extStorageDirectory;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return path;
	}

	private void showMessage(String message) {
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		int id = view.getId();
		if (id == R.id.action_download) {
			onActionDownload();
		}
	}
}
