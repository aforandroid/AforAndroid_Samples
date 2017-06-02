package com.ramya.createtable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Performing_Insert extends Activity {
    private SQLiteDatabase db;
    Button insbtn;
     EditText pos;
     EditText des;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert);
        createDatabase();
        pos = (EditText) findViewById(R.id.edpost);
        des = (EditText) findViewById(R.id.eddes);
        insbtn=(Button)findViewById(R.id.maketable);
        insbtn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg) {
				// TODO Auto-generated method stub
				insertIntoDB();
				Toast.makeText(getApplicationContext(), "VALUES INSERTED", Toast.LENGTH_LONG).show();
			}     	
        });
    }
    protected void createDatabase(){
        db=openOrCreateDatabase("AFORANDROID", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS MYTABLE(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, POST VARCHAR,DESCRIPTION VARCHAR);");
    }
    protected void insertIntoDB(){   	
		String post = pos.getText().toString().trim();
        String description = des.getText().toString().trim();                
    if(post.equals("") || description.equals("")){
        Toast.makeText(getApplicationContext(),"Please fill all fields", Toast.LENGTH_LONG).show();
        return; 
	}   
    String query = "INSERT INTO MYTABLE (POST,DESCRIPTION) VALUES('"+post+"', '"+description+"');";
    db.execSQL(query);
 }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.create_dbtable, menu);
        return true;
    }    
}
