package org.example.SecureApp;

public class User {
    String nombre;
    String contrasena;
    public User(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }
}
