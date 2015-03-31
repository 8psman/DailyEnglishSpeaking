package com.tannv.dailyenglishspeaking;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonFullClassAdapter extends BaseAdapter {

	private ArrayList<Lesson> lessons;
	private Activity context;

	String topics;

	public LessonFullClassAdapter(Activity context) {
		this.context = context;
		lessons = new ArrayList<Lesson>();
		topics = "Friends";
		lessons.add(new Lesson("Bài học hằng tuần: Chủ đề " + topics,
				R.drawable.day));
		lessons.add(new Lesson("Học theo các chủ đề có sẵn", R.drawable.topic));
		lessons.add(new Lesson("Học nói mô tả cái gì đấy", R.drawable.describe));
		lessons.add(new Lesson("Các mẫu câu phỏng vấn và trả lời", R.drawable.interview));
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
