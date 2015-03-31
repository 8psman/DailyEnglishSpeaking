package com.tannv.dailyenglishspeaking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class LessonFullClass extends Activity {
	ListView lv;
	LessonFullClassAdapter adapter;
	String recieve;
	TextView tv, tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_video);

		tv = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);

		lv = (ListView) findViewById(R.id.listView1);
		adapter = new LessonFullClassAdapter(this);
		lv.setAdapter(adapter);
		
		tv.setText("HỌC NÓI TIẾNG ANH");
		tv2.setText("");
		
		AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				if (position == 0) {
					Intent myIntent = new Intent(LessonFullClass.this,
							MainActivity.class);
					startActivity(myIntent);
				}
				if (position == 1) {
					Intent myIntent = new Intent(LessonFullClass.this,
							TopicSpeaking.class);
					startActivity(myIntent);
				}
				if (position == 2) {
					Intent myIntent = new Intent(LessonFullClass.this,
							TopicsActivity.class);
					myIntent.putExtra("id11", "describe.txt");
					startActivity(myIntent);
				}
				if (position == 3) {
					Intent myIntent = new Intent(LessonFullClass.this,
							TopicsActivity.class);
					myIntent.putExtra("id11", "interview.txt");
					startActivity(myIntent);
				}

			}
		});
	}
}