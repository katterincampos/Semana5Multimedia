package com.example.semana5multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReproductorDeAudio extends AppCompatActivity implements
        View.OnClickListener  {

    Button iniciar, parar;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor_de_audio);

        iniciar = (Button)findViewById(R.id.button);
        parar   = (Button)findViewById(R.id.button2);
        mediaPlayer = MediaPlayer.create(this,R.raw.heart);

        iniciar.setOnClickListener(this);
        parar.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                play();
                break;
            case R.id.button2:
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

