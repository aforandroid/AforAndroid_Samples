package com.ramya.imagebutton;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Image_Button extends Activity {
ImageButton ib;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image__button);
        ib=(ImageButton)findViewById(R.id.imageButton1);
        tv=(TextView)findViewById(R.id.textView1);
        ib.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setTextColor(Color.MAGENTA);
				tv.setText("IMAGE BUTTON CLICKED");
			}
        	
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.image__button, menu);
        return true;
    }
    
}
