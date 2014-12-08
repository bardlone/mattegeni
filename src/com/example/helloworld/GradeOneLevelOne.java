package com.example.helloworld;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

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
		int maxValue = 4;
		int minValue = 1;
		int a = randomGen.nextInt(maxValue + minValue) + minValue;
		int b = randomGen.nextInt(maxValue + minValue) + minValue;
		int operator = (int)(Math.random()*2) + 1;
		final TextView mTextView = (TextView) findViewById(R.id.mytw);
		//mTextView.setText( +a +operator  +b +" ="); 
		
		if (operator == 1)

			 mTextView.setText(+a +"+" +b +"="); 
		
			 if ((operator == 2) && (a>b)) 

			mTextView.setText(+a +"-" +b +"=");
			 
			 else if ((operator == 2) && (a<b))
			mTextView.setText(+b +"-" +a +"=");
			 
			
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
	
	

	@Override
	public void onClick(View view) {
		
		EditText editText = (EditText)findViewById(R.id.skrivsvar);
        String text = editText.getText().toString();

             Intent myIntent = new Intent(view.getContext(),CheckAnswersGradeOneLevelOne.class);
             myIntent.putExtra("mytext",text);
             startActivity(myIntent);
	}
	
}
