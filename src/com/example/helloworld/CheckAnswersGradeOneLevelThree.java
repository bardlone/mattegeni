// CheckAnswersGradeOneLevelThree.java
package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

public class CheckAnswersGradeOneLevelThree extends Activity implements View.OnClickListener {
	TextView mTextView;
	TextView aTextView; 
	Button buttonneste; 
	GradeOneLevelOne myclass = new GradeOneLevelOne();
	
	int answer = myclass.setAnswer();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grade_one_answers);
		buttonneste = (Button) findViewById(R.id.buttonneste);
	 	buttonneste.setOnClickListener(this);
	 	final TextView aTextView = (TextView) findViewById(R.id.mytw_two);
	 	aTextView.setText(" " +answer);
	 	
	 	mTextView = (TextView)findViewById(R.id.textView2);
        mTextView.setText(getIntent().getStringExtra("mytext")); 
       /*aTextView = (TextView)findViewById(R.id.textView3);
        aTextView.setText(getIntent().getStringExtra("answer")); 
        */
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.answers_grade_one, menu);
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
		
		startActivity(new Intent("com.example.helloworld.GradeOneLevelThree")); 
		}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonneste:
			ButtonClick(1);
			break;
		} 
	} 

} 	

