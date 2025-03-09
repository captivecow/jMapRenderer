package io.github.captivecow;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class JMapRenderer {
    public static void main(String[] args) {
        Javalin server = Javalin.create(config -> {

            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(8080);
    }
}
