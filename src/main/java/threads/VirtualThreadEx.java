
package threads;

public class VirtualThreadEx {
    public static void main(String[] args) throws InterruptedException {
        var thread = Thread.startVirtualThread(() ->
           System.out.println("Hello from Thread!")
        );

        thread.join();
    }
}
