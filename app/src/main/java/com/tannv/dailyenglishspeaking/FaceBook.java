package com.tannv.dailyenglishspeaking;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class FaceBook extends Activity {

	private WebView browser;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facebook);
		browser = (WebView) findViewById(R.id.webView1);
		// https://www.facebook.com/
		// browser.loadUrl("https://www.facebook.com/groups/268153570054218/");
		browser.loadUrl("https://www.facebook.com/");
	}

}
