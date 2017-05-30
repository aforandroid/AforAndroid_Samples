package com.ramya.colors;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {
TextView t1;
EditText d1;
 protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    
     t1=(TextView)findViewById(R.id.textView1);
     d1=(EditText)findViewById(R.id.editText1);
     t1.setTextColor(Color.BLUE);
     d1.setBackgroundColor(Color.YELLOW);
}
}