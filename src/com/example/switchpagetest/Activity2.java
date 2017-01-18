package com.example.switchpagetest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;

public class Activity2 extends Activity{    
	
	private int flag_b01,flag_b02,flag_b03,flag_b04,flag_b05,flag_b06,
			    flag_b07,flag_b08,flag_b09,flag_b10,flag_b11,flag_b12,
			    flag_b13,flag_b14,flag_b15,flag_b16,flag_b17,flag_b18,
			    flag_b19,flag_b20,flag_b21,flag_b22,flag_b23,flag_b24,
			    flag_b25,flag_b26,flag_b27,flag_b28,flag_b29,flag_b30,
			    flag_b31,flag_b32,flag_b33,flag_b34,flag_b35,flag_b36 = 0;
    private Button b01,b02,b03,b04,b05,b06,b07,b08,b09,b10,
			       b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,
			       b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,
			       b31,b32,b33,b34,b35,b36,bset,bsubmit;
	
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
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);	
		
		 b01 = (Button) findViewById(R.id.button1);
		 b02 = (Button) findViewById(R.id.button2);
		 b03 = (Button) findViewById(R.id.button3); 
		 b04 = (Button) findViewById(R.id.button4);
		 b05 = (Button) findViewById(R.id.button5); 
		 b06 = (Button) findViewById(R.id.button6);
		 b07 = (Button) findViewById(R.id.button7); 
		 b08 = (Button) findViewById(R.id.button8);
		 b09 = (Button) findViewById(R.id.button9);
		 b10 = (Button) findViewById(R.id.button10);
		 b11 = (Button) findViewById(R.id.button11);
		 b12 = (Button) findViewById(R.id.button12);
		 b13 = (Button) findViewById(R.id.button13);
		 b14 = (Button) findViewById(R.id.button14);
		 b15 = (Button) findViewById(R.id.button15);
		 b16 = (Button) findViewById(R.id.button16);
		 b17 = (Button) findViewById(R.id.button17);
		 b18 = (Button) findViewById(R.id.button18);
		 b19 = (Button) findViewById(R.id.button19);
		 b20 = (Button) findViewById(R.id.button20);
		 b21 = (Button) findViewById(R.id.button21);
		 b22 = (Button) findViewById(R.id.button22);
		 b23 = (Button) findViewById(R.id.button23);
		 b24 = (Button) findViewById(R.id.button24);
		 b25 = (Button) findViewById(R.id.button25);
		 b26 = (Button) findViewById(R.id.button26);
		 b27 = (Button) findViewById(R.id.button27);
		 b28 = (Button) findViewById(R.id.button28);
		 b29 = (Button) findViewById(R.id.button29);
		 b30 = (Button) findViewById(R.id.button30);
		 b31 = (Button) findViewById(R.id.button31);
		 b32 = (Button) findViewById(R.id.button32);
		 b33 = (Button) findViewById(R.id.button33);
		 b34 = (Button) findViewById(R.id.button34);
		 b35 = (Button) findViewById(R.id.button35);
		 b36 = (Button) findViewById(R.id.button36); 
		 bset= (Button) findViewById(R.id.buttonset);
		 bsubmit= (Button) findViewById(R.id.buttonsubmit);
		
		b01.setOnClickListener(new OnClickListener() 
        { 
        	  
    	     @Override
            public void onClick(View v) 
            { 
                if(flag_b01==0)
				{
                	new auto_button.button_1_1(this).execute();
                	b01.setBackgroundColor(android.graphics.Color.GREEN); 
					flag_b01=1;//這行改變flag的狀態
				}
				else
				{    					
				   b01.setBackgroundResource(android.R.drawable.btn_default);   
					flag_b01=0;//這行改變flag的狀態
				}                    
            }                 
        }); 
		
		b02.setOnClickListener(new OnClickListener() 
        { 
        	   
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b02==0)
    				{
                    	new auto_button.button_1_2(this).execute();
                    	b02.setBackgroundColor(android.graphics.Color.GREEN);
    					flag_b02=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b02.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b02=0;//這行改變flag的狀態
    				}                    
                }                 
        });  
		b03.setOnClickListener(new OnClickListener() 
        { 
        	     
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b03==0)
    				{
                    	new auto_button.button_1_3(this).execute();
                    	b03.setBackgroundColor(android.graphics.Color.GREEN); 
    					flag_b03=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b03.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b03=0;//這行改變flag的狀態
    				}                    
                }                 
        });  
        
        b04.setOnClickListener(new OnClickListener() 
        { 
        	  
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b04==0)
    				{
                    	new auto_button.button_1_4(this).execute();
                    	b04.setBackgroundColor(android.graphics.Color.GREEN); 
    					flag_b04=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b04.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b04=0;//這行改變flag的狀態
    				}                    
                }                 
        });  
        
        b05.setOnClickListener(new OnClickListener() 
        { 
        	   
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b05==0)
    				{
                    	new auto_button.button_1_5(this).execute();
                    	b05.setBackgroundColor(android.graphics.Color.GREEN); 
    					flag_b05=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b05.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b05=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 
		
        b06.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b06==0)
    				{
                    	new auto_button.button_1_6(this).execute();
                    	b06.setBackgroundColor(android.graphics.Color.GREEN); 
    					flag_b06=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b06.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b06=0;//這行改變flag的狀態
    				}                    
                }                 
        });  
        
        b07.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b07==0)
    				{
                    	new auto_button.button_2_1(this).execute();
                    	b07.setBackgroundColor(Color.GREEN); 
    					flag_b07=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b07.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b07=0;//這行改變flag的狀態
    				}                    
                }                 
        });  
        
        b08.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b08==0)
    				{
                    	new auto_button.button_2_2(this).execute();
                    	b08.setBackgroundColor(Color.GREEN); 
    					flag_b08=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b08.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b08=0;//這行改變flag的狀態
    				}                    
                }                 
        });

        b09.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b09==0)
    				{
                    	new auto_button.button_2_3(this).execute();
                    	b09.setBackgroundColor(Color.GREEN); 
    					flag_b09=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b09.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b09=0;//這行改變flag的狀態
    				}                    
                }                 
        });  

        b10.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b10==0)
    				{
                    	new auto_button.button_2_4(this).execute();
                    	b10.setBackgroundColor(Color.GREEN); 
    					flag_b10=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b10.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b10=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b11.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b11==0)
    				{
                    	new auto_button.button_2_5(this).execute();
                    	b11.setBackgroundColor(Color.GREEN); 
    					flag_b11=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b11.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b11=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b12.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b12==0)
    				{
                    	new auto_button.button_2_6(this).execute();
                    	b12.setBackgroundColor(Color.GREEN); 
    					flag_b12=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b12.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b12=0;//這行改變flag的狀態
    				}                    
                }                 
        });

        b13.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b13==0)
    				{
                    	new auto_button.button_3_1(this).execute();
                    	b13.setBackgroundColor(Color.GREEN);
    					flag_b13=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b13.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b13=0;//這行改變flag的狀態
    				}                    
                }                 
        });  

        b14.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b14==0)
    				{
                    	new auto_button.button_3_2(this).execute();
                    	b14.setBackgroundColor(Color.GREEN);
    					flag_b14=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b14.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b14=0;//這行改變flag的狀態
    				}                    
                }                 
        });  

        b15.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b15==0)
    				{
                    	new auto_button.button_3_3(this).execute();
                    	b15.setBackgroundColor(Color.GREEN);
    					flag_b15=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b15.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b15=0;//這行改變flag的狀態
    				}                    
                }                 
        });  

        b16.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b16==0)
    				{
                    	new auto_button.button_3_4(this).execute();
                    	b16.setBackgroundColor(Color.GREEN);
    					flag_b16=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b16.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b16=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b17.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b17==0)
    				{
                    	new auto_button.button_3_5(this).execute();
                    	b17.setBackgroundColor(Color.GREEN);
    					flag_b17=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b17.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b17=0;//這行改變flag的狀態
    				}                    
                }                 
        });  

        b18.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b18==0)
    				{
                    	new auto_button.button_3_6(this).execute();
                    	b18.setBackgroundColor(Color.GREEN);
    					flag_b18=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b18.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b18=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b19.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b19==0)
    				{
                    	new auto_button.button_4_1(this).execute();
                    	b19.setBackgroundColor(Color.GREEN);
    					flag_b19=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b19.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b19=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b20.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b20==0)
    				{
                    	new auto_button.button_4_2(this).execute();
                    	b20.setBackgroundColor(Color.GREEN);
    					flag_b20=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b20.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b20=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b21.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b21==0)
    				{
                    	new auto_button.button_4_3(this).execute();
                    	b21.setBackgroundColor(Color.GREEN);
    					flag_b21=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b21.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b21=0;//這行改變flag的狀態
    				}                    
                }                 
        });  

        b22.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b22==0)
    				{
                    	new auto_button.button_4_4(this).execute();
                    	b22.setBackgroundColor(Color.GREEN);
    					flag_b22=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b22.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b22=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b23.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b23==0)
    				{
                    	new auto_button.button_4_5(this).execute();
                    	b23.setBackgroundColor(Color.GREEN);
    					flag_b23=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b23.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b23=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b24.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b24==0)
    				{
                    	new auto_button.button_4_6(this).execute();
                    	b24.setBackgroundColor(Color.GREEN);
    					flag_b24=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b24.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b24=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

       b25.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b25==0)
    				{
                    	new auto_button.button_5_1(this).execute();
                    	b25.setBackgroundColor(Color.GREEN);
    					flag_b25=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b25.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b25=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b26.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b26==0)
    				{
                    	new auto_button.button_5_2(this).execute();
                    	b26.setBackgroundColor(Color.GREEN);
    					flag_b26=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b26.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b26=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 
        
        b27.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b27==0)
    				{
                    	new auto_button.button_5_3(this).execute();
                    	b27.setBackgroundColor(Color.GREEN);
    					flag_b27=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b27.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b27=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b28.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b28==0)
    				{
                    	new auto_button.button_5_4(this).execute();
                    	b28.setBackgroundColor(Color.GREEN);
    					flag_b28=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b28.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b28=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b29.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b29==0)
    				{
                    	new auto_button.button_5_5(this).execute();
                    	b29.setBackgroundColor(Color.GREEN);
    					flag_b29=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b29.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b29=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b30.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b30==0)
    				{
                    	new auto_button.button_5_6(this).execute();
                    	b30.setBackgroundColor(Color.GREEN);
    					flag_b30=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b30.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b30=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b31.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b31==0)
    				{
                    	new auto_button.button_6_1(this).execute();
                    	b31.setBackgroundColor(Color.GREEN);
    					flag_b31=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b31.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b31=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b32.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b32==0)
    				{
                    	new auto_button.button_6_2(this).execute();
                    	b32.setBackgroundColor(Color.GREEN);
    					flag_b32=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b32.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b32=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b33.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b33==0)
    				{
                    	new auto_button.button_6_3(this).execute();
                    	b33.setBackgroundColor(Color.GREEN);
    					flag_b33=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b33.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b33=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b34.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b34==0)
    				{
                    	new auto_button.button_6_4(this).execute();
                    	b34.setBackgroundColor(Color.GREEN);
    					flag_b34=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b34.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b34=0;//這行改變flag的狀態
    				}                    
                }                 
        });  
     
        b35.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b35==0)
    				{
                    	new auto_button.button_6_5(this).execute();
                    	b35.setBackgroundColor(Color.GREEN);
    					flag_b35=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b35.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b35=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 

        b36.setOnClickListener(new OnClickListener() 
        { 
        	 
        	     @Override
                public void onClick(View v) 
                { 
                    if(flag_b36==0)
    				{
                    	new auto_button.button_6_6(this).execute();
                    	b36.setBackgroundColor(Color.GREEN);
    					flag_b36=1;//這行改變flag的狀態
    				}
    				else
    				{    					
    					b36.setBackgroundResource(android.R.drawable.btn_default);   
    					flag_b36=0;//這行改變flag的狀態
    				}                    
                }                 
        }); 
		
		Button btn7 = (Button) Activity2.this.findViewById(R.id.buttoncancel);
	    Button btn8 = (Button) Activity2.this.findViewById(R.id.buttonfinish);	
		
		btn7.setOnClickListener(new Button.OnClickListener() 
		{
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(Activity2.this, Activity1.class);
				Activity2.this.startActivity(intent);
				
			}
		});
		btn8.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				
				Intent intent = new Intent();
				intent.setClass(Activity2.this, Activity3.class);
				Activity2.this.startActivity(intent);
		
				
			}
		});	
		bset.setOnClickListener(new Button.OnClickListener() 
		{
			@Override
			public void onClick(View v)
			{
				
				new auto_button.auto(this).execute();
			}
		});
		
		bsubmit.setOnClickListener(new Button.OnClickListener() 
		{
			@Override
			public void onClick(View v)
			{
				
				new auto_button.submit(this).execute();
			}
		});
	}	
}








