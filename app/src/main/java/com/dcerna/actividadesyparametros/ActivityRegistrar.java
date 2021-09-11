package com.dcerna.actividadesyparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ActivityRegistrar extends AppCompatActivity {
    public static final String MENSAJE_USUARIO = "com.dcerna.actividadesyparametros.USUARIO";

    EditText editTextNombre;
    EditText editTextTelefono;
    EditText editTextCorreo;
    EditText editTextClave;
    Button btnRegistrar;
    Button btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextTelefono = findViewById(R.id.editTextTelefono);
        editTextCorreo = findViewById(R.id.editTextCorreo);
        editTextClave = findViewById(R.id.editTextClave);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnCancelar = findViewById(R.id.btnCancelar);

        btnRegistrar.setOnClickListener(view -> {
            String nombre = editTextNombre.getText().toString();
            String telefono = editTextTelefono.getText().toString();
            String correo = editTextCorreo.getText().toString();
            String clave = editTextClave.getText().toString();
            Usuario usuario = new Usuario(nombre, telefono, correo, clave);

            Intent intent = new Intent(this, ActivityMostrar.class);
            intent.putExtra(MENSAJE_USUARIO, usuario);
            startActivity(intent);

        });

        btnCancelar.setOnClickListener(view -> {
            super.onBackPressed();
        });
    }
}