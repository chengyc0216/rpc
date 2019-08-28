package com.yuhe.SimpleRPC;

public class SayHelloServiceImpl {
    public String sayHello(String arg) {
        if (arg.equalsIgnoreCase("hello")) {
            return "hello received!";
        } else {
            return "bye!";
        }
    }
}
