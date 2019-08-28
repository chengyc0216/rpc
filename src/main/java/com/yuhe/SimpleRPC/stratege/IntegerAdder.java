package com.yuhe.SimpleRPC.stratege;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerAdder implements Combiner<AtomicInteger, AtomicInteger> {
    @Override
    public int combine(AtomicInteger x, AtomicInteger t) {
        return x.addAndGet(t.get());
    }
}
