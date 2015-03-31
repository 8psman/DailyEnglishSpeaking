package com.tannv.dailyenglishspeaking;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends ListActivity {

	private ProgressDialog pDialog;

	// URL to get contacts JSON
	// private static String url =
	// "http://dailyenglishspeaking.bugs3.com/dailyenglishspeaking.txt";
	private static String url = "http://dailyenglishspeaking.bugs3.com/json3.txt";

	// JSON Node names
	private static final String TAG_CONTACTS = "contacts";
	private static final String TAG_ID = "id";
	private static final String TAG_TITLE = "title";
	private static final String TAG_CLICK = "click";
	private static final String TAG_GENDER = "gender";
	private static final String TAG_SAMPLE = "sample";
	private static final String TAG_ANSWER = "answer";
	private static final String TAG_URL = "txturl";

	// contacts JSONArray
	JSONArray contacts = null;

	// Hashmap for ListView
	ArrayList<HashMap<String, String>> contactList;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		contactList = new ArrayList<HashMap<String, String>>();

		ListView lv = getListView();

		AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
		
		
		// Listview on item click listener
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// getting values from selected ListItem
				String name = ((TextView) view.findViewById(R.id.name))
						.getText().toString();
				String cost = ((TextView) view.findViewById(R.id.email))
						.getText().toString();
				String description = ((TextView) view.findViewById(R.id.mobile))
						.getText().toString();
				String txtans = ((TextView) view.findViewById(R.id.txtans))
						.getText().toString();
				String txturl = ((TextView) view.findViewById(R.id.txturl))
						.getText().toString();

				// Starting single contact activity
				Intent in = new Intent(getApplicationContext(),
						SingleContactActivity.class);

				if (position == 0) {
					in.putExtra("id", "");
				}
				in.putExtra(TAG_TITLE, name);
				in.putExtra(TAG_CLICK, cost);
				in.putExtra(TAG_ANSWER, description);
				in.putExtra(TAG_GENDER, txtans);
				in.putExtra(TAG_URL, txturl);
				startActivity(in);

			}
		});

		// Calling async task to get json
		new GetContacts().execute();
	}

	/**
	 * Async task class to get json by making HTTP call
	 * */
	private class GetContacts extends AsyncTask<Void, Void, Void> {
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			// Showing progress dialog
			pDialog = new ProgressDialog(MainActivity.this);
			pDialog.setMessage("Please wait...");
			pDialog.setCancelable(false);
			pDialog.show();
		}

		@Override
		protected Void doInBackground(Void... arg0) {
			// Creating service handler class instance
			ServiceHandler sh = new ServiceHandler();

			// Making a request to url and getting response
			String jsonStr = sh.makeServiceCall(url, ServiceHandler.GET);

			Log.d("Response: ", "> " + jsonStr);

			if (jsonStr != null) {
				try {
					JSONObject jsonObj = new JSONObject(jsonStr);

					// Getting JSON Array node
					contacts = jsonObj.getJSONArray(TAG_CONTACTS);

					// looping through All Contacts
					for (int i = 0; i < contacts.length(); i++) {
						JSONObject c = contacts.getJSONObject(i);

						String id = c.getString(TAG_ID);
						String name = c.getString(TAG_TITLE);
						String email = c.getString(TAG_CLICK);
						String gender = c.getString(TAG_GENDER);
						String txturl = c.getString(TAG_URL);

						// Phone node is JSON Object
						JSONObject sample = c.getJSONObject(TAG_SAMPLE);
						String answer = sample.getString(TAG_ANSWER);
						// tmp hashmap for single contact
						HashMap<String, String> contact = new HashMap<String, String>();

						// adding each child node to HashMap key => value
						// contact.put(TAG_ID, id);
						contact.put(TAG_TITLE, name);
						contact.put(TAG_CLICK, email);
						contact.put(TAG_ANSWER, answer);
						contact.put(TAG_GENDER, gender);
						contact.put(TAG_URL, txturl);

						// adding contact to contact list
						contactList.add(contact);
					}
				} catch (JSONException e) {
					e.printStackTrace();
				}
			} else {
				Log.e("ServiceHandler", "Couldn't get any data from the url");
			}

			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			super.onPostExecute(result);
			// Dismiss the progress dialog
			if (pDialog.isShowing())
				pDialog.dismiss();
			/**
			 * Updating parsed JSON data into ListView
			 * */
			ListAdapter adapter = new SimpleAdapter(MainActivity.this,
					contactList, R.layout.list_item, new String[] { TAG_TITLE,
							TAG_CLICK, TAG_ANSWER, TAG_GENDER, TAG_URL },
					new int[] { R.id.name, R.id.email, R.id.mobile,
							R.id.txtans, R.id.txturl });
			setListAdapter(adapter);
		}

	}
}