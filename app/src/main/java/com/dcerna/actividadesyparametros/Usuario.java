package com.dcerna.actividadesyparametros;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombre;
    private String telefono;
    private String correo;
    private String clave;

    public Usuario(String nombre, String telefono, String correo, String clave) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }
}
