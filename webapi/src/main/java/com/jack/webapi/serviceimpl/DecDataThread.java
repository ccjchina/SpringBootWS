package com.jack.webapi.serviceimpl;

public class DecDataThread extends Thread {
    Counter counter;
    public DecDataThread(Counter counter){
        this.counter =counter;
    }
    @Override
    public void run(){
        for (int i =0;i<10000;i++){
            counter.dec();
        }
    }
}
