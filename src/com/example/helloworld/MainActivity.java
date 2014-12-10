// MainActivity.java
package com.example.helloworld;


import android.content.Intent;
import android.graphics.Typeface;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// The main activity class, startupscreen of the app, 


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
	
	//The buttons for the different grades, grades 1-7
	Button button1;		
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7; 
	public static double answertest;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	button1 = (Button) findViewById(R.id.button1);
	button1.setOnClickListener(this);
	Typeface fontb1 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
	button1.setTypeface(fontb1);
	button2 = (Button) findViewById(R.id.button2);
	button2.setOnClickListener(this);
	Typeface fontb2 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
	button2.setTypeface(fontb2);
	button3 = (Button) findViewById(R.id.button3);
	button3.setOnClickListener(this);
	Typeface fontb3 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
	button3.setTypeface(fontb3);
	button4 = (Button) findViewById(R.id.button4);
	button4.setOnClickListener(this);
	Typeface fontb4 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
	button4.setTypeface(fontb4);
	button5 = (Button) findViewById(R.id.button5);
	button5.setOnClickListener(this);
	Typeface fontb5 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
	button5.setTypeface(fontb5);
	button6 = (Button) findViewById(R.id.button6);
	button6.setOnClickListener(this);
	Typeface fontb6 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
	button6.setTypeface(fontb6);
	button7 = (Button) findViewById(R.id.button7);
	button7.setOnClickListener(this);
	Typeface fontb7 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
	button7.setTypeface(fontb7);
	TextView txt = (TextView) findViewById(R.id.textView1);
	Typeface font = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
	txt.setTypeface(font);
	TextView txt2 = (TextView) findViewById(R.id.textView2);
	Typeface font2 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
	txt2.setTypeface(font2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.main, menu);
	    return true;
		
	    /*MenuInflater inflater1 = getMenuInflater();
	    inflater1.inflate(R.menu.main, menu);
	    return super.onCreateOptionsMenu(menu);*/
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}

	/*
	 * The functions for each of the buttons, 
	 * to bring the user to the correct grade
	 */
	
	public void ButtonClick1(int n) {
		// Grade 1
		startActivity(new Intent("com.example.helloworld.ChooseLevelGradeOne"));
	}
	
	public void ButtonClick2(int n) {
		// Grade 2
		startActivity(new Intent("com.example.helloworld.ChooseLevelGradeTwo"));
	}
	public void ButtonClick3(int n) {
		// Grade 3
		startActivity(new Intent("com.example.helloworld.ChooseLevelGradeThree"));
		
	}

	public void ButtonClick4(int n) {
		// Grade 4
		startActivity(new Intent("com.example.helloworld.ChooseLevel"));
		
	}
	
	public void ButtonClick5(int n) {
		// Grade 5
		startActivity(new Intent("com.example.helloworld.ChooseLevel"));
		
	}
	
	public void ButtonClick6(int n) {
		// Grade 6
		startActivity(new Intent("com.example.helloworld.ChooseLevel"));
		
	}
	
	public void ButtonClick7(int n) {
		// Grade 7
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
