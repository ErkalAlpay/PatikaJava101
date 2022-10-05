public class _54recursiveFibonacci {

    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
