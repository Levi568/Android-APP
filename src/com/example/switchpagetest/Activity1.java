package com.example.switchpagetest;

import io.vov.vitamio.LibsChecker;
import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Activity1 extends Activity
{	   	
	
	private ToggleButton togglebutton;	
	private boolean flag_btn1_start,flag_btn3_start=false;	
	private boolean flag_toggle=false;			
	private String[] array={"Forward","Backward","Right","Left","Stop","Start","Cut","Stop Cut"};
	private Toast tos;
	private String src = "rtmp://192.168.0.2/rtmp/live";
	private VideoView mVideoView; 
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}		
	public void Forward(View view){    
	      new SigninForward(this).execute();
	     // txv.setText("Forward");
	      tos.setText(array[0]);         
          tos.show();          
	   }	
	public void Backward(View view){    
	      new SigninBackward(this).execute();
	     // txv.setText("Backward");
	      tos.setText(array[1]);         
          tos.show();          
	   }	
	public void Right(View view){    
	      new SigninRight(this).execute(); 
	    //  txv.setText("Right");
	      tos.setText(array[2]);         
          tos.show();          
	   }	
	public void Left(View view){    
	      new SigninLeft(this).execute(); 
	    //  txv.setText("Left");
	      tos.setText(array[3]);         
          tos.show();          
	   }

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{		
		int id = item.getItemId();
		if (id == R.id.action_settings)
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
	protected void onCreate(Bundle icicle)
	{
		super.onCreate(icicle);
	    setContentView(R.layout.main1);	 
        if (!LibsChecker.checkVitamioLibs(this))
            return; 
        mVideoView = (VideoView) findViewById(R.id.surface_view);         
        //mVideoView.setVideoURI(Uri.parse(src));
        mVideoView.setMediaController(new MediaController(this));      
        mVideoView.requestFocus();	 
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() 
        {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) 
                {
					// optional need Vitamio 4.0
					mediaPlayer.setPlaybackSpeed(1.0f);
                }
        });
	    
	    tos = Toast.makeText(this,"",Toast.LENGTH_SHORT);
	    tos.setGravity(Gravity.TOP, 0, 400);
	    
	    togglebutton = (ToggleButton) findViewById(R.id.togglebutton1);  
        togglebutton.setOnClickListener(new ToggleButton.OnClickListener() 
        {     
            public void onClick(View v) 
            {
            	if (flag_btn1_start==false) {            
            		    
            		mVideoView.setVideoURI(Uri.parse(src));
                    flag_toggle=!flag_toggle;
                }   
                // 當按鈕再次被點擊時候響應的事件  
                else 
                {          
                	flag_toggle=!flag_toggle;    
                }      	
            }
        }); 	
        //////////////////////////////////////////////////////////////        
        Button btn1 = (Button) Activity1.this.findViewById(R.id.button01);
		Button btn2 = (Button) Activity1.this.findViewById(R.id.button02);
		final Button btn3 = (Button) Activity1.this.findViewById(R.id.button03);
		ImageButton btn0 = (ImageButton) Activity1.this.findViewById(R.id.button00);

		btn1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v)
			{
					new SigninStop(this).execute();				     
			        tos.setText(array[4]);				        
			        tos.show();				
			}
		});
		btn2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				
				Intent intent = new Intent();
				intent.setClass(Activity1.this, Activity2.class);
				Activity1.this.startActivity(intent);
				
			}
		});
		btn3.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				//Intent intent = new Intent();
				//intent.setClass(Activity1.this, package2.Activity3.class);
				//Activity1.this.startActivity(intent);				
				if(flag_btn3_start==false)
				{
					// 這邊做start Button3的程式					
					new SigninCut(this).execute();
					//txv.setText("  Cut");
					tos.setText(array[6]);					
			        tos.show();
			        btn3.setText("stop cut");
					flag_btn3_start=!flag_btn3_start;//這行改變flag的狀態
				}
				else
				{
					// 這邊做stop Button3的程式					 
				    new SigninStopcut(this).execute();
				   // txv.setText(" Stop cut");
				    tos.setText(array[7]);				    
			        tos.show();
			        btn3.setText("cut");
					flag_btn3_start=!flag_btn3_start;//這行改變flag的狀態
				}
			}
		});
		btn0.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(Activity1.this, Activitysensor.class);
				Activity1.this.startActivity(intent);
				finish();
			}
		});
		
	}
}
