package com.ramya.animatingtextview;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends Activity {
	 Animation myAnimation;
	 TextView Text1,Text2,Text3,Text4,Text5;
	 Button btn;
	 ObjectAnimator animator;
	 Point size;
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_main);
	  Text1=(TextView)findViewById(R.id.text1);
	  Text2=(TextView)findViewById(R.id.text2);
	  Text3=(TextView)findViewById(R.id.text3);
	  Text4=(TextView)findViewById(R.id.text4);
	  Text5=(TextView)findViewById(R.id.text5);
	  Text1.setTextColor(Color.WHITE);
	  Text2.setTextColor(Color.WHITE);
	  Text3.setTextColor(Color.WHITE);
	  Text4.setTextColor(Color.WHITE);
	  Text5.setTextColor(Color.WHITE);
      btn=(Button)findViewById(R.id.btn);
	  myAnimation = AnimationUtils.loadAnimation(this, R.anim.animate);
	  btn.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View y) {
//Animating Text1..
			Text1.startAnimation(myAnimation);
			myAnimation.setDuration(1000/2);
//Animating Text2..
			animator = ObjectAnimator.ofInt(Text2, "textColor", Color.WHITE, Color.TRANSPARENT); 
			animator.setDuration(1000/2); 
			animator.setEvaluator(new ArgbEvaluator());     
            animator.setRepeatCount(ValueAnimator.INFINITE); 
            animator.setRepeatMode(ValueAnimator.REVERSE); 
            animator.start();
//Animating Text3..
		    Text3.setSelected(true);
//Animating Text4..
            Display display = getWindowManager().getDefaultDisplay();
       	 	size = new Point();
       	 	display.getSize(size);   
       	 	Text4.animate().translationY(size.y/2).withStartAction(new Runnable(){
       		 	public void run(){
       		 		Text4.animate().translationY(size.y/4).alpha(0.5f);
       	 }
       	 });		
		}		  
	  });	  
	 }	 
}

