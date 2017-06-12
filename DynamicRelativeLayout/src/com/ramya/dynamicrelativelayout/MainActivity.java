package com.ramya.dynamicrelativelayout;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
public class MainActivity extends Activity {
	 RelativeLayout  layout;
	 CheckBox cb;
	 Button b,t,c,bt;
	 TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button2);
        t=(Button)findViewById(R.id.button3);
        c=(Button)findViewById(R.id.button1);
        layout=(RelativeLayout)findViewById(R.id.rel);
        cb = new CheckBox(this);
        cb.setId(1);
        cb.setText("NEW CHECKBOX");
        bt=new Button(this);
        bt.setId(2);
        bt.setText("NEW BUTTON");
        tv=new TextView(this);
        tv.setId(3);
        tv.setText("NEW TEXTVIEW");
        c.setOnClickListener(new OnClickListener(){
			@Override
		public void onClick(View v) {
		layout.removeAllViewsInLayout();
       	layout.addView(cb);
	}
});
        b.setOnClickListener(new OnClickListener(){
			@Override
		public void onClick(View v) {
		layout.removeAllViewsInLayout();
       	layout.addView(bt);
	}
});
        t.setOnClickListener(new OnClickListener(){
			@Override
		public void onClick(View v) {
		layout.removeAllViewsInLayout();
       	layout.addView(tv);
	}
});
    }
}
