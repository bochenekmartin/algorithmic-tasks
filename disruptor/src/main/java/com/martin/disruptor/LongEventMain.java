package com.martin.disruptor;

import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class LongEventMain {

    private static List<String> results = Collections.synchronizedList(new ArrayList<>());

    public static void handleEvent1(LongEvent event, long sequence, boolean endOfBatch) {
        results.add(event.toString());
//        System.out.println(event);
    }

    public static void handleEvent2(LongEvent event, long sequence, boolean endOfBatch) {
        results.add(event + " 2");
//        System.out.println(event + " 2");
    }

    public static void translate(LongEvent event, long sequence, ByteBuffer buffer) {
        event.set(buffer.getLong(0));
    }

    public static void main(String[] args) throws InterruptedException {
        new LongEventMain().runTheDisruptorMagic(1500L);
    }

    void runTheDisruptorMagic(long limit) throws InterruptedException {
        // Executor that will be used to construct new threads for consumers
        Executor executor = Executors.newCachedThreadPool();
//        ThreadFactory executor = Executors.defaultThreadFactory();

        // Specify the size of the ring buffer, must be power of 2.
        int bufferSize = 1024;

        // Construct the Disruptor
        Disruptor<LongEvent> disruptor = new Disruptor<>(LongEvent::new, bufferSize, executor);

        // Connect the handler
        disruptor.handleEventsWith(LongEventMain::handleEvent2).then(LongEventMain::handleEvent1);

        // Start the Disruptor, starts all threads running
        disruptor.start();

        // Get the ring buffer from the Disruptor to be used for publishing.
        RingBuffer<LongEvent> ringBuffer = disruptor.getRingBuffer();

        ByteBuffer bb = ByteBuffer.allocate(8);
        for (long l = 1; l <= limit; l++) {
            bb.putLong(0, l);
            ringBuffer.publishEvent(LongEventMain::translate, bb);
//            Thread.sleep(10);
        }

        //wait for events consumption
        Thread.sleep(100);
//        disruptor.halt();
//        disruptor.shutdown();
    }

    public List<String> getResults() {
        return results;
    }
}
