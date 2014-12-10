// GradeOneLevelTwo.java
package com.example.helloworld;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GradeOneLevelTwo extends ActionBarActivity implements View.OnClickListener {
Button buttonsvar; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grade_one);
	    buttonsvar = (Button) findViewById(R.id.buttonsvar);
    	buttonsvar.setOnClickListener(this);
    	Typeface fontsvar1 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
    	buttonsvar.setTypeface(fontsvar1);
    	
    	TextView txt = (TextView) findViewById(R.id.textView5);
    	Typeface font = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
    	txt.setTypeface(font);
    	
    
    	// The variables needed to generate the
    	// tasks for the users to solve.
		Random randomGen = new Random();
		int maxValue = 9;
		int minValue = 5; 
		
		// Generating the numbers needed for the different tasks
		// and generating what operator the random task will have.
		int a = randomGen.nextInt(maxValue - minValue) + minValue;
		int b = randomGen.nextInt(maxValue - minValue) + minValue;
		int operator = (int)(Math.random()*2) + 1;
		final TextView mTextView = (TextView) findViewById(R.id.mytw);
		//mTextView.setText( +a +operator  +b +" =");
	 	
		// Giving the user the task, depending on what
		// random operator that gets picked,
		// for the lower grades there will be no solutions with negative numbers,
		// so there is a check for that implemented.
		if (operator == 1)
			
			 mTextView.setText(+a +"+" +b +"="); 
		
			 if ((operator == 2) && (a>b)) 

			mTextView.setText(+a +"-" +b +"=");
			 
			 if ((operator == 2) && (a<b))
				 
				 mTextView.setText (+b +"-" +a +"=");
		
		 
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
