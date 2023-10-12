
package my.project.java.loom;

import static java.lang.Runtime.getRuntime;
import java.util.Properties;

/**
 * Utility program that prints out the JDK version information,
 * and machine version.s
 * @author emaph
 */
public class JavaLoomVersion {

    public static void main(String[] args) {
        findVersion();
        findCPU();
        System.out.println();
    }

    private static void findVersion() {
        System.out.println("******************** Hello, JDK ********************");
        Properties prop = System.getProperties();

        String version = prop.getProperty("java.version");
        String vendor = prop.getProperty("java.vendor");
        String date = prop.getProperty("java.version.date");
        System.out.println("Vendor:    " + vendor + " : " + version + " : " + date);

        String vm = prop.getProperty("java.vm.name");
        String vmversion = prop.getProperty("java.vm.version");
        System.out.println("Java VM:   " + vm + " : " + vmversion);

        String home = prop.getProperty("java.home");
        String path = prop.getProperty("user.dir");
        String temp = prop.getProperty("java.io.tmpdir");
        System.out.println("Java home: " + home);
        System.out.println("User dir:  " + path);
        System.out.println("Temp dir:  " + temp);
        System.out.println("****************************************************");
    }

    static void findCPU() {
        int cpus = getRuntime().availableProcessors();
        long mem = getRuntime().maxMemory() / (1024 * 1024);
        long max = getRuntime().totalMemory() / (1024 * 1024);
        long free = getRuntime().freeMemory();
        System.out.println("cpus=" + cpus + " mem=" + mem + " max=" + max + " free=" + free);
    }
}
