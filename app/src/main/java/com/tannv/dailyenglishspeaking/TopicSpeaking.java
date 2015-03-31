package com.tannv.dailyenglishspeaking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class TopicSpeaking extends Activity {
	ListView lv;
	TopicSpeakingAdapter adapter;
	String recieve;

	TextView tv1, tv2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_video);

		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		
		lv = (ListView) findViewById(R.id.listView1);
		adapter = new TopicSpeakingAdapter(this);
		lv.setAdapter(adapter);

		tv1.setText("HỌC THEO CHỦ ĐỀ");
		tv2.setText("Các bạn chọn chủ đề bên dưới để học!");
		
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				if (position == 0) {
					Intent myIntent = new Intent(TopicSpeaking.this,
							TopicsActivity.class);
					myIntent.putExtra("id11", "music.txt");
					startActivity(myIntent);
				}
				if (position == 1) {
					Intent myIntent = new Intent(TopicSpeaking.this,
							TopicsActivity.class);
					myIntent.putExtra("id11", "sport.txt");
					startActivity(myIntent);
				}
				if (position == 2) {
					Intent myIntent = new Intent(TopicSpeaking.this,
							TopicsActivity.class);
					myIntent.putExtra("id11", "family.txt");
					startActivity(myIntent);
				}
				if (position == 3) {
					Intent myIntent = new Intent(TopicSpeaking.this,
							TopicsActivity.class);
					myIntent.putExtra("id11", "friend.txt");
					startActivity(myIntent);
				}
				if (position == 4) {
					Intent myIntent = new Intent(TopicSpeaking.this,
							TopicsActivity.class);
					myIntent.putExtra("id11", "education.txt");
					startActivity(myIntent);
				}
				if (position == 5) {
					Intent myIntent = new Intent(TopicSpeaking.this,
							TopicsActivity.class);
					myIntent.putExtra("id11", "workinglife.txt");
					startActivity(myIntent);
				}
				if (position == 6) {
					Intent myIntent = new Intent(TopicSpeaking.this,
							TopicsActivity.class);
					myIntent.putExtra("id11", "town1.txt");
					startActivity(myIntent);
				}
			}
		});
	}
}