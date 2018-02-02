package com.soundboard.dross;

import android.media.SoundPool;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundManager extends Activity{
	
	private Context pContext;
	private SoundPool sndPool;
	private float rate = 1.0f;
	private float masterVolume = 0.99f;
	private float leftVolume = 0.99f;
	private float rightVolume = 0.99f;
    private float balance = 0.5f;

	// Constructor, setup the audio manager and store the app context
	public SoundManager(Context appContext)
	{
	  sndPool = new SoundPool(16, AudioManager.STREAM_MUSIC, 100);
 	  pContext = appContext;
	}

	// Load up a sound and return the id
	public int load(int sound_id)
	{
		return sndPool.load(pContext, sound_id, 1);
	}

	// Play a sound
	public void play(int sound_id)
	{
		sndPool.play(sound_id, leftVolume, rightVolume, 1, 0, rate); 	
	}	
	
	public void setVolume(float vol)
	{
		masterVolume = vol;

	  leftVolume = masterVolume;
	  rightVolume = masterVolume;
	  
			  

	}

	public void setSpeed(float speed)
	{
		rate = speed; }

	public void setBalance(float balVal)
	{
		balance = balVal;

		// Recalculate volume levels
		setVolume(masterVolume);
	}



	// Free ALL the things!
	public void unloadAll()
	{
		sndPool.release();		
	}

}