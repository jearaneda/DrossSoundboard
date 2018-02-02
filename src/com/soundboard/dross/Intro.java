package com.soundboard.dross;

import android.app.Activity;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;



public class Intro extends Activity{
	private long splashDelay = 20000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);
		
		TimerTask task = new TimerTask(){

			@Override
			public void run() {
Intent mainIntent = new Intent().setClass(Intro.this, MainActivity.class);
startActivity(mainIntent);
	finish();
			}
			};	
			Timer timer = new Timer();
		    timer.schedule(task, splashDelay);		
			}
	}


