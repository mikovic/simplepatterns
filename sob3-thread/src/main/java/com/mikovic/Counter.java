package src.main.java.com.mikovic;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    AtomicInteger counter;
    public Counter() {
        counter = new AtomicInteger();
    }
    void increase(){
        counter.incrementAndGet();
    }
}

