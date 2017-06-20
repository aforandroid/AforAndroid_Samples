package com.ramya.linearlayout;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends Activity {
Button btn;
ImageView imgv;
TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button1);
        imgv=(ImageView)findViewById(R.id.imageView1);
        txv=(TextView)findViewById(R.id.textView1);
        btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View r) {
			imgv.setBackgroundResource(R.drawable.ramyatech);
			txv.setText("Feeling Tech is Awesome!..");
			}       	
        });
    }  
}
