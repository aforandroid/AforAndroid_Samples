package com.ramya.usingimageview;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends Activity {
Button img1,img2,img3;
ImageView imag;
TextView choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(Button)findViewById(R.id.button1);
        img2=(Button)findViewById(R.id.button2);
        img3=(Button)findViewById(R.id.button3);
        choose=(TextView)findViewById(R.id.textView1);
        imag=(ImageView)findViewById(R.id.imageView1);
        img1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				imag.setImageResource(R.drawable.im);
				choose.setText("You Have Selected Image 1");
			}     	
        });  
    img2.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View arg0) {
			imag.setImageResource(R.drawable.img);	
			choose.setText("You Have Selected Image 2");
		}     	
    });
    img3.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View arg0) {
			imag.setImageResource(R.drawable.i);
			choose.setText("You Have Selected Image 3");
		}     	
    });
}
}
