package com.ramya.buttonimagebutton; 

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Button_ImageButton extends Activity {
Button b;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button__image_button);
        b=(Button)findViewById(R.id.button1);
        t=(TextView)findViewById(R.id.textView1);
        b.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				t.setTextColor(Color.GREEN);
				t.setText("BUTTON IS CLICKED");				
			}       	
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.button__image_button, menu);
        return true;
    }   
}
