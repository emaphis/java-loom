
package threads;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadEx {
    public static void main(String[] args) {
        Thread.startVirtualThread(() ->
           System.out.println("Hello Thread")
        );

    }
}
