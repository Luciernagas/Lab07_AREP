package org.example.AllSecureApp;

import static spark.Spark.*;
public class SparkAll {

    public static void main(String[] args) {
        final String url = "https://localhost:8080";
        port(getPort());
        staticFiles.location("/public");
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        secure("keystores/ecikeystore.p12", "123456", null, null);
        post("/login", (req, res) -> {
            String usuario = req.queryParams("username");
            String contrasena = req.queryParams("password");
            return URLReader.readURL(url + "/login?user=" + usuario + "&password=" + contrasena);
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
