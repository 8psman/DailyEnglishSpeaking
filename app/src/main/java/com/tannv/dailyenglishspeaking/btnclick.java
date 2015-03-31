package com.tannv.dailyenglishspeaking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class btnclick extends Activity {

	Button btn_click;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.button_click);

		btn_click = (Button) findViewById(R.id.btn_click);

		btn_click.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

//				Intent myIntent = new Intent(btnclick.this,
//						HelloFacebookSampleActivity.class);
//				startActivity(myIntent);
			}
		});

	}
}
