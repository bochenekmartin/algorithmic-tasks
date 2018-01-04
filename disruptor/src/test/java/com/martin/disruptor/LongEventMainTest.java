package com.martin.disruptor;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class LongEventMainTest {

    @Test
    void runTheMagic() throws InterruptedException {
        int limit = 1500;

        LongEventMain.runTheDisruptorMagic(limit);

        assertEquals(limit * 2, LongEventMain.getResults().size());
    }
}