
package threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

/**
 * How many expensive platform threads can be crated.
 * @author emaph
 */
public class CHowManyPlatformThreads {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        var barrier = new CyclicBarrier(100_000);
        var threads = IntStream.range(0, 100_000)
                .mapToObj(i -> new Thread(() -> {
                    try {
                        barrier.await();
                    } catch (InterruptedException | BrokenBarrierException ex) {
                        throw new AssertionError(ex);
                    }
                })).toList();
        int i = 0;
        for (var thread: threads) {
            System.out.print(" " + i++);
            thread.start();
        }
        for (var thread: threads) {
            thread.join();
        }
    }
}
