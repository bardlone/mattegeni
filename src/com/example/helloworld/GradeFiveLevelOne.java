// GradeFiveLevelOne.java
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



public class GradeFiveLevelOne extends ActionBarActivity implements View.OnClickListener { 			
Button buttonsvar; 
double answer;
Random randomGen = new Random();

// The variables needed to generate the
// tasks for the users to solve.
int maxValue  = 333;
int maxValue2 = 33;
int minValue2 = 10;
int maxValue3 = 333; 
int minValue3 = 100;
int maxValue4 = 3;
int minValue4 = 1;
int numOfDecimals = 2;

// Generating the numbers needed for the different tasks
// and generating what operator the random task will have.
double a = randomGen.nextInt(maxValue) / 100;
double b = randomGen.nextInt(maxValue) / 100;
int c = randomGen.nextInt(maxValue2 - minValue2) + minValue2;
int d = randomGen.nextInt(maxValue2 - minValue2) + minValue2;
int e = randomGen.nextInt(maxValue3 - minValue3) + minValue3;
int f = randomGen.nextInt(maxValue4 - minValue4) + minValue4;

int operator = (int)(Math.random()*4) + 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grade_five); 
	    buttonsvar = (Button) findViewById(R.id.buttonsvar);
    	buttonsvar.setOnClickListener(this);
    

		
		final TextView mTextView = (TextView) findViewById(R.id.mytw);
		//mTextView.setText( +a +operator  +b +" ="); 
		
		
		// Giving the user the task, depending on what
		// random operator that gets picked,
		// for the lower grades there will be no solutions with negative numbers,
		// so there is a check for that implemented.
		if (operator == 1) {
			mTextView.setText(+a +"+" +b +"=");
		}
		
		else if (operator == 2) {
			mTextView.setText(+a +"-" +b +"=");
		}	 

		else if (operator == 3) {
			mTextView.setText(+c +"*" +d +"=");	
		}
		
		else if (operator == 4) {
			mTextView.setText(+e +":" +f +"=");
		}

	}
	public double setAnswer() {
		if (operator == 1){
	
			answer = a+b;
		}
		
		else if ((operator == 2)) { 
	
			 answer = (a-b); 
		}
		
		else if (operator == 3){
			answer = c*d;
		}
		else if (operator == 4){
			double tempAnswer = e/f;
			answer = round(tempAnswer, numOfDecimals);
		}
		return answer;
				
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
		// Function to send the answer written by the user to the 
		// CheckAnswer class for that grade and level.
		EditText editText = (EditText)findViewById(R.id.skrivsvar);
        String text = editText.getText().toString();

             Intent myIntent = new Intent(view.getContext(),CheckAnswersGradeOneLevelOne.class);
             myIntent.putExtra("mytext",text);
             startActivity(myIntent);

	}
	
}
