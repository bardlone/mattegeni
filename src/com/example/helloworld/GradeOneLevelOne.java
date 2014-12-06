package com.example.helloworld;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.System.*;

public class GradeOneLevelOne extends ActionBarActivity implements View.OnClickListener {
Button buttonsvar; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grade_one);
	    buttonsvar = (Button) findViewById(R.id.buttonsvar);
    	buttonsvar.setOnClickListener(this);
    
		Random randomGen = new Random();
		int maxValue = 5;
		int minValue = 1;
		int a = randomGen.nextInt(maxValue + minValue) + minValue;
		int b = randomGen.nextInt(maxValue + minValue) + minValue;
		int operator = (int)(Math.random()*2) + 1;
		final TextView mTextView = (TextView) findViewById(R.id.mytw);
		//mTextView.setText( +a +operator  +b +" ="); 
		
		if (operator == 1)

			 mTextView.setText(+a +"+" +b +"="); 
		
			 if (operator == 2) 

			mTextView.setText(+a +"-" +b +"=");
			 
		 
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gradeone, menu);
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
	
	private void ButtonClick(int n) {
		
		startActivity(new Intent("com.example.helloworld.CheckAnswersGradeOne")); 
		}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.buttonsvar:
			ButtonClick(11);
			break;
			
		}
	}
	
}