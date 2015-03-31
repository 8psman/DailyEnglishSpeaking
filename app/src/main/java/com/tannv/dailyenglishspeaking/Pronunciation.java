package com.tannv.dailyenglishspeaking;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Pronunciation extends Activity {
	ListView lv;
	PronunciationAdapter adapter;
	TextView tv, tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_video);

		tv = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		
		AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
		
		tv.setText("Luyện Phát Âm Tiếng Anh");
		tv2.setText("Các bạn có thể chọn Anh-Anh hoặc Anh-Mỹ để luyện phát âm!");
		lv = (ListView) findViewById(R.id.listView1);
		adapter = new PronunciationAdapter(this);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent myIntent = new Intent(Pronunciation.this,
						VideoActivity.class);
				if (position == 0) {
					myIntent.putExtra("id", "kur9zAMOkKc");
					myIntent.putExtra("id1", "Luyện phát âm Anh - Anh");
					myIntent.putExtra("id2", "Luyện Phát Âm Tiếng Anh");
					myIntent.putExtra("id5", "/DailyEnglish/Pronunciation/Anh-Anh");
					startActivity(myIntent);
				}
				if (position == 1) {
					myIntent.putExtra("id", "-SObetOJ_yY");
					myIntent.putExtra("id1", "Luyện phát âm Anh - Mỹ");
					myIntent.putExtra("id2", "Luyện Phát Âm Tiếng Anh");
					myIntent.putExtra("id5", "/DailyEnglish/Pronunciation/Anh-Anh");
					startActivity(myIntent);
				}
			}
		});
	}
}
