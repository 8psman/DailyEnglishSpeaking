package com.tannv.dailyenglishspeaking;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListeningOnlineAdapter extends BaseAdapter {

	private ArrayList<Lesson> lessons;
	private Activity context;

	public ListeningOnlineAdapter(Activity context) {
		this.context = context;
		lessons = new ArrayList<Lesson>();
		lessons.add(new Lesson("Luyện nghe tiếng Anh qua video VOA", R.drawable.voa));
		lessons.add(new Lesson("Luyện nghe tiếng Anh - 365 câu căn bản", R.drawable.image365bg));
		lessons.add(new Lesson("Luyện nghe tiếng Anh qua những bài hát hay", R.drawable.musicbg));
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
