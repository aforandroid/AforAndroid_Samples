package com.example.splashscreen;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.TextView;

public class Home_page extends Activity {
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.home_screen);
	       TextView t=(TextView)findViewById(R.id.textView1);
	       t.setTextColor(Color.LTGRAY);
	 }
	 public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.splash_screen, menu);
	        return true;
}
}
