package com.dcerna.actividadesyparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.btnRegistrar);
        boton.setOnClickListener(view -> {
            Intent intent = new Intent(this, ActivityRegistrar.class);
            startActivity(intent);
        });
    }
}