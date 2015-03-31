package com.tannv.dailyenglishspeaking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;


public class ListeningOnline extends Activity {
	ListView lv;
	ListeningOnlineAdapter adapter;
	String recieve;
	TextView tv, tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_video);

		tv = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);

		lv = (ListView) findViewById(R.id.listView1);
		adapter = new ListeningOnlineAdapter(this);
		lv.setAdapter(adapter);

		tv.setText("Nghe Tiếng Anh");
		tv2.setText("");

		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				if (position == 0) {
					Intent myIntent1 = new Intent(ListeningOnline.this,
							ListeningVoa.class);
					startActivity(myIntent1);
				}

				if (position == 1) {
					Intent myIntent = new Intent(ListeningOnline.this,
							Listening365.class);
					startActivity(myIntent);
				}
				if (position == 2) {
					Intent myIntent = new Intent(ListeningOnline.this,
							ListeningFromSong.class);
					startActivity(myIntent);
				}
//				if (position == 3) {
////					Intent myIntent = new Intent(ListeningOnline.this,
////							SplashActivity.class);
////					startActivity(myIntent);
//				}
//				if (position == 4) {
//					Intent myIntent = new Intent(ListeningOnline.this,
//							VideoViewPlayer.class);
//					startActivity(myIntent);
//				}
			}
		});
	}
}
