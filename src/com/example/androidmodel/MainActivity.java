package com.example.androidmodel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LinearLayout view = new LinearLayout(getApplicationContext());
		setContentView(view);
		view.setOrientation(1);
		Button button = new Button(getApplicationContext());
		button.setText("遍历一个view");
		view.addView(button);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), TraversalViewActivity.class);
				startActivity(intent);
			}
		});
		Button button1 = new Button(getApplicationContext());
		button1.setText("显示一个圆形图片");
		view.addView(button1);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), TraversalViewActivity.class);
				startActivity(intent);
			}
		});
	}
}
