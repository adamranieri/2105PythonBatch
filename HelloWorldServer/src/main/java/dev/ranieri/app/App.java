package dev.ranieri.app;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class App {

    public static void main(String[] args) {
        // Javalin is a micro framework for making web servers in Java
        // Java version of Flask. It functions VERY similarly. Just slight differences
        Javalin app = Javalin.create();

        // first param is the route, second param is a lambda/function to execute when that route is activated
        // similar to an event listener in JS
        app.get("/hello/:name", ctx ->{
            String name = ctx.pathParam("name");
            ctx.result("Hi you hit the hello end point =) " + name);
        });

        // define the function elsewhere
        Handler sayHola = ctx ->{
            ctx.result("Hola todos");
        };

        // pass the function as a callback
        app.get("/hola", sayHola);




        app.start();
    }
}
