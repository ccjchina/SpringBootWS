package com.jack.webapi.serviceimpl;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    AtomicInteger count =new AtomicInteger();
    public int getCount(){
        return  count.get();
    }

    public void add()
    {
        //count += 1;
        count.addAndGet(1);
    }
    public void dec() {
        //count -= 1;
        count.decrementAndGet();
    }
}