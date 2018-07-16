package com.martin.disruptor;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class LongEventMainTest {

    private LongEventMain underTest = new LongEventMain();

    @Test
    void runTheMagic() throws InterruptedException {
        //given
        int limit = 1500;
        assertTrue(underTest.getResults().isEmpty());

        //when
        underTest.runTheDisruptorMagic(limit);

        //then
        assertEquals(limit * 2, underTest.getResults().size());
    }
}