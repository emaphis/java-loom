package threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * How many virtual threads can be created
 *
 * @author emaph
 */
public class DHowManyVirtualThreads {

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        var counter = new AtomicInteger();
        var barrier = new CyclicBarrier(100_000);
        var threads = IntStream.range(0, 100_000)
            .mapToObj(i -> Thread.ofVirtual().unstarted(() -> {
                try {
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException ex) {
                    throw new AssertionError(ex);
                }
            counter.incrementAndGet();
        })).toList();

        int i = 0;
        for (var thread : threads) {
            i++;
            if (i % 100 == 100)
                System.out.print(" " + i);
            thread.start();
        }
        for (var thread : threads) {
            thread.join();
        }
        System.out.println(counter);
    }
}
