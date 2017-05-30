package com.example.checkbox_ex;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
TextView txt;
ImageButton ib;
CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.text);
        cb=(CheckBox)findViewById(R.id.checkBox1);
        ib=(ImageButton)findViewById(R.id.imageButton1);
        ib.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				if(cb.isChecked()){
					txt.setText("THANKS");
				}
			}       	
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }    
}
