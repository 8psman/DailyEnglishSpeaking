package com.tannv.dailyenglishspeaking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class ListeningFromSong extends Activity {
	ListView lv;
	ListeningFromSongAdapter adapter;
	String recieve;
	TextView tv, tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_video);

		tv = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);

		lv = (ListView) findViewById(R.id.listView1);
		adapter = new ListeningFromSongAdapter(this);
		lv.setAdapter(adapter);
		tv.setText("Các Bài Hát Tiếng Anh Hay");
		tv2.setText("Các bạn chọn bài hát yêu thích để nghe!");

		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent myIntent = new Intent(ListeningFromSong.this,
						VideoActivity.class);
				if (position == 0) {
					myIntent.putExtra("id", "46farfyhQwQ");
					myIntent.putExtra("id1", "Bài hát: Beautiful in White");
					myIntent.putExtra("id2", "Các Bài Hát Tiếng Anh Hay");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/BeautifulSong/");
					myIntent.putExtra("id6", "Học tiếng Anh qua bài hát - Beautiful in White.3gp");
					myIntent.putExtra("id7", "Học tiếng Anh qua bài hát - Beautiful in White.mp4");
					myIntent.putExtra("id8", "Học tiếng Anh qua bài hát - Beautiful in White.flv");
					startActivity(myIntent);
				}
				if (position == 1) {
					myIntent.putExtra("id", "JeekEgwpqKA");
					myIntent.putExtra("id1", "Bài hát: Yesterday once more");
					myIntent.putExtra("id2", "Các Bài Hát Tiếng Anh Hay");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/BeautifulSong/");
					myIntent.putExtra("id6", "Học tiếng Anh qua bài hát - Yesterday once more.3gp");
					myIntent.putExtra("id7", "Học tiếng Anh qua bài hát - Yesterday once more.mp4");
					myIntent.putExtra("id8", "Học tiếng Anh qua bài hát - Yesterday once more.flv");
					startActivity(myIntent);
				}
				if (position == 2) {
					myIntent.putExtra("id", "VTeCEcgpJwI");
					myIntent.putExtra("id1", "Bài hát: Forever and One");
					myIntent.putExtra("id2", "Các Bài Hát Tiếng Anh Hay");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/BeautifulSong/");
					myIntent.putExtra("id6", "Học tiếng Anh qua bài hát - Forever and One.3gp");
					myIntent.putExtra("id7", "Học tiếng Anh qua bài hát - Forever and One.mp4");
					myIntent.putExtra("id8", "Học tiếng Anh qua bài hát - Forever and One.flv");
					startActivity(myIntent);
				}
				if (position == 3) {
					myIntent.putExtra("id", "-Zv5WC1rBEk");
					myIntent.putExtra("id1", "Bài hát: My love - Westlife");
					myIntent.putExtra("id2", "Các Bài Hát Tiếng Anh Hay");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/BeautifulSong/");
					myIntent.putExtra("id6", "Học tiếng anh qua bài hát - My love - Westlife.3gp");
					myIntent.putExtra("id7", "Học tiếng anh qua bài hát - My love - Westlife.mp4");
					myIntent.putExtra("id8", "Học tiếng anh qua bài hát - My love - Westlife.flv");
					startActivity(myIntent);
				}
				if (position == 4) {
					myIntent.putExtra("id", "xIodxp1wSZ0");
					myIntent.putExtra("id1", "Bài hát: Until You - Shayne Ward");
					myIntent.putExtra("id2", "Các Bài Hát Tiếng Anh Hay");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/BeautifulSong/");
					myIntent.putExtra("id6", "Học tiếng Anh qua bài hát - Until You - Shayne Ward.3gp");
					myIntent.putExtra("id7", "Học tiếng Anh qua bài hát - Until You - Shayne Ward.mp4");
					myIntent.putExtra("id8", "Học tiếng Anh qua bài hát - Until You - Shayne Ward.flv");
					startActivity(myIntent);
				}
				if (position == 5) {
					myIntent.putExtra("id", "MnVj7_ivoc0");
					myIntent.putExtra("id1", "Bài hát: Remember When");
					myIntent.putExtra("id2", "Các Bài Hát Tiếng Anh Hay");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/BeautifulSong/");
					myIntent.putExtra("id6", "Học tiếng Anh qua bài hát - Remember When - Alan Jackson.3gp");
					myIntent.putExtra("id7", "Học tiếng Anh qua bài hát - Remember When - Alan Jackson.mp4");
					myIntent.putExtra("id8", "Học tiếng Anh qua bài hát - Remember When - Alan Jackson.flv");
					startActivity(myIntent);
				}
				if (position == 6) {
					myIntent.putExtra("id", "Wh1pqu8_kl8");
					myIntent.putExtra("id1", "Bài hát: When you say nothing at all");
					myIntent.putExtra("id2", "Các Bài Hát Tiếng Anh Hay");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/BeautifulSong/");
					myIntent.putExtra("id6", "Học tiếng Anh qua bài hát - When you say nothing at all.3gp");
					myIntent.putExtra("id7", "Học tiếng Anh qua bài hát - When you say nothing at all.mp4");
					myIntent.putExtra("id8", "Học tiếng Anh qua bài hát - When you say nothing at all.flv");
					startActivity(myIntent);
				}
				if (position == 7) {
					myIntent.putExtra("id", "7HsANoUx0us");
					myIntent.putExtra("id1", "Bài hát: When you tell me that you love me");
					myIntent.putExtra("id2", "Các Bài Hát Tiếng Anh Hay");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/BeautifulSong/");
					myIntent.putExtra("id6", "Hoc tiếng Anh qua bài hát - When you tell me that you love me.3gp");
					myIntent.putExtra("id7", "Hoc tiếng Anh qua bài hát - When you tell me that you love me.mp4");
					myIntent.putExtra("id8", "Hoc tiếng Anh qua bài hát - When you tell me that you love me.flv");
					startActivity(myIntent);
				}
			}
		});
	}
}
