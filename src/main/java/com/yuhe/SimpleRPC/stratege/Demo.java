package com.yuhe.SimpleRPC.stratege;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCombiner(new IntegerAdder());
        System.out.println(context.combine(new AtomicInteger(8),new AtomicInteger(3)));

        context.setCombiner(new IntegerSuber());
        System.out.println(context.combine(new AtomicInteger(8), new AtomicInteger(2)));
    }
}
