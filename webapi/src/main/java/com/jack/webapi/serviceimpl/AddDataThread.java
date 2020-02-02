package com.jack.webapi.serviceimpl;

public class AddDataThread extends Thread {
    Counter counter;
    public AddDataThread(Counter counter){
        this.counter =counter;
    }
    @Override
    public void run(){
        for (int i =0;i<10000;i++){
            counter.add();
        }
    }
}
