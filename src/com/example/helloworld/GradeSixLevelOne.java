package com.example.helloworld;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class GradeSixLevelOne extends ActionBarActivity implements View.OnClickListener { 			
Button buttonsvar; 
double answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grade_six); 
	    buttonsvar = (Button) findViewById(R.id.buttonsvar);
    	buttonsvar.setOnClickListener(this);
    
		Random randomGen = new Random();
		
		int maxValue  = 3333;
		int maxValue2 = 3333;
		int minValue2 = 1000;
		int maxValue3 = 33; 
		int minValue3 = 10;
		int numOfDecimals = 3;
		
		double a = randomGen.nextInt(maxValue) / 1000;
		double b = randomGen.nextInt(maxValue) / 1000;
		double c = randomGen.nextInt(maxValue) / 1000;
		int d = randomGen.nextInt(maxValue2 - minValue2) + minValue2;
		int e = randomGen.nextInt(maxValue3 - minValue3) + minValue3;
		
		int operator = (int)(Math.random()*4) + 1;
		
		final TextView mTextView = (TextView) findViewById(R.id.mytw);
		//mTextView.setText( +a +operator  +b +" ="); 
		
		if (operator == 1) {
			mTextView.setText(+a +"+" +b +"+" +c +"=");
			answer = a+b+c;
		}
		
		else if (operator == 2) {
			mTextView.setText(+a +"-" +b +"-" +c +"=");
			answer = a-b-c;
		}
			 

		else if (operator == 3) {
			mTextView.setText(+d +"*" +e +"=");
			answer = d*e;
		}

		else if (operator == 4) {
			mTextView.setText(+d +":" +e +"=");
			double tempAnswer = d/e;
			answer = round(tempAnswer, numOfDecimals);
		}

	}

	public static double round(double value, int places) {
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
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
