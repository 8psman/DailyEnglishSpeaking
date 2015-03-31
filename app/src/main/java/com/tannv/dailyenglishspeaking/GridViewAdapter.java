package com.tannv.dailyenglishspeaking;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewAdapter extends ArrayAdapter<GridViewItem> {
	Activity activity = null;
	ArrayList<GridViewItem> arr = null;
	int layoutID;

	public GridViewAdapter(Activity activity, int layoutID,
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

			TextView tv = (TextView) convertView.findViewById(R.id.tvGridView);
			// Typeface face =
			// Typeface.createFromAsset(getContext().getAssets(),
			// "fonts/SHOWG.TTF");
			ImageView iv = (ImageView) convertView
					.findViewById(R.id.ivGridView);
			iv.setBackgroundResource(arr.get(position).image);
			// tv.setTypeface(face);
			tv.setText(arr.get(position).text + "");
		}
		return convertView;

	}
}
