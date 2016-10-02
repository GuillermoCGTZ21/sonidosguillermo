package com.example.el_me.sonidosguillermo;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer bobtoronja;
    MediaPlayer alarma5;
    MediaPlayer jielo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alarma5 = MediaPlayer.create(this, R.raw.alarma5);
        bobtoronja = MediaPlayer.create(this, R.raw.bobtoronja);
        jielo = MediaPlayer.create(this, R.raw.jielo);
    }

    public void playAudio(View view) {
        alarma5.start();
    }


    public void pauseAudio(View view) {
        alarma5.pause();
    }



    public void playAudio1 (View view) {bobtoronja.start();}


    public void pauseAudio1 (View view) {bobtoronja.pause();
    }

    public void playAudio2 (View view) {jielo.start();}


    public void pauseAudio2 (View view) {
        jielo.pause();}
}




