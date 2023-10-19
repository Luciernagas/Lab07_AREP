package org.example.SecureApp;

import org.example.AllSecureApp.URLReader;

import java.util.HashMap;

import static spark.Spark.*;

public class SparkService {
    static HashMap<String,String> usuarios = new HashMap<>();
    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        //secure("keystores/ecikeystore.p12", "123456", null, null);
        get("/login", (req, res) -> {
            String usuario = req.queryParams("username");
            String contrasena = req.queryParams("password");
            boolean usuariovalido = autenticacion(usuario, contrasena);
            if(usuariovalido){
                return "<h1>Bienvenidx</h1><br></br>" + usuario + ":)";
            }
            return "Usuario no valido";
        });
    }

    private static boolean autenticacion(String usuario, String contrasena) {
        añadirUsuarios();
        if (usuarios.containsKey(usuario)){
            String contrasenaGuardada = usuarios.get(usuario);
            return contrasena.equals(contrasenaGuardada);
        }
        return false;
    }


    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

    private static void añadirUsuarios(){
        User user = new User("luisa","888");
        usuarios.put(user.getNombre(), user.getContrasena());
    }
}
