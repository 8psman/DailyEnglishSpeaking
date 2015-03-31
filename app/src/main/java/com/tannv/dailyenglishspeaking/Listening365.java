package com.tannv.dailyenglishspeaking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class Listening365 extends Activity {
	ListView lv;
	Listening365Adapter adapter;
	String recieve;
	TextView tv, tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_video);

		tv = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);

		lv = (ListView) findViewById(R.id.listView1);
		adapter = new Listening365Adapter(this);
		lv.setAdapter(adapter);
		tv.setText("365 Câu Giao Tiếp Căn Bản");
		tv2.setText("Các bạn hãy học câu nào chắc câu đấy!");

		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent myIntent = new Intent(Listening365.this,
						VideoActivity.class);
				if (position == 0) {
					myIntent.putExtra("id", "mDK8QEw9TAA");
					myIntent.putExtra("id1", "365 câu căn bản: Câu 1-13");
					myIntent.putExtra("id2", "365 Câu Giao Tiếp Căn Bản");
					myIntent.putExtra("id5",
							"/DailyEnglish/Listening/365/1-13/");
					myIntent.putExtra("id6",
							"Luyện Nghe Tiếng Anh 365 câu căn bản câu 1-13.3gp");
					myIntent.putExtra("id7",
							"Luyện Nghe Tiếng Anh 365 câu căn bản câu 1-13.mp4");
					myIntent.putExtra("id8",
							"Luyện Nghe Tiếng Anh 365 câu căn bản câu 1-13.flv");
					startActivity(myIntent);
				}
				if (position == 1) {
					myIntent.putExtra("id", "_YpPwBsJWwA");
					myIntent.putExtra("id1", "365 câu căn bản: Câu 14-39");
					myIntent.putExtra("id2", "365 Câu Giao Tiếp Căn Bản");
					myIntent.putExtra("id5",
							"/DailyEnglish/Listening/365/14-39/");
					myIntent.putExtra("id6",
							"Luyện Nghe Tiếng Anh 365 câu căn bản câu 14-39.3gp");
					myIntent.putExtra("id7",
							"Luyện Nghe Tiếng Anh 365 câu căn bản câu 14-39.mp4");
					myIntent.putExtra("id8",
							"Luyện Nghe Tiếng Anh 365 câu căn bản câu 14-39.flv");
					startActivity(myIntent);
				}
				if (position == 2) {
					myIntent.putExtra("id", "wBRCUCQytEg");
					myIntent.putExtra("id1", "365 câu căn bản: Câu 40-62");
					myIntent.putExtra("id2", "365 Câu Giao Tiếp Căn Bản");
					myIntent.putExtra("id5",
							"/DailyEnglish/Listening/365/40-62/");
					myIntent.putExtra("id6",
							"Luyện nghe tiếng Anh 365 câu căn bản câu 40-62.3gp");
					myIntent.putExtra("id7",
							"Luyện nghe tiếng Anh 365 câu căn bản câu 40-62.mp4");
					myIntent.putExtra("id8",
							"Luyện nghe tiếng Anh 365 câu căn bản câu 40-62.flv");
					startActivity(myIntent);
				}
				if (position == 3) {
					myIntent.putExtra("id", "n0z10NvGugA");
					myIntent.putExtra("id1", "365 câu căn bản: Câu 63-102");
					myIntent.putExtra("id2", "365 Câu Giao Tiếp Căn Bản");
					myIntent.putExtra("id5",
							"/DailyEnglish/Listening/365/63-102/");
					myIntent.putExtra("id6",
							"Luyện Nghe Tiếng Anh 365 câu căn bản 63-102.3gp");
					myIntent.putExtra("id7",
							"Luyện Nghe Tiếng Anh 365 câu căn bản 63-102.mp4");
					myIntent.putExtra("id8",
							"Luyện Nghe Tiếng Anh 365 câu căn bản 63-102.flv");
					startActivity(myIntent);
				}
				if (position == 4) {
					myIntent.putExtra("id", "faHQtL_d2qs");
					myIntent.putExtra("id1", "365 câu căn bản Câu 103-148");
					myIntent.putExtra("id2", "365 Câu Giao Tiếp Căn Bản");
					myIntent.putExtra("id5",
							"/DailyEnglish/Listening/365/103-148/");
					myIntent.putExtra("id6",
							"Luyện Nghe Tiếng Anh 365 câu căn bản 103-148.3gp");
					myIntent.putExtra("id7",
							"Luyện Nghe Tiếng Anh 365 câu căn bản 103-148.mp4");
					myIntent.putExtra("id8",
							"Luyện Nghe Tiếng Anh 365 câu căn bản 103-148.flv");
					startActivity(myIntent);
				}
				if (position == 5) {
					myIntent.putExtra("id", "10ei4SkMGHQ");
					myIntent.putExtra("id1", "365 câu căn bản: Câu 149-184");
					myIntent.putExtra("id2", "365 Câu Giao Tiếp Căn Bản");
					myIntent.putExtra("id5",
							"/DailyEnglish/Listening/365/149-184/");
					myIntent.putExtra("id6",
							"Luyện Nghe Tiếng Anh 365 câu căn bản 149-184.3gp");
					myIntent.putExtra("id7",
							"Luyện Nghe Tiếng Anh 365 câu căn bản 149-184.mp4");
					myIntent.putExtra("id8",
							"Luyện Nghe Tiếng Anh 365 câu căn bản 149-184.flv");
					startActivity(myIntent);
				}
				if (position == 6) {
					myIntent.putExtra("id", "omtbzmNaVGQ");
					myIntent.putExtra("id1", "365 câu căn bản Câu 185-207");
					myIntent.putExtra("id2", "365 Câu Giao Tiếp Căn Bản");
					myIntent.putExtra("id5",
							"/DailyEnglish/Listening/365/185-207/");
					myIntent.putExtra("id6",
							"Luyện nghe tiếng Anh 365 câu căn bản câu 185-207.3gp");
					myIntent.putExtra("id7",
							"Luyện nghe tiếng Anh 365 câu căn bản câu 185-207.mp4");
					myIntent.putExtra("id8",
							"Luyện nghe tiếng Anh 365 câu căn bản câu 185-207.flv");
					startActivity(myIntent);
				}
				if (position == 7) {
					myIntent.putExtra("id", "pwV_jJferi0");
					myIntent.putExtra("id1", "365 câu căn bản: Câu 208-245");
					myIntent.putExtra("id2", "365 Câu Giao Tiếp Căn Bản");
					myIntent.putExtra("id5",
							"/DailyEnglish/Listening/365/208-245/");
					myIntent.putExtra("id6",
							"Luyện nghe tiếng Anh 365 câu căn bản câu 208-245.3gp");
					myIntent.putExtra("id7",
							"Luyện nghe tiếng Anh 365 câu căn bản câu 208-245.mp4");
					myIntent.putExtra("id8",
							"Luyện nghe tiếng Anh 365 câu căn bản câu 208-245.flv");
					startActivity(myIntent);
				}
			}
		});
	}
}
