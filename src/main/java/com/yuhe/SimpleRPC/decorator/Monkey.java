package com.yuhe.SimpleRPC.decorator;

public class Monkey implements Component{
    @Override
    public void move() {
        System.out.println("monkey move!");
    }
}
