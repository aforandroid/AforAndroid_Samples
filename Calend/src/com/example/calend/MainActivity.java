package com.example.calend;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.CalendarView.OnDateChangeListener;

public class MainActivity extends Activity {
TextView txt;
	CalendarView calend;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calend = (CalendarView) findViewById(R.id.calendView);
txt=(TextView)findViewById(R.id.textView1);
        calend.setOnDateChangeListener(new OnDateChangeListener() {
         public void onSelectedDayChange(CalendarView view, int year,
           int month, int dayOfMonth) {
          // TODO Auto-generated method stub
        	 
        	 txt.setText(dayOfMonth + " / " + month + " / " + year);
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
