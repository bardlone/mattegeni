package com.example.helloworld;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
 
public class ChooseLevelGradeOne extends Activity implements View.OnClickListener{
 
	Button buttonG1L1;
	Button buttonG1L2;
	Button buttonG1L3;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_level_grade_one);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
        buttonG1L1 = (Button) findViewById(R.id.buttonG1L1);
    	buttonG1L1.setOnClickListener(this);
    	buttonG1L2 = (Button) findViewById(R.id.buttonG1L2);
    	buttonG1L2.setOnClickListener(this);
    	buttonG1L3 = (Button) findViewById(R.id.buttonG1L3);
    	buttonG1L3.setOnClickListener(this);
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

private void ButtonClick1(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeOneLevelOne")); 
	}

private void ButtonClick2(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeOneLevelTwo")); 
	}

private void ButtonClick3(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeOneLevelThree")); 
	}

@Override
public void onClick(View v) {
	
	switch (v.getId()) {
	case R.id.buttonG1L1:
		ButtonClick1(1);
		break;
	case R.id.buttonG1L2:
		ButtonClick2(2);
		break;
	case R.id.buttonG1L3:
		ButtonClick3(3);
		break;
		}
}
		
	}
	
	
