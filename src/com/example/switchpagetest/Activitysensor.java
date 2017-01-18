package com.example.switchpagetest;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activitysensor extends Activity implements SensorEventListener {
	
	int delay = 0;
	private SensorManager sm;
	private Sensor sr;
	private TextView txv;	
	private int flag = 1;
	
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.pagesensor);        
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        sr = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        txv = (TextView) findViewById(R.id.txv);        
        
        Button btns = (Button) Activitysensor.this.findViewById(R.id.buttonsensor);
        btns.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(Activitysensor.this, Activity1.class);
				Activitysensor.this.startActivity(intent);
			}
		});        
    }
       
    @Override
    public void onSensorChanged(SensorEvent event)
    
    {
    	float x=event.values[0];
        float y=event.values[1];
        float z=event.values[2];
        	
    	txv.setText(String.format(" x¶b  :  %1.3f\n y¶b  :  %1.3f\n z¶b  :  %1.3f",x,y,z));   
    	if(x>3 && y>-1 && z>5 )
    	{	
    		if(flag == 1)
	    	    {
	    	        new SigninBackward(this).execute();
	    	        flag = 0;         
	    	    }
    		else
	    		{
	    			if(delay>0)
	    				delay--;
	    			else
	    			{
	    				if(Math.abs(x)+Math.abs(y)+Math.abs(z)>32)
	    					delay=5;
	    			}
	    				
	    		}
    	}
    	else if(x<-3 && y>-1 && z>5)
    	{
    		if(flag == 1)
    	    {
    	        new SigninForward(this).execute();			
    	        flag = 0;
    	    }
    		else
    		{
    			if(delay>0)
    				delay--;
    			else
    			{
    				if(Math.abs(x)+Math.abs(y)+Math.abs(z)>32)
    					delay=5;
    			}
    				
    		}
    	}	
    	else if(x>-1 && y>3 && z>5)	
    	{
    		if(flag == 1)
    	    {    
    	        new SigninRight(this).execute();    		
    	        flag = 0;
    	    }
    		else
    		{
    			if(delay>0)
    				delay--;
    			else
    			{
    				if(Math.abs(x)+Math.abs(y)+Math.abs(z)>32)
    					delay=5;
    			}
    				
    		}
    	}
    	else if(x>-1 && y<-3 && z>5)	
    	{
    		if(flag == 1)
    	    {
    	        new SigninLeft(this).execute();    		
    	        flag = 0;
    	    }
    		else
    		{
    			if(delay>0)
    				delay--;
    			else
    			{
    				if(Math.abs(x)+Math.abs(y)+Math.abs(z)>32)
    					delay=5;
    			}
    				
    		}
    	}
    	else
    	{
    	    new SigninStopsensor(this).execute();
    	    flag = 1;
    	}	    	
    }

    @Override
    public void onAccuracyChanged(Sensor arg0, int arg1){}

    @Override
    protected void onResume()
    {
    	super.onResume();
    	sm.registerListener(this, sr, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause()
    {
    	super.onPause();
    	sm.unregisterListener(this);
    }
    
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
}
