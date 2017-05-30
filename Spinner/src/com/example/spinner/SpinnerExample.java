package com.example.spinner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerExample extends Activity implements 
AdapterView.OnItemSelectedListener {
	TextView txt;
String[] colors={"GREEN","RED","BLUE","YELLOW","BLACK","WHITE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        txt=(TextView)findViewById(R.id.textView2);
        Spinner spin=(Spinner)findViewById(R.id.spinner1);
        spin.setOnItemSelectedListener(this);
		ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,colors);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }
public void onItemSelected(AdapterView<?>args0,View arg1,int position,long id){
	txt.setText("Your favorite is: "+colors[position]);
}
public void onNothingSelected(AdapterView<?>args0){
	
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.spinner, menu);
        return true;
    }
    
}
