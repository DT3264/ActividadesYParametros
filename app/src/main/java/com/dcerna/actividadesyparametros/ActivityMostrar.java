package com.dcerna.actividadesyparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityMostrar extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        Intent intent = getIntent();
        Usuario usuario = (Usuario)intent.getSerializableExtra(ActivityRegistrar.MENSAJE_USUARIO);
        TextView txtNombre = findViewById(R.id.txtNombre);
        TextView txtTelefono = findViewById(R.id.txtTelefono);
        TextView txtCorreo = findViewById(R.id.txtCorreo);
        TextView txtClave = findViewById(R.id.txtClave);

        txtNombre.setText("Nombre:\n" + usuario.getNombre());
        txtTelefono.setText("Telefono:\n" +usuario.getTelefono());
        txtCorreo.setText("Correo: \n" +usuario.getCorreo());
        txtClave.setText("Clave: \n" +usuario.getClave());
    }

}