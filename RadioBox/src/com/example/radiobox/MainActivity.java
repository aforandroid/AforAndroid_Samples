package com.example.radiobox;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
	 RadioGroup rdbird;	 
	 Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button1);
        rdbird=(RadioGroup)findViewById(R.id.rdbird);           
        btn.setOnClickListener(new OnClickListener(){       	
        	public void onClick(View v) {
        		RadioButton rad;
        		int selectedId=rdbird.getCheckedRadioButtonId();
        		rad=(RadioButton)findViewById(selectedId);
        		Toast.makeText(MainActivity.this, rad.getText(),Toast.LENGTH_LONG ).show();
        	}
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }    
}
