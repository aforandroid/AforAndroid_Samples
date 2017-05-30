package com.ramya.ratingbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends Activity {
Button bt;
TextView tv;
RatingBar rbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.btrate);
        tv=(TextView)findViewById(R.id.rating);
        rbar=(RatingBar)findViewById(R.id.ratingBar1);
        bt.setOnClickListener(new OnClickListener(){        	  
            @Override  
            public void onClick(View arg0) {  
                String rating=String.valueOf(rbar.getRating());
                tv.setText(rating);
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