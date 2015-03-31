package com.tannv.dailyenglishspeaking;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListViewAdapter extends ArrayAdapter<GridViewItem> {
	Activity activity = null;
	ArrayList<GridViewItem> arr = null;
	int layoutID;

	public ListViewAdapter(Activity activity, int layoutID,
			ArrayList<GridViewItem> arr) {
		super(activity, layoutID, arr);
		this.activity = activity;
		this.arr = arr;
		this.layoutID = layoutID;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = activity.getLayoutInflater();
		convertView = inflater.inflate(layoutID, null);
		if (convertView != null) {

			// // String str = arr[position];

			TextView tv = (TextView) convertView.findViewById(R.id.tvLv1);
			TextView tv1 = (TextView) convertView.findViewById(R.id.tvLv2);
			Typeface face = Typeface.createFromAsset(getContext().getAssets(),
					"fonts/SHOWG.TTF");
			// Thiết lập font cho TextView
			tv.setTypeface(face);
			tv.setText(arr.get(position).text + "");
			tv1.setText(arr.get(position).text + "");
		}
		return convertView;

	}
}
