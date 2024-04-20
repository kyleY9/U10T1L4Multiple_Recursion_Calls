public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++) {
            int temp = fibonacci(i);
            System.out.print(temp + " ");
        }
    }

    private static int fibonacci(int x) {
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        // double recursive method call
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
