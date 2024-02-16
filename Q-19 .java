//Q-19

import java.util.*;

class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        double sum = 0;
        double numerator = 1;
        double denominator = 3;

        for (int i = 0; i < n; i++) {
            sum += numerator / denominator;
            numerator += 2;
            denominator += 2;
        }

        System.out.println("Sum of the series up to the " + n + "th term: " + sum);
    }
}
