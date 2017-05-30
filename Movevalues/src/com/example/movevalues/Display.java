package com.example.movevalues;
 
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class Display extends Activity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.display);
 
        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.name);
        TextView abt = (TextView) findViewById(R.id.abt);
        name.setText(b.getCharSequence("name"));
        abt.setText(b.getCharSequence("about"));
    }
}
