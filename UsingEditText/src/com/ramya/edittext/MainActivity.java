package com.ramya.edittext;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {
EditText name;
String n;
Button sub;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        sub=(Button)findViewById(R.id.button1);
        txt=(TextView)findViewById(R.id.textView1);      
        sub.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				n=name.getText().toString();
				txt.setText(n);
			}       	
        });                   
    }  
}
