package com.soundboard.dross;

import java.io.IOException;

import android.app.Activity;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import com.google.android.gms.ads.*;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;



public class MainActivity extends Activity implements OnClickListener{ 
	
	SoundManager snd;
	OnClickListener buttonClick;
	  private AdView adView;	
	int maria, badgame, bola, bomba, huevo, chupa, razones, cono, conodemadre, conovale,
	drossculo, juegauno, bolivia, entremamas, aliens, gaste, vagina, jodete, malvinas,
	putaquetepario, malditarealidad, malditoobama, pija, cagodios, mierda, mueveteesclavo,
	negro, prostibularia, putosdemierda, retrasado, risa, meteculo, susto, totalcero, upa, verdad,
	verga, vergaparate;

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

		
	    AdView adView = (AdView)this.findViewById(R.id.adView);
	    AdRequest adRequest = new AdRequest.Builder()
	    .build();
	    adView.loadAd(adRequest);
	    snd = new SoundManager(getApplicationContext());
	    
	    
	    this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
	     maria = snd.load(R.raw.avemariaputisima);
	     badgame = snd.load(R.raw.badgame);
	     bola = snd.load(R.raw.boladevidrio);
	     bomba = snd.load(R.raw.bombaatomica);
	     huevo = snd.load(R.raw.cabezahuevo);
	     chupa = snd.load(R.raw.chupamela);
	     razones = snd.load(R.raw.cientotrecerazones);
	     cono = snd.load(R.raw.cono);
	     conodemadre = snd.load(R.raw.conodelamadre);
	     conovale = snd.load(R.raw.conovale);
	     drossculo = snd.load(R.raw.drossapretaculo);
	     juegauno = snd.load(R.raw.drossjuegaeluno);
	     bolivia = snd.load(R.raw.ejercitobolivia);
	     entremamas = snd.load(R.raw.entremasmelomamas);
	     aliens = snd.load(R.raw.extraterrestres);
	     gaste = snd.load(R.raw.gasteunpoder);
	     vagina = snd.load(R.raw.imperiovagina);
	     jodete = snd.load(R.raw.jodete);
	     malvinas = snd.load(R.raw.laguerramalvinas);
	     putaquetepario = snd.load(R.raw.laputaquetepario);
	     malditarealidad = snd.load(R.raw.malditarealidad);
	     malditoobama = snd.load(R.raw.malditoobama);
	     pija = snd.load(R.raw.masticanpija);
	     cagodios = snd.load(R.raw.mecagoendiosymesobramierda);
	     mierda = snd.load(R.raw.mierda);
	     mueveteesclavo = snd.load(R.raw.mueveteesclavo);
	     negro = snd.load(R.raw.negro);
	     prostibularia = snd.load(R.raw.prostibularia);
	     putosdemierda = snd.load(R.raw.putosdemierda);
	     retrasado = snd.load(R.raw.retrasadomental);
	     risa = snd.load(R.raw.risa);
	     meteculo = snd.load(R.raw.semeteneseculo);
	     susto = snd.load(R.raw.susto);
	     totalcero = snd.load(R.raw.totalcerop);
	     upa = snd.load(R.raw.upa);
	     verdad = snd.load(R.raw.verdaddd);
	     verga = snd.load(R.raw.verga);
	     vergaparate = snd.load(R.raw.vergaparate);
}
	public void clickHandler(View v)
	{
		int id = v.getId();
		switch (id) {
		case R.id.avemariaputisima:
			snd.play(maria);
			
			break;

		case R.id.badgame:
			snd.play(badgame);
			break;
		case R.id.boladevidrio:
			snd.play(bola);
			break;
		case R.id.bomba:
			snd.play(bomba);
			break;	
		case R.id.huevon:
			snd.play(huevo);
			break;		
		case R.id.chupamela:
			snd.play(chupa);
			break;		
		case R.id.razones:
			MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cientotrecerazones);
			mediaPlayer.start();
			break;		
		case R.id.cono:
			snd.play(cono);
			break;	
		case R.id.conodelamadre:
			snd.play(conodemadre);
			break;		
		case R.id.conovale:
			snd.play(conovale);
			break;		
		case R.id.drossapreta:
			snd.play(drossculo);
			break;		
		case R.id.drossjuegaeluno:
			snd.play(juegauno);
			break;		
		case R.id.bolivia:
			snd.play(bolivia);
			break;		
		case R.id.mueveteesclavo:
			snd.play(mueveteesclavo);
			break;		
		case R.id.ntremasmamas:
			snd.play(entremamas);
			break;		
		case R.id.aliens:
			MediaPlayer aliens = MediaPlayer.create(this, R.raw.extraterrestres);
			aliens.start();
			break;		
		case R.id.gaste:
			snd.play(gaste);
			break;		
		case R.id.vagina:
			snd.play(vagina);
			break;		
		case R.id.jodete:
			snd.play(jodete);
			break;		
		case R.id.guerramalvinas:
			snd.play(malvinas);
			break;		
		case R.id.putapario:
			snd.play(putaquetepario);
			break;		
		case R.id.malditarealidad:
			snd.play(malditarealidad);
			break;	
		case R.id.obama:
			snd.play(malditoobama);
			break;	
		case R.id.masticanpija:
			snd.play(pija);
			break;	
		case R.id.cagodios:
			snd.play(cagodios);
			break;	
		case R.id.mierda:
			snd.play(mierda);
			break;	
		case R.id.negro:
			snd.play(negro);
			break;	
		case R.id.prosti:
			snd.play(prostibularia);
			break;	
		case R.id.putosdemierda:
			snd.play(putosdemierda);
			break;	
		case R.id.retraso:
			snd.play(retrasado);
			break;	
		case R.id.risa:
			snd.play(risa);
			break;	
		case R.id.semeteneseno:
			snd.play(meteculo);
			break;	
		case R.id.susto:
			snd.play(susto);
			break;	
		case R.id.cero:
			MediaPlayer swag = MediaPlayer.create(this, R.raw.totalcerop);
			swag.start();
			break;	
		case R.id.upa:
			snd.play(upa);
			break;	
		case R.id.verdad:
			snd.play(verdad);
			break;	
		case R.id.verga:
			snd.play(verga);
			break;	
		case R.id.vergaparate:
			snd.play(vergaparate);
			break;	
			
			
			
		}
		
	}
	  @Override
	  public void onPause() {
	    super.onPause();
	  }
	  
	  @Override
	  public void onResume() {
	    super.onResume();
	  }


	  @Override
	  public void onDestroy() {
	    super.onDestroy();
	  }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	} } 
