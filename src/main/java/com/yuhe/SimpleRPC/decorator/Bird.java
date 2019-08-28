package com.yuhe.SimpleRPC.decorator;

public class Bird extends Decorator {
    public Bird(Component c) {
        super(c);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("bird move!");
    }

}
