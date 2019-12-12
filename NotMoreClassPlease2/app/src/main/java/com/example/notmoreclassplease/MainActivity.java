package com.example.notmoreclassplease;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageButton buttonCale;
    ImageButton buttonBusc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCale = (ImageButton) findViewById(R.id.BotonCale);
        buttonBusc = (ImageButton) findViewById(R.id.BotonBusc);

        buttonCale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Calendario_activity.class);
                startActivity(i);
            }
        });

        buttonBusc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MainActivity.this,Buscador_activity.class);
                startActivity(e);
            }
        });


    }

}
