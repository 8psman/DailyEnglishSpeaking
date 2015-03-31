package com.tannv.dailyenglishspeaking;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Listening365Adapter extends BaseAdapter {

	private ArrayList<Lesson> lessons;
	private Activity context;

	public Listening365Adapter(Activity context) {
		this.context = context;
		lessons = new ArrayList<Lesson>();
		lessons.add(new Lesson(
				"Luyện Nghe Tiếng Anh - 365 câu căn bản (câu 1-13)",
				R.drawable.image365));
		lessons.add(new Lesson(
				"Luyện Nghe Tiếng Anh - 365 câu căn bản (câu 14-39)",
				R.drawable.image365));
		lessons.add(new Lesson(
				"Luyện Nghe Tiếng Anh - 365 câu căn bản (câu 40-62)",
				R.drawable.image365));
		lessons.add(new Lesson(
				"Luyện Nghe Tiếng Anh - 365 câu căn bản (câu 63-102)",
				R.drawable.image365));
		lessons.add(new Lesson(
				"Luyện Nghe Tiếng Anh - 365 câu căn bản (câu 103-148)",
				R.drawable.image365));
		lessons.add(new Lesson(
				"Luyện Nghe Tiếng Anh - 365 câu căn bản (câu 149-184)",
				R.drawable.image365));
		lessons.add(new Lesson(
				"Luyện Nghe Tiếng Anh - 365 câu căn bản (câu 185-207)",
				R.drawable.image365));
		lessons.add(new Lesson(
				"Luyện Nghe Tiếng Anh - 365 câu căn bản (câu 208-245)",
				R.drawable.image365));
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
