package com.ramya.relativelayout;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends Activity {
Button bt;
EditText txt;
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(EditText)findViewById(R.id.editText1);
        bt=(Button)findViewById(R.id.button1);
        bt.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
			name=txt.getText().toString();
			Toast.makeText(getApplicationContext(), "Hi "+name+"!", Toast.LENGTH_LONG).show();
			}     	
        });
    }   
}
