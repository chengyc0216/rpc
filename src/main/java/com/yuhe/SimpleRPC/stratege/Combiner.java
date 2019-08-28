package com.yuhe.SimpleRPC.stratege;

public interface Combiner <T, R>{
    int combine(T x, R r);
}
