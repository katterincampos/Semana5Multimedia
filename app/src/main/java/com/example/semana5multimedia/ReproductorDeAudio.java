package com.example.semana5multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;

public class ReproductorDeAudio extends AppCompatActivity implements
        View.OnClickListener  {

    Button Iniciar, Parar;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor_de_audio);

        Iniciar = (Button)findViewById(R.id.Iniciar);
        Parar   = (Button)findViewById(R.id.Parar);
        mediaPlayer = MediaPlayer.create(this,R.raw.sound);

        Iniciar.setOnClickListener(this);
        Parar.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Iniciar:
                play();
                break;
            case R.id.Parar:
                stop();
                break;
        }
    }
    private void play(){
        mediaPlayer.start();
    }
    private void stop(){
        mediaPlayer.stop();
    }
}

