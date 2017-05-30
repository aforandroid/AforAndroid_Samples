package com.ramya.page2page;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Page1 extends Activity {

	Button click;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        click=(Button)findViewById(R.id.topage2);
        click.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View a) {
				Intent i=new Intent(Page1.this,Page2.class);
				startActivity(i);
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
