package com.example.progressbar;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ProgressBar extends Activity {
Button btn;
ProgressDialog pb;
int status=0;
Handler handler=new Handler();
long filesize=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
			pb=new ProgressDialog(v.getContext());
			pb.setCancelable(true);
			pb.setMessage("File is Loading....");
			pb.setProgressStyle(pb.STYLE_HORIZONTAL);
			pb.setProgress(0);
			pb.setMax(100);
			pb.show();
			status=0;
			filesize=0;
			new Thread(new Runnable(){
				public void run(){
					while (status<100){
						status= doOperation();
						try{
							Thread.sleep(1000);
							}catch(InterruptedException e)
							{
								e.printStackTrace();
								}
						handler.post(new Runnable(){
							public void run(){
								pb.setProgress(status);
							}
							});
					}
					if(status>=100){
						try{
							Thread.sleep(1000);
						}catch(InterruptedException e){
							e.printStackTrace();
							}
						pb.dismiss();
						}
				}
				
					}).start();
				}
			});
			}
    public int doOperation(){
    	while(filesize<=10000){
    		filesize++;
    		if(filesize==1000){
    			return 10;
    		}
    		else if(filesize==2000){
    				return 20;
    			}
    		else if(filesize==3000){
    					return 30;
    				}
    					else if(filesize==4000){
    						return 40;
    					}else{
    						return 100;
    					}
    	}
    	return 100;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.progress_bar, menu);
        return true;
    }    
}
