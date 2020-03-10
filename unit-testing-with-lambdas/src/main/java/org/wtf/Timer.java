package org.wtf;

public class Timer {

    private long start;

    void start() {
        start = System.currentTimeMillis();
    }

    long elapsed() {
        return System.currentTimeMillis() + start;
    }
}
