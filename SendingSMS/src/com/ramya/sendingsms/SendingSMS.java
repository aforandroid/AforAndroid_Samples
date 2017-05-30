package com.ramya.sendingsms;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendingSMS extends Activity {
Button send;
EditText num,mgs;
String number,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_sms);
        num=(EditText)findViewById(R.id.editText1);
        mgs=(EditText)findViewById(R.id.editText2);
        send=(Button)findViewById(R.id.button1);
        
        
        send.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View a) {
				number=num.getText().toString();
		        message=mgs.getText().toString();
			SmsManager sendsms=SmsManager.getDefault();
			sendsms.sendTextMessage(number, null, message, null, null);		
			}
        	
        }); 
        Toast.makeText(getApplicationContext(), "SMS Sent to "+number, Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sending_sm, menu);
        return true;
    }
    
}
