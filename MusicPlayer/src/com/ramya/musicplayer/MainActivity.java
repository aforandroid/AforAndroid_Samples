package com.ramya.musicplayer;
import android.app.Activity; 
import android.media.MediaPlayer;
import android.os.Bundle; 
import android.os.Handler; 
import android.view.View;
import android.widget.Button; 
import android.widget.SeekBar; 
import android.widget.TextView; 
import android.widget.Toast; 
import java.util.concurrent.TimeUnit;
public class MainActivity extends Activity {   
	 Button play,pause,backw,forw;   
	 MediaPlayer mediaPlayer;   
	 double startTime = 0;   
	 double finalTime = 0;   
	 Handler myHandler = new Handler();;   
	 int forwardTime = 5000;   
	 int backwardTime = 5000;   
	 SeekBar seek;   
	 TextView front,end,playing;      
	 public static int oneTimeOnly = 0;   
	@Override   
	protected void onCreate(Bundle savedInstanceState) {      
		super.onCreate(savedInstanceState);      
		setContentView(R.layout.activity_main); 	
		pause=(Button)findViewById(R.id.pause);      
		play=(Button)findViewById(R.id.play);	
		backw=(Button)findViewById(R.id.backw);  
		forw=(Button)findViewById(R.id.forw);
		
		  end=(TextView)findViewById(R.id.end);      
		  front=(TextView)findViewById(R.id.front);  
		  playing=(TextView)findViewById(R.id.playing); 
		  
		  playing.setText("Now Playing : aforandroid.mp3");		  
		  mediaPlayer = MediaPlayer.create(this,R.raw.aforandroid);		  
		  seek=(SeekBar)findViewById(R.id.seekBar);      
		  seek.setClickable(false);      	  
		  play.setOnClickListener(new View.OnClickListener() {         
			  @Override         
			  public void onClick(View v) {            
				  Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();            
				  mediaPlayer.start();                        
				  finalTime = mediaPlayer.getDuration();            
				  startTime = mediaPlayer.getCurrentPosition();                        
				  if (oneTimeOnly == 0) {               
					  seek.setMax((int) finalTime);               
					  oneTimeOnly = 1;            }            
				  end.setText(String.format("%d min, %d sec",            
						  TimeUnit.MILLISECONDS.toMinutes((long) finalTime),            
						  TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -            
						  TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) finalTime)))           
						  );                        
				  front.setText(String.format("%d min, %d sec",            
						  TimeUnit.MILLISECONDS.toMinutes((long) startTime),            
						  TimeUnit.MILLISECONDS.toSeconds((long) startTime) -            
						  TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) startTime)))            );                        
				  seek.setProgress((int)startTime);           
				  myHandler.postDelayed(UpdateSongTime,100);                   
				  }     
			  });           
		  pause.setOnClickListener(new View.OnClickListener() {     
				  @Override      
				  public void onClick(View v) {  
					  Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();            
					  mediaPlayer.pause();                   
					  }   
				  }); 
		  forw.setOnClickListener(new View.OnClickListener() {        
			  @Override 
			  public void onClick(View v) {            
			  int temp = (int)startTime;                       
					  if((temp+forwardTime)<=finalTime){       
						  startTime = startTime + forwardTime;          
						  mediaPlayer.seekTo((int) startTime);
						  Toast.makeText(getApplicationContext(), "5 Seconds forword skipped",Toast.LENGTH_SHORT).show();            
					  }}      });          
		  backw.setOnClickListener(new View.OnClickListener() {        
			  @Override        
			  public void onClick(View v) {         
			int temp = (int)startTime;                        
			if((temp-backwardTime)>0){               
					  startTime = startTime - backwardTime;    
					  mediaPlayer.seekTo((int) startTime);  
					  Toast.makeText(getApplicationContext(), "5 Seconds backword skipped",Toast.LENGTH_SHORT).show();            
			 }         }      });      
 }      
	private Runnable UpdateSongTime = new Runnable() {
		 public void run() {     
		 startTime = mediaPlayer.getCurrentPosition(); 
		 front.setText(String.format("%d min, %d sec",
				 TimeUnit.MILLISECONDS.toMinutes((long) startTime),         
				 TimeUnit.MILLISECONDS.toSeconds((long) startTime) -         
				 TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) startTime))));         
		 seek.setProgress((int)startTime);         
		 myHandler.postDelayed(this, 100);      
		 }  
		 };
}
