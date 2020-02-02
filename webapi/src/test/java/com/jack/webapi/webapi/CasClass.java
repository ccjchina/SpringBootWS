package com.jack.webapi.webapi;

import com.jack.webapi.serviceimpl.AddDataThread;
import com.jack.webapi.serviceimpl.Counter;
import com.jack.webapi.serviceimpl.DecDataThread;

public class CasClass {
        public static void main(String[] args) throws InterruptedException {
            Counter counter =new Counter();
            Thread addThread =new AddDataThread(counter);
            Thread decThread =new DecDataThread(counter);

            addThread.start();
            decThread.start();
            addThread.join();
            decThread.join();

            System.out.print(counter.getCount());

        }
}
