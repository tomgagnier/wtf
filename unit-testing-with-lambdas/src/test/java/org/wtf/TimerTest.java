package org.wtf;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TimerTest {

    @Test
    void elapsedTime() {
        List<Long> times = new ArrayList<>(asList(100L, 200L));
        Timer      timer = new Timer(() -> times.remove(0));
        assertEquals(100, timer.elapsed());
    }
}
