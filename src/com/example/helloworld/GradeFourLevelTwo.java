// GradeFourLevelTwo.java
package com.example.helloworld;

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



public class GradeFourLevelTwo extends ActionBarActivity implements View.OnClickListener { 			
Button buttonsvar; 
int answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grade_four); 
	    buttonsvar = (Button) findViewById(R.id.buttonsvar);
    	buttonsvar.setOnClickListener(this);
    
		Random randomGen = new Random();
		
		// The variables needed to generate the
		// tasks for the users to solve.
		int maxValue = 666;
		int minValue = 100;
		int maxValue2 = 66;
		int minValue2 = 10;
		int maxValue3 = 6; 
		int minValue3 = 1;
		
		// Generating the numbers needed for the different tasks
		// and generating what operator the random task will have.
		int a = randomGen.nextInt(maxValue  - minValue)  + minValue;
		int b = randomGen.nextInt(maxValue  - minValue)  + minValue;
		int c = randomGen.nextInt(maxValue2 - minValue2) + minValue2;
		int d = randomGen.nextInt(maxValue3 - minValue3) + minValue3;
		
		int operator = (int)(Math.random()*4) + 1;
		
		final TextView mTextView = (TextView) findViewById(R.id.mytw);
		//mTextView.setText( +a +operator  +b +" ="); 
		
		// Giving the user the task, depending on what
		// random operator that gets picked,
		// for the lower grades there will be no solutions with negative numbers,
		// so there is a check for that implemented.
		if (operator == 1) {
			mTextView.setText(+a +"+" +b +"=");
			answer = a+b;
		}
		
		else if (operator == 2) {
			mTextView.setText(+a +"-" +b +"=");
			answer = a-b;
		}
			 

		else if (operator == 3) {
			mTextView.setText(+c +"*" +d +"=");
			answer = c*d;
		}

		else if (operator == 4) {
			mTextView.setText(+c +":" +d +"=");
			answer = c/d;
		}

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
