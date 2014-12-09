// ChooseLevelGradeSeven.java
package com.example.helloworld;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
 
public class ChooseLevelGradeSeven extends Activity implements View.OnClickListener{			//ENDRE HER
 
	Button buttonG7L1;			
	Button buttonG7L2;			
	Button buttonG7L3;			
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_level_grade_seven);			
        buttonG7L1 = (Button) findViewById(R.id.buttonG7L1);			
    	buttonG7L1.setOnClickListener(this);			
    	buttonG7L2 = (Button) findViewById(R.id.buttonG7L2);			
    	buttonG7L2.setOnClickListener(this);			
    	buttonG7L3 = (Button) findViewById(R.id.buttonG7L3);			
    	buttonG7L3.setOnClickListener(this);			
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
	
	startActivity(new Intent("com.example.helloworld.GradeSevenLevelOne")); 			
	}

private void ButtonClick2(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeSevenLevelTwo")); 			
	}
private void ButtonClick3(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeSevenLevelThree")); 			
	}

@Override
public void onClick(View v) {
	
	switch (v.getId()) {
	case R.id.buttonG7L1:			
		ButtonClick1(1);
		break;
	case R.id.buttonG7L2:			
		ButtonClick2(2);
		break;
	case R.id.buttonG7L3:			
		ButtonClick3(3);
		break;
		}
}
		
	}
	
	
