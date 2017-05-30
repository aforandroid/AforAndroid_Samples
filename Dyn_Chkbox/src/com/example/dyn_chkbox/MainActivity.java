package com.example.dyn_chkbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
Button btn;
CheckBox cb;
LinearLayout linout;
EditText edno,edtxt;
String no,txt;
int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        linout=(LinearLayout)findViewById(R.id.lay);
        edno=(EditText)findViewById(R.id.edno);
        edtxt=(EditText)findViewById(R.id.edtxt); 
        btn.setOnClickListener(this);
        }
    View.OnClickListener getOnClickDoSomething(final Button button) {
    	return new View.OnClickListener() {
    	public void onClick(View i) {
    		Toast.makeText(getApplicationContext(), "You Clicked:  " + button.getText().toString(), Toast.LENGTH_LONG).show();    	
    	}	   	
    };
    	}
    public void onClick(View t) {
    	if(t==btn){
    		no=edno.getText().toString().trim();
            txt=edtxt.getText().toString().trim();
            n=Integer.parseInt(no);
    		for(int x = 1; x < n+1; x++) {
    	        cb = new CheckBox(this);
		           cb.setText(txt+"" + x);
		           cb.setId(x);
		    	   cb.setOnClickListener(getOnClickDoSomething(cb));
		           linout.addView(cb);
		       }
    	}    
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
       return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }   
}
