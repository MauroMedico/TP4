public class FibonacciTest {

    public static void main(String[] args) {

        int serie = 10;

 System.out.println("Serie de Fibonacci de 10 numeros");
 System.out.println("-------------------------------");
        for (int i = 0; i < serie; i++) {

            System.out.println(fibonacciRecursivo(i));
        }
System.out.println("-------------------------------");
    }

    public static int fibonacciRecursivo(int n) {

        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;
        } else {

            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }

    }

}
