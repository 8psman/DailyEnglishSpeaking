package com.tannv.dailyenglishspeaking;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListeningFromSongAdapter extends BaseAdapter {

	private ArrayList<Lesson> lessons;
	private Activity context;

	public ListeningFromSongAdapter(Activity context) {
		this.context = context;
		lessons = new ArrayList<Lesson>();
		lessons.add(new Lesson(
				"Học tiếng Anh qua bài hát - Beautiful in White",
				R.drawable.beautifulinwhite));
		lessons.add(new Lesson(
				"Học tiếng Anh qua bài hát - Yesterday once more",
				R.drawable.yesterdayoncemore));
		lessons.add(new Lesson(
				"Học tiếng Anh qua bài hát - Forever and One ♫♥♪",
				R.drawable.foreverandone));
		lessons.add(new Lesson(
				"Học tiếng anh qua bài hát - My love - Westlife",
				R.drawable.mylove));
		lessons.add(new Lesson(
				"Học tiếng Anh qua bài hát - Until You - Shayne Ward",
				R.drawable.untilyou));
		lessons.add(new Lesson(
				"Học tiếng Anh qua bài hát - Remember When",
				R.drawable.rememberwhen));
		lessons.add(new Lesson(
				"Học tiếng Anh qua bài hát -  When you say nothing at all",
				R.drawable.whenyousaynothingatall));
		lessons.add(new Lesson(
				"Hoc tiếng Anh qua bài hát - When you tell me that you love me",
				R.drawable.whenyoutellmethatyouloveme));
	}

	@Override
	public int getCount() {
		return lessons.size();
	}

	@Override
	public Object getItem(int position) {
		return lessons.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.row_video, null, true);
		ImageView imgIcon = (ImageView) rowView.findViewById(R.id.imageView1);
		TextView txtTitle = (TextView) rowView.findViewById(R.id.textView1);

		imgIcon.setImageResource(lessons.get(position).getImage());
		txtTitle.setText(lessons.get(position).getTitle());
		return rowView;
	}
}
