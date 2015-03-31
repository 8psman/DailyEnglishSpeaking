package com.tannv.dailyenglishspeaking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class ListeningVoa extends Activity {
	ListView lv;
	ListeningVoaAdapter adapter;
	String recieve;
	TextView tv, tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_video);

		tv = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);

		lv = (ListView) findViewById(R.id.listView1);
		adapter = new ListeningVoaAdapter(this);
		lv.setAdapter(adapter);

		tv.setText("Nghe Tiếng Anh Qua VOA");
		tv2.setText("Hãy học từ từ, không nóng vội!");

		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent myIntent = new Intent(ListeningVoa.this,
						VideoActivity.class);
				if (position == 0) {
					myIntent.putExtra("id", "6nYvb1fb3AI");
					myIntent.putExtra("id1", "Nghe VOA: Bài 1!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 1.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 1.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 1.flv");
					startActivity(myIntent);
				}
				if (position == 1) {
					myIntent.putExtra("id", "CN923iGJAjE");
					myIntent.putExtra("id1", "Nghe VOA: Bài 2!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 2.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 2.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 2.flv");
					startActivity(myIntent);
				}
				if (position == 2) {
					myIntent.putExtra("id", "dTVnRR8YkN8");
					myIntent.putExtra("id1", "Nghe VOA: Bài 3!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 3.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 3.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 3.flv");
					startActivity(myIntent);
				}
				if (position == 3) {
					myIntent.putExtra("id", "8EexFGeB5jk");
					myIntent.putExtra("id1", "Nghe VOA: Bài 4!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 4.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 4.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 4.flv");
					startActivity(myIntent);
				}
				if (position == 4) {
					myIntent.putExtra("id", "wb99R0GrvTk");
					myIntent.putExtra("id1", "Nghe VOA: Bài 5!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 5.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 5.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 5.flv");
					startActivity(myIntent);
				}
				if (position == 5) {
					myIntent.putExtra("id", "StqVA3Av2xU");
					myIntent.putExtra("id1", "Nghe VOA: Bài 6!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 6.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 6.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 6.flv");
					startActivity(myIntent);
				}
				if (position == 6) {
					myIntent.putExtra("id", "8-tGgq7dI3g");
					myIntent.putExtra("id1", "Nghe VOA: Bài 7!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 7.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 7.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 7.flv");
					startActivity(myIntent);
				}
				if (position == 7) {
					myIntent.putExtra("id1", "Nghe VOA: Bài 8!");
					myIntent.putExtra("id", "fXNQHxYoiGs");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 8.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 8.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 8.flv");
					startActivity(myIntent);
				}
				if (position == 8) {
					myIntent.putExtra("id", "J0cqgW9Fxbs");
					myIntent.putExtra("id1", "Nghe VOA: Bài 9!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 9.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 9.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 9.flv");
					startActivity(myIntent);
				}
				if (position == 9) {
					myIntent.putExtra("id", "BAo8jb-_3t4");
					myIntent.putExtra("id1", "Nghe VOA: Bài 10!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 10.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 10.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 10.flv");
					startActivity(myIntent);
				}
				if (position == 10) {
					myIntent.putExtra("id", "k5qHRCqPFlQ");
					myIntent.putExtra("id1", "Nghe VOA: Bài 11!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 11.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 11.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 11.flv");
					startActivity(myIntent);
				}
				if (position == 11) {
					myIntent.putExtra("id", "jnsLcSTVDVU");
					myIntent.putExtra("id1", "Nghe VOA: Bài 12!");
					myIntent.putExtra("id2", "Nghe Tiếng Anh Qua VOA");
					myIntent.putExtra("id5", "/DailyEnglish/Listening/NgheTiengAnhQuaVoV/");
					myIntent.putExtra("id6", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 12.3gp");
					myIntent.putExtra("id7", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 12.mp4");
					myIntent.putExtra("id8", "Luyện nghe tiếng Anh qua video VOA - Có phụ đề tiếng anh - Bài 12.flv");
					startActivity(myIntent);
				}
			}
		});
	}
}
