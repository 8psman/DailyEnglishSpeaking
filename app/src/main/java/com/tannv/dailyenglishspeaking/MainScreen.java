package com.tannv.dailyenglishspeaking;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainscreen);

		ArrayList<GridViewItem> arr = new ArrayList<GridViewItem>();

		for (int i = 0; i < 6; i++) {
			GridViewItem temp = new GridViewItem();
			temp.text = FinalItem.HOME_TEXT[i];
			temp.image = FinalItem.HOME_IMAGE[i];
			arr.add(temp);
		}
		System.out.println("Da chay vao day sao van chua chay???");

		run1(arr);
		// run3();

	}

	void run1(ArrayList<GridViewItem> arr) {
		GridView gv = (GridView) findViewById(R.id.gvHomePage);

		GridViewAdapter adapter = new GridViewAdapter(this,
				R.layout.gridview_item, arr);
		gv.setAdapter(adapter);

		gv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent myIntent = null;
				if (position == 0) {
					myIntent = new Intent(view.getContext(),
							LessonFullClass.class);
				}
				if (position == 1) {
					myIntent = new Intent(view.getContext(),
							Thefirstlesson.class);
				}
				if (position == 2) {
					myIntent = new Intent(view.getContext(),
							Pronunciation.class);
				}
				if (position == 3) {
					myIntent = new Intent(view.getContext(),
							ListeningOnline.class);
				}
				if (position == 4) {
					myIntent = new Intent(view.getContext(),
							HowToStudying.class);
				}

				if (position == 5) {
					myIntent = new Intent(view.getContext(),
							ComunityActivity.class);
				}

				// if (position == 5) {
				// myIntent = new Intent(
				// Intent.ACTION_VIEW,
				// Uri.parse("https://www.facebook.com/groups/268153570054218/"));
				// startActivity(myIntent);
				// }
				startActivity(myIntent);
			}
		});

	}

	// void run2(ArrayList<GridViewItem> arr) {
	// ListView lv = (ListView) findViewById(R.id.lvHomePage);
	//
	// ListViewAdapter adapter1 = new ListViewAdapter(this,
	// R.layout.listview_item, arr);
	// lv.setAdapter(adapter1);
	// }

	// void run3() {
	// TextView tv = (TextView) findViewById(R.id.textView4);
	// Typeface face = Typeface
	// .createFromAsset(getAssets(), "fonts/SHOWG.TTF");
	// tv.setTypeface(face);
	// ImageView iv = (ImageView) findViewById(R.id.iv);
	// iv.startAnimation(AnimationUtils.loadAnimation(MainScreen.this,
	// R.anim.rotate));
	// }

}
