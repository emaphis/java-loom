
package threads;

/**
 * Start a platform thread and a virtual thread.
 * @author emaph
 */
public class AStartingThread {
    public static void main(String[] args) throws InterruptedException {
        // platform threads
        var pthread = new Thread(() -> {
            System.out.println("platform" + Thread.currentThread());
        });
        pthread.start();
        pthread.join();

        // virtual threads
        var vthread = Thread.startVirtualThread(() -> {
             System.out.println("virtual " + Thread.currentThread());
        });
        vthread.join();

    }
}


/*
    Example output
    platformThread[#21,Thread-0,5,main]
    virtual VirtualThread[#22]/runnable@ForkJoinPool-1-worker-1
    */
