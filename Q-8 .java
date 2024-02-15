//Q-8

import java.util.*;

class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        if (n >= 1) {
            System.out.print(a);
        }
        if (n >= 2) {
            System.out.print(", " + b);
        }

        for (int i = 3; i <= n; i++) {
            int sum = a + b;
            System.out.print(", " + sum);
            a = b;
            b = sum;
        }
    }
}
