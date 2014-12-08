package com.example.helloworld;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	button1 = (Button) findViewById(R.id.button1);
	button1.setOnClickListener(this);
	button2 = (Button) findViewById(R.id.button2);
	button2.setOnClickListener(this);
	button3 = (Button) findViewById(R.id.button3);
	button3.setOnClickListener(this);
	button4 = (Button) findViewById(R.id.button4);
	button4.setOnClickListener(this);
	button5 = (Button) findViewById(R.id.button5);
	button5.setOnClickListener(this);
	button6 = (Button) findViewById(R.id.button6);
	button6.setOnClickListener(this);
	button7 = (Button) findViewById(R.id.button7);
	button7.setOnClickListener(this);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void ButtonClick1(int n) {
		
		startActivity(new Intent("com.example.helloworld.ChooseLevelGradeOne"));
	}
	
public void ButtonClick2(int n) {
		
		startActivity(new Intent("com.example.helloworld.ChooseLevelGradeTwo"));
	}
public void ButtonClick3(int n) {
	
	startActivity(new Intent("com.example.helloworld.ChooseLevelGradeThree"));
}
public void ButtonClick4(int n) {
	
	startActivity(new Intent("com.example.helloworld.ChooseLevel"));
}
public void ButtonClick5(int n) {
	
	startActivity(new Intent("com.example.helloworld.ChooseLevel"));
}
public void ButtonClick6(int n) {
	
	startActivity(new Intent("com.example.helloworld.ChooseLevel"));
}
public void ButtonClick7(int n) {
	
	startActivity(new Intent("com.example.helloworld.ChooseLevel"));
}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.button1:
			ButtonClick1(1);
			break;
		case R.id.button2:
			ButtonClick2(2);
			break;
		case R.id.button3:
			ButtonClick3(3);
			break;
		case R.id.button4:
			ButtonClick4(4);
			break;
		case R.id.button5:
			ButtonClick5(5);
			break;
		case R.id.button6:
			ButtonClick6(6);
			break;
		case R.id.button7:
			ButtonClick7(7);
			break;
		}
	}
	
	
}
