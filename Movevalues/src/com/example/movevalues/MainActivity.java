package com.example.movevalues;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
 
public class MainActivity extends Activity {
    Button submit;
    EditText name;
    EditText about;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.submit);
        name = (EditText) findViewById(R.id.name);
        about = (EditText) findViewById(R.id.abt);

        submit.setOnClickListener(new OnClickListener(){
      	
    			@Override
			public void onClick(View v) {
			  	Intent intent = new Intent(getApplicationContext(), Display.class);
	            Bundle b = new Bundle();
	            b.putString("name", name.getText().toString());
	            b.putString("about", about.getText().toString());
	            intent.putExtras(b);
	            startActivity(intent);	
			}});
}
}
