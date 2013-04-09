package org.example.ps.heart;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.util.Log;

public class MainActivity extends Activity {
	ImageView image;
	AnimationDrawable animation;
	Boolean CHANGER=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		animation = new AnimationDrawable();
		for(int i=0; i<1000; i=i+100){
			if(CHANGER){
				animation.addFrame(getResources().getDrawable(R.drawable.heart_bl), 100);
				CHANGER=false;
			}else{
				animation.addFrame(getResources().getDrawable(R.drawable.heart), 100);
				CHANGER=true;
			}
			Log.d("gsknsgnk",""+CHANGER);
			
		}
		        
        animation.setOneShot(false);
        
        ImageView imageAnim =  (ImageView) findViewById(R.id.imageView1);
        
        imageAnim.setBackgroundDrawable(animation);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){

        public void run(){

        animation.start();

        }
        }, 100);
        
    
           
		return true;
	}
	
	

}
