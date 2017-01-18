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
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class Activity3 extends Activity{	
    
	private boolean flag_btn4_start=false;
	private boolean flag_btn5_start=false;
	private ToggleButton togglebutton;	
	private boolean flag_btn1_start=false;	
	private boolean flag_toggle=false;	
	private String[] array={"Start","Stop","Cut","Stop Cut"};
	private Toast tos;
	private String src = "rtmp://192.168.0.2/rtmp/live";
	private VideoView mVideoView; 
	
	TextView txv;
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {       
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }	
    @Override
	protected void onCreate(Bundle icicle)
	{
    	super.onCreate(icicle);
		setContentView(R.layout.page2);
		
        if (!LibsChecker.checkVitamioLibs(this))
            return; 
        mVideoView = (VideoView) findViewById(R.id.surface_view2);         
       // mVideoView.setVideoURI(Uri.parse(src));
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
		
        togglebutton = (ToggleButton) findViewById(R.id.togglebutton2);  
        togglebutton.setOnClickListener(new ToggleButton.OnClickListener() 
        {     
            public void onClick(View v) 
            {
            	if (flag_btn1_start==false) {            
            		    
            		mVideoView.setVideoURI(Uri.parse(src));
                    flag_toggle=!flag_toggle;
                }   
                // ����s�A���Q�I���ɭ��T�����ƥ�  
                else 
                {          
                	flag_toggle=!flag_toggle;    
                }      	
            }
        }); 	
        
		
        tos = Toast.makeText(this,"",Toast.LENGTH_SHORT);
	    tos.setGravity(Gravity.TOP, 0, 400);
        txv=(TextView) findViewById(R.id.txv2);
		Button btn4 = (Button) Activity3.this.findViewById(R.id.button04);
		final Button btn5 = (Button) Activity3.this.findViewById(R.id.button05);
		Button btn6 = (Button) Activity3.this.findViewById(R.id.button06);

		btn4.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				new SigninStop(this).execute();	
			        tos.setText(array[1]);         
			        tos.show();			        				
			}
		});

		btn5.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				if(flag_btn5_start==false)
				{
					 // �o�䰵start Button3���{��					 
					new SigninCut(this).execute();						
					tos.setText(array[2]);         
			        tos.show();
			        btn5.setText("stop cut");
					flag_btn5_start=!flag_btn5_start;//�o�����flag�����A
				}
				else
				{
					
					 //�o�䰵stop Button3���{��					 
			        new SigninStopcut(this).execute();				       
			        tos.setText(array[3]);         
			        tos.show();
			        btn5.setText("cut");
					flag_btn5_start=!flag_btn5_start;//�o�����flag�����A
				}
			}
		});
		btn6.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(Activity3.this, Activity1.class);
				Activity3.this.startActivity(intent);
			}
		});
	}
}
