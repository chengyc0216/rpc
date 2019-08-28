package com.yuhe.SimpleRPC.decorator;

import java.nio.ByteBuffer;

public class Client {

    public static void main(String[] args) {
//        Monkey monkey = new Monkey();
//        new Fish(new Bird(monkey)).move();

        ByteBuffer bb = ByteBuffer.allocate(6);
        bb.put((byte) 3);

        bb.position(0);
        bb.limit(1);

        byte bs =  bb.get();

        System.out.println(bb.get());



    }
}
