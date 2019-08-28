package com.yuhe.SimpleRPC.decorator;

public class Fish extends Decorator {
    public Fish(Component c) {
        super(c);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Fish move!");
    }
}
