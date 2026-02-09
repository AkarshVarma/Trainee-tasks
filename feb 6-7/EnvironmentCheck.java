public class EnvironmentCheck {

    public static void main(String[] args) {

       
        String javaVersion = System.getProperty("java.version");
        String jvmVendor   = System.getProperty("java.vendor");

        
        String osName      = System.getProperty("os.name");
        String osArch      = System.getProperty("os.arch");

        System.out.println("=== Runtime Environment Validation ===");
        System.out.println("Java Version   : " + javaVersion);
        System.out.println("JVM Vendor     : " + jvmVendor);
        System.out.println("Operating System: " + osName);
        System.out.println("OS Architecture: " + osArch);
    }
}