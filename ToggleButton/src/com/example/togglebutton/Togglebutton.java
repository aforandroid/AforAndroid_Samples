package com.example.togglebutton;

import android.media.AudioManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class Togglebutton extends Activity {
ToggleButton tg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebutton);
       tg1=(ToggleButton)findViewById(R.id.toggleButton1);
       
tg1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
	
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		AudioManager aud = (AudioManager)getSystemService(Context.AUDIO_SERVICE);

		if(isChecked){
	aud.setRingerMode(AudioManager.RINGER_MODE_SILENT);
}
else
aud.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
	}
});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.togglebutton, menu);
        return true;
    }
    
}
