package com.example.make_call;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Make_call extends Activity {
Button but;
EditText txt;
String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_call);
        but=(Button)findViewById(R.id.button1);
        txt=(EditText)findViewById(R.id.editText1);
        but.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
			number=txt.getText().toString();
			Intent it=new Intent(Intent.ACTION_CALL);
			it.setData(Uri.parse("tel:"+number));
			startActivity(it);
			}       	
        });       
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.make_call, menu);
        return true;
    }    
}
