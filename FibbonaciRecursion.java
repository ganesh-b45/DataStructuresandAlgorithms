import static java.lang.System.out;

public class FibbonaciRecursion {
    int f1 = 0, f2 = 1, fib = 0;

    public void fib(int n) {
        if (n >= 1) {
            fib = f1 + f2;
            out.print(fib + "\t");
            f1 = f2;
            f2 = fib;
            fib(n - 1);
        }
    }

    public static void main(String[] args) {

        FibbonaciRecursion obj = new FibbonaciRecursion();
        out.print(obj.f1 + "\t" + obj.f2 + "\t");
        obj.fib(10);
/*
        int f1 = 0, f2 = 1, fib = 0;
        out.print(f1 + "\t" + f2 + "\t");
        for (int i = 1; i <= 10; i++) {
            fib = f1 + f2;
            out.print(fib + "\t");
            f1 = f2;
            f2 = fib;
        }
*/
    }
}
