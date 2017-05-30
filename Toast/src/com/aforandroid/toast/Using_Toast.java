package com.aforandroid.toast;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;



public class Using_Toast extends Activity{

	int numChecked = 0;

  protected void onCreate(Bundle savedInstanceState) {
    
    super.onCreate(savedInstanceState);
     
   setContentView(R.layout.activity_using__toast);
   int i;
   for (i = 0; i < 20; i++) {
       CheckBox ch = new CheckBox(this);
       ch.setTag(Integer.valueOf(i));
       ch.setText("CheckBox " + i);
       ch.setChecked(false);
       ch.setOnCheckedChangeListener(new OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (isChecked) {
                   numChecked++;
               } else {
                   numChecked--;
               }

               if (numChecked == 4) {
                   buttonView.setChecked(false);
                   numChecked--;
                   // fourth one selected, show your dialog
               }
           }
       });
   }
  }
}
