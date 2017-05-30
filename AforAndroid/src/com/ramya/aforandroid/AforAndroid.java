package com.ramya.aforandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RelativeLayout;

public class AforAndroid extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afor_android);
        
        RelativeLayout rl=(RelativeLayout)findViewById(R.id.activity_afor_android);
        rl.setBackgroundResource(R.drawable.image2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.afor_android, menu);
        return true;
    }
    
}
