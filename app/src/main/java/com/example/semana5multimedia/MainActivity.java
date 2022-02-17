package com.example.semana5multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout Menu;
    TabItem opciones1,opciones2,opciones3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Menu=findViewById(R.id.Menu);
        opciones1=findViewById(R.id.inicio);
        opciones2=findViewById(R.id.reprod_audio);
        opciones3=findViewById(R.id.reprod_video);

        Menu.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition()==0){
                    Intent siguiente=new Intent(MainActivity.this,MainActivity.class);

            }
                if (tab.getPosition()==1){
                    Intent siguiente=new Intent(MainActivity.this,ReproductorDeAudio.class);

                }

                if (tab.getPosition()==2){
                    Intent siguiente=new Intent(MainActivity.this,ReproductorDeVideo.class);

                }
            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}
