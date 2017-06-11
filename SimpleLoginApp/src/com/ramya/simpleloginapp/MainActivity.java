package com.ramya.simpleloginapp;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
Button login;
EditText user,pass;
TextView txt,err;
String username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button)findViewById(R.id.button1);
        user=(EditText)findViewById(R.id.editText1);
        pass=(EditText)findViewById(R.id.editText2);
        txt=(TextView)findViewById(R.id.textView1);
        err=(TextView)findViewById(R.id.textView2);
        login.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View ar) {
				username=user.getText().toString().trim();
				password=pass.getText().toString().trim();
				if(username.equals("admin")&& password.equals("ramya")){
					Toast.makeText(getApplicationContext(), "USERNAME AND PASSWORD IS VALID.", Toast.LENGTH_LONG).show();
					Intent home=new Intent(MainActivity.this,HomePage.class);
					startActivity(home);
				}
				else
				{
				err.setTextColor(Color.RED);
				err.setText("INVALID USERNAME OR PASSWORD,PLEASE TRY AGAIN.");					
				}
			}        	
        });
    }   
}