
package my.project.java.loom;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emaph
 */
public class JavaLoomApp {
    static void example01() throws InterruptedException {
        Thread thread = Thread.ofVirtual().start(() -> System.out.println("Hello"));
        thread.join();
    }

    public static void main(String[] args) {
        System.out.println("I'm a Loom App");
        try {
            example01();
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaLoomApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
