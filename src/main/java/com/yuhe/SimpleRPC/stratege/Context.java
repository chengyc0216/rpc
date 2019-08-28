package com.yuhe.SimpleRPC.stratege;


public class Context {
    private Combiner combiner;

    public <T, R> void setCombiner(Combiner<T, R> combiner) {
        this.combiner = combiner;
    }

    public <T, R> int combine(T x, R t) {
        return combiner.combine(x, t);
    }
}
