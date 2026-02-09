import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class JDKCheck {
    public static void main(String[] args) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        if (compiler == null) {
            System.out.println("JDK not detected");
        } else {
            System.out.println("JDK detected");
        }
    }
}
