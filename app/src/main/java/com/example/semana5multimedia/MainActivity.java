package com.example.semana5multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout Menu;

    TabItem tab1,tab2,tab3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Menu=findViewById(R.id.Menu);
        tab1=findViewById(R.id.inicio);
        tab2=findViewById(R.id.audio);
        tab3=findViewById(R.id.video);

        Menu.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getPosition()==0){
                    Intent siga = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(siga);
                }
                if(tab.getPosition()==1){
                    Intent siga = new Intent(MainActivity.this,ReproductorDeAudio.class);
                    startActivity(siga);
                }
                if(tab.getPosition()==2){
                    Intent siga = new Intent(MainActivity.this,ReproductorDeVideo.class);
                    startActivity(siga);
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
