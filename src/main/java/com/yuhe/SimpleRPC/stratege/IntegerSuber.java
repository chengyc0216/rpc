package com.yuhe.SimpleRPC.stratege;

public class IntegerSuber implements Combiner<Integer, Integer> {
    @Override
    public int combine(Integer x, Integer integer) {
        return x - integer;
    }
}
