package com.aforandroid.simpletogglebutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
TextView txt;
ToggleButton tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.textView2);
        tb=(ToggleButton)findViewById(R.id.toggleButton1);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        	@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			if(isChecked){
				txt.setText("You turned me ON");
			}
			else{
				txt.setText("You turned me OFF");
			}
			}
		});
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }   
}
