package com.ramya.linearlayout2;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends Activity {
EditText num1,num2;
Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.editText1);
        num2=(EditText)findViewById(R.id.editText2);
        check=(Button)findViewById(R.id.button1);
        check.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View y) {
			int n1,n2;
			n1=Integer.parseInt(num1.getText().toString().trim());
			n2=Integer.parseInt(num2.getText().toString().trim());
			if(n1==n2){
				Toast.makeText(getApplicationContext(), "Values are equal", Toast.LENGTH_LONG).show();
			}
			}        	
        });
    }
}
