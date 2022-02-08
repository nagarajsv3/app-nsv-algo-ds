package com.nsv.jsmbaba.threadsafe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Counter {
    int count;

    //synchronized provides thread safety
    public synchronized void increment() throws InterruptedException {
        count++;
    }
}
