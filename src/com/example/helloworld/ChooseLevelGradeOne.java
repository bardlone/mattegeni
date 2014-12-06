package com.example.helloworld;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
 
public class ChooseLevelGradeOne extends Activity implements View.OnClickListener{
 
	Button button8;
	Button button9;
	Button button10;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_level_grade_one);
        button8 = (Button) findViewById(R.id.button8);
    	button8.setOnClickListener(this);
    	button9 = (Button) findViewById(R.id.button9);
    	button9.setOnClickListener(this);
    	button10 = (Button) findViewById(R.id.button10);
    	button10.setOnClickListener(this);
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
	case R.id.button8:
		ButtonClick1(8);
		break;
	case R.id.button9:
		ButtonClick2(9);
		break;
	case R.id.button10:
		ButtonClick3(10);
		break;
		}
}
		
	}
	
	
