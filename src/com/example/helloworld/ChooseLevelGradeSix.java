// ChooseLevelGradeSix.java
package com.example.helloworld;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
 
public class ChooseLevelGradeSix extends Activity implements View.OnClickListener{			
 
	Button buttonG6L1;			
	Button buttonG6L2;			
	Button buttonG6L3;			
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_level_grade_six);			
        buttonG6L1 = (Button) findViewById(R.id.buttonG6L1);			
    	buttonG6L1.setOnClickListener(this);			
    	buttonG6L2 = (Button) findViewById(R.id.buttonG6L2);			
    	buttonG6L2.setOnClickListener(this);			
    	buttonG6L3 = (Button) findViewById(R.id.buttonG6L3);			
    	buttonG6L3.setOnClickListener(this);			
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
	
	startActivity(new Intent("com.example.helloworld.GradeSixLevelOne")); 			
	}

private void ButtonClick2(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeSixLevelTwo")); 			
	}
private void ButtonClick3(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeSixLevelThree")); 			
	}

@Override
public void onClick(View v) {
	
	switch (v.getId()) {
	case R.id.buttonG6L1:			
		ButtonClick1(1);
		break;
	case R.id.buttonG6L2:			
		ButtonClick2(2);
		break;
	case R.id.buttonG6L3:			
		ButtonClick3(3);
		break;
		}
}
		
	}
	
	
