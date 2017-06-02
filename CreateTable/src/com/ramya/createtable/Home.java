package com.ramya.createtable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Home extends Activity {
    Button ins,del,upd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        ins=(Button)findViewById(R.id.insert);
        ins.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Home.this,Performing_Insert.class);
			startActivity(i);
			}     	
        });
        del=(Button)findViewById(R.id.delete);
        del.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg) {
				// TODO Auto-generated method stub
			Intent d=new Intent(Home.this,Performing_Delete.class);
			startActivity(d);
			}     	
        });
        upd=(Button)findViewById(R.id.update);
        upd.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Home.this,Performing_Insert.class);
			startActivity(i);
			}     	
        });
    }
    
}
