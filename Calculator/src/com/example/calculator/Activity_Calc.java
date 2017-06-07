package com.example.calculator;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Activity_Calc extends Activity {
Button add,sub,mul,div;
EditText num1,num2;
int val1,val2,res;
TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout__calc);
        num1=(EditText)findViewById(R.id.editText1);
        num2=(EditText)findViewById(R.id.editText2);
        add=(Button)findViewById(R.id.button1); 
        sub=(Button)findViewById(R.id.button2);
        mul=(Button)findViewById(R.id.button3);
        div=(Button)findViewById(R.id.button4);
        ans=(TextView)findViewById(R.id.textView1);  
        add.setOnClickListener(new OnClickListener(){
 			@Override
 			public void onClick(View v) {
 				 String a=num1.getText().toString();
 		         String b=num2.getText().toString();		        
 		         val1=Integer.parseInt(a);
 		         val2=Integer.parseInt(b);
 				 res=val1+val2;
 				 ans.setText("ANSWER: "+String.valueOf(res)); 		
 				 }         	
         });
         sub.setOnClickListener(new OnClickListener(){
  			@Override
  			public void onClick(View v) {
  				 String a=num1.getText().toString();
  		         String b=num2.getText().toString();		        
  		         val1=Integer.parseInt(a);
  		         val2=Integer.parseInt(b);
  		         res=val1-val2; 	
				 ans.setText("ANSWER: "+String.valueOf(res)); 
				 }  				         	
          });
         mul.setOnClickListener(new OnClickListener(){
  			@Override
  			public void onClick(View v) {
  				 String a=num1.getText().toString();
  		         String b=num2.getText().toString();		        
  		         val1=Integer.parseInt(a);
  		         val2=Integer.parseInt(b);
  		         res=val1*val2;
				 ans.setText("ANSWER: "+String.valueOf(res)); 			
  			}      	
          });
         div.setOnClickListener(new OnClickListener(){
  			@Override
  			public void onClick(View v) {
  				 String a=num1.getText().toString();
  		         String b=num2.getText().toString();		        
  		         val1=Integer.parseInt(a);
  		         val2=Integer.parseInt(b);
  				res=val1/val2;
				 ans.setText("ANSWER: "+String.valueOf(res)); 			
  			}          	
          });
	}
}
