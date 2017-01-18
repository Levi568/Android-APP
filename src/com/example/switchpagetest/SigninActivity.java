package com.example.switchpagetest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import android.os.AsyncTask;
import android.view.View.OnClickListener;

public class SigninActivity  extends AsyncTask<String,Void,String>
{   	
   
    public SigninActivity(OnClickListener onClickListener){         
               
        }
    protected void onPreExecute(){ }
    
    @Override
    protected String doInBackground(String... arg0) 
    {
        try
            {                 
                String link="http://140.115.158.31:8080/start.php";                
                String data  = URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode("root", "UTF-8");
                       data += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode("raspberry", "UTF-8");
                       
                URL url = new URL(link);
                URLConnection conn = url.openConnection(); 
                conn.setDoOutput(true); 
                OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream()); 
                wr.write( data ); 
                wr.flush(); 
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line = null;
                // Read Server Response
                while((line = reader.readLine()) != null)
                {
                   sb.append(line);
                   break;
                }
                return sb.toString();
            }
        catch(Exception e)
            {
            return new String("Exception: " + e.getMessage());
            }
    }
}
