package com.example.splashscreen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Splash_screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                     Intent i=new Intent(Splash_screen.this,Home_page.class);
                    startActivity(i);
                    finish();
                } catch (Exception e) {
                 
                }
            }
        };
         
        t.start();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.splash_screen, menu);
        return true;
    }
    
}
