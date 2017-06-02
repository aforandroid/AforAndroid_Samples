package com.ramya.createtable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class CreateDBTable extends Activity {
    private SQLiteDatabase db;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_dbtable);
        btn=(Button)findViewById(R.id.maketable);
        btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg) {
				// TODO Auto-generated method stub
			createDatabase();
			Toast.makeText(getApplicationContext(), "TABLE CREATED", Toast.LENGTH_LONG).show();
			Intent i=new Intent(CreateDBTable.this,Home.class);
			startActivity(i);
			}     	
        });
    }
    protected void createDatabase(){
        db=openOrCreateDatabase("AFORANDROID", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS MYTABLE(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, POST VARCHAR,DESCRIPTION VARCHAR);");
    }
    
}
