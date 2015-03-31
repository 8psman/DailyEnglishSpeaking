package com.tannv.dailyenglishspeaking;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListeningVoaAdapter extends BaseAdapter {

	private ArrayList<Lesson> lessons;
	private Activity context;

	public ListeningVoaAdapter(Activity context) {
		this.context = context;
		lessons = new ArrayList<Lesson>();
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 1",
				R.drawable.voa1));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 2",
				R.drawable.voa2));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 3",
				R.drawable.voa2));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 4",
				R.drawable.voa1));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 5",
				R.drawable.voa2));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 6",
				R.drawable.voa2));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 7",
				R.drawable.voa1));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 8",
				R.drawable.voa2));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 9",
				R.drawable.voa2));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 10",
				R.drawable.voa1));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 11",
				R.drawable.voa2));
		lessons.add(new Lesson(
				"Luyện nghe tiếng Anh qua video VOA-Có phụ đề tiếng anh-Bài 12",
				R.drawable.voa2));
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
