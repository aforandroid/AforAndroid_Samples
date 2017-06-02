package com.ramya.animatingimageview;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends Activity {
ImageView img;
Button bli,bou,clo,fad,mov,seq,slid,sliu,zooi,zooo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	img = (ImageView)findViewById(R.id.aforandroid);
    	bli=(Button)findViewById(R.id.blink);
    	bou=(Button)findViewById(R.id.bounce);
    	clo=(Button)findViewById(R.id.clokwise);
    	fad=(Button)findViewById(R.id.fade);
    	mov=(Button)findViewById(R.id.move);
    	seq=(Button)findViewById(R.id.sequential);
    	slid=(Button)findViewById(R.id.slidedown);
    	sliu=(Button)findViewById(R.id.slideup);
    	zooi=(Button)findViewById(R.id.zoomin);
    	zooo=(Button)findViewById(R.id.zoomout);
    	
    	bli.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			Animation ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
		    img.startAnimation(ani);	
			} 		
    	});   	
    	bou.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			Animation ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
		    img.startAnimation(ani);	
			}    		
    	});    	
    	clo.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			Animation ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
		    img.startAnimation(ani);	
			}    		
    	});   	
    	fad.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			Animation ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
		    img.startAnimation(ani);	
			}    		
    	});   	
    	mov.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			Animation ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
		    img.startAnimation(ani);	
			} 		
    	});
    	
    	seq.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			Animation ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential);
		    img.startAnimation(ani);	
			}   		
    	});
    	
    	slid.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			Animation ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
		    img.startAnimation(ani);	
			}   		
    	}); 
    	sliu.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			Animation ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
		    img.startAnimation(ani);	
			}   		
    	});
    	zooo.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			Animation ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
		    img.startAnimation(ani);	
			}   		
    	});
    	zooi.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			Animation ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
		    img.startAnimation(ani);	
			}   		
    	});	
}
}