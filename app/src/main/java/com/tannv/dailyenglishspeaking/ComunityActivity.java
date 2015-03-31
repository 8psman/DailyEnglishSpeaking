package com.tannv.dailyenglishspeaking;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ComunityActivity extends Activity {

	Button btn_shareFB, btn_groupEL, btn_diendan, btn_contact;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_society);

		btn_shareFB = (Button) findViewById(R.id.btn_shareFB);
		btn_groupEL = (Button) findViewById(R.id.btn_groupenglish);
		btn_diendan = (Button) findViewById(R.id.btn_diendan);
		btn_contact = (Button) findViewById(R.id.btn_contact);

		
		AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
		
		btn_shareFB.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

//				Intent myIntent = new Intent(ComunityActivity.this,
//						ActivityShareSociety.class);
//				startActivity(myIntent);
				shareTextUrl();
				
			}
		});

		btn_groupEL.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent myIntent = new Intent(ComunityActivity.this,
						FaceBook.class);
				startActivity(myIntent);
			}
		});

		btn_diendan.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent myIntent = new Intent(ComunityActivity.this,
						VideoViewSample.class);
				startActivity(myIntent);
			}
		});

		btn_contact.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent myIntent = new Intent(ComunityActivity.this,
						ActivitySendemail.class);
				startActivity(myIntent);
			}
		});

	}
	
	private void shareTextUrl() {
		Intent share = new Intent(Intent.ACTION_SEND);
		share.setType("text/plain");
		share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

		// Add data to the intent, the receiving app will decide
		// what to do with it.
		share.putExtra(Intent.EXTRA_SUBJECT, "Title Of The Post");
		share.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.tannv.dailyenglishspeaking");

		startActivity(Intent.createChooser(share, "Chia sẻ ứng dụng lên Facebook!"));
	}
	
}
