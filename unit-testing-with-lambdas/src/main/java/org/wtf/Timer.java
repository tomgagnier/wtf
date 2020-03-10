package org.wtf;

import java.util.function.LongSupplier;

class Timer {

    private final LongSupplier currentTimeMillis;

    private long start;

    Timer(LongSupplier currentTimeMillies) {
        this.currentTimeMillis = currentTimeMillies;
    }

    void start() {
        start = currentTimeMillis.getAsLong();
    }

    long elapsed() {
        return currentTimeMillis.getAsLong() + start;
    }
}
