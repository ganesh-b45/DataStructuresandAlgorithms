import static java.lang.System.*;

public class FibbonaciRecursion {
    public static void main(String[] args) {
        int f1 = 0, f2 = 1, fib = 0;
        out.print(f1 + "\t" + f2 + "\t");
        for (int i = 1; i <= 10; i++) {
            fib = f1 + f2;
            out.print(fib + "\t");
            f1 = f2;
            f2 = fib;
        }
    }
}
