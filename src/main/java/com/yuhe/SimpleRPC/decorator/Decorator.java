package com.yuhe.SimpleRPC.decorator;

public class Decorator implements Component {
    protected Component component;

    public Decorator(Component c) {
        component = c;
    }

    @Override
    public void move() {
        component.move();
    }
}
