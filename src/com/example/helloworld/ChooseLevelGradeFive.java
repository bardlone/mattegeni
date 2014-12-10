// ChooseLevelGradeFive.java
package com.example.helloworld;
 
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
 
public class ChooseLevelGradeFive extends Activity implements View.OnClickListener{			
 
	Button buttonG5L1;			
	Button buttonG5L2;			
	Button buttonG5L3;			
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_level_grade_five);			
        buttonG5L1 = (Button) findViewById(R.id.buttonG5L1);
    	buttonG5L1.setOnClickListener(this);
    	Typeface fontb1g5 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
    	buttonG5L1.setTypeface(fontb1g5);
    	buttonG5L2 = (Button) findViewById(R.id.buttonG5L2);
    	buttonG5L2.setOnClickListener(this);
    	Typeface fontb2g5 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
    	buttonG5L2.setTypeface(fontb2g5);
    	
    	buttonG5L3 = (Button) findViewById(R.id.buttonG5L3);
    	buttonG5L3.setOnClickListener(this);
    	Typeface fontb3g5 = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
    	buttonG5L3.setTypeface(fontb3g5);
    	
    	TextView txt = (TextView) findViewById(R.id.textView5);
    	Typeface font = Typeface.createFromAsset(getAssets(), "ARCHRISTY.ttf");
    	txt.setTypeface(font);
    				
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
	
	startActivity(new Intent("com.example.helloworld.GradeFiveLevelOne")); 			
	}

private void ButtonClick2(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeFiveLevelTwo")); 			
	}
private void ButtonClick3(int n) {
	
	startActivity(new Intent("com.example.helloworld.GradeFiveLevelThree")); 			
	}

@Override
public void onClick(View v) {
	
	switch (v.getId()) {
	case R.id.buttonG5L1:			
		ButtonClick1(1);
		break;
	case R.id.buttonG5L2:			
		ButtonClick2(2);
		break;
	case R.id.buttonG5L3:			
		ButtonClick3(3);
		break;
		}
}
		
	}
	
	
