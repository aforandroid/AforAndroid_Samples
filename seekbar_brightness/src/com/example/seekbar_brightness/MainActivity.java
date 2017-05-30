package com.example.seekbar_brightness;

import android.os.Bundle;
import android.provider.Settings.SettingNotFoundException;
import android.app.Activity;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
public class MainActivity extends Activity {
private SeekBar seek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seek = (SeekBar) findViewById(R.id.seekBar1);
        		seek.setMax(255);
        		float curBrightnessValue = 0;
        		try {
        		curBrightnessValue = android.provider.Settings.System.getInt(getContentResolver(),
        		android.provider.Settings.System.SCREEN_BRIGHTNESS);
        		} catch (SettingNotFoundException e) {
        		e.printStackTrace();
        		}
        		int screen_brightness = (int) curBrightnessValue;
        		seek.setProgress(screen_brightness);
        		seek.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){
        		int progress=0;
				@Override
				public void onProgressChanged(SeekBar seekBar, int progressValue,
						boolean fromUser) {
					// TODO Auto-generated method stub
					progress = progressValue;
				}
				@Override
				public void onStartTrackingTouch(SeekBar seekBar) {
					// TODO Auto-generated method stub					
				}
				@Override
				public void onStopTrackingTouch(SeekBar seekBar) {
					// TODO Auto-generated method stub
					android.provider.Settings.System.putInt(getContentResolver(),
				    		android.provider.Settings.System.SCREEN_BRIGHTNESS,progress);	
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
