package com.example.nfcbeam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;

public class ReceiveActivity extends Activity{
	
	private TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_receive);
		
		Intent intent = getIntent();
		String data = intent.getStringExtra("extra_data");
		textView=(TextView)findViewById(R.id.receive_text);
	    textView.setText(data);
		Log.d("ReceiveActivity", data);
	}

}
