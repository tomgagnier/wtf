package org.wtf;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TimerTest {

    @Test void lifecycle() {
        List<Long> times = new ArrayList<Long>(asList(100L, 200L));

        Timer timer = new Timer(() -> {return times.remove(0);});

        timer.start();

        assertEquals(100, timer.elapsed());
    }
}
