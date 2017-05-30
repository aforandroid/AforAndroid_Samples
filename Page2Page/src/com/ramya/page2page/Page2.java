package com.ramya.page2page;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Page2 extends Activity {
Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        
        back=(Button)findViewById(R.id.topage1);
        back.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent n=new Intent(Page2.this,Page1.class);
				startActivity(n);
			}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.page1, menu);
        return true;
    }
    
}
