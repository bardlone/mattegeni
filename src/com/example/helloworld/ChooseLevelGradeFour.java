package com.example.helloworld;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
 
public class ChooseLevelGradeFour extends Activity implements View.OnClickListener{			
 
	Button buttonG4L1;			
	Button buttonG4L2;			
	Button buttonG4L3;			
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_level_grade_four);			
        buttonG4L1 = (Button) findViewById(R.id.buttonG4L1);			
    	buttonG4L1.setOnClickListener(this);			
    	buttonG4L2 = (Button) findViewById(R.id.buttonG4L2);			
    	buttonG4L2.setOnClickListener(this);			
    	buttonG4L3 = (Button) findViewById(R.id.buttonG4L3);			
    	buttonG4L3.setOnClickListener(this);			
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
	
	startActivity(new Intent("com.example.helloworld.GradeFourLevelOne")); 			
	}

private void ButtonClick2(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeFourLevelTwo")); 			
	}
private void ButtonClick3(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeFourLevelThree")); 			
	}

@Override
public void onClick(View v) {
	
	switch (v.getId()) {
	case R.id.buttonG4L1:			
		ButtonClick1(1);
		break;
	case R.id.buttonG4L2:			
		ButtonClick2(2);
		break;
	case R.id.buttonG4L3:			
		ButtonClick3(3);
		break;
		}
}
		
	}
	
	
