//Q-9

import java.util.*;

class Ex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int i;
        int fd = 0, sum = 0;

        int ld = n % 10;

        while (n > 0) {
            fd = n % 10;
            n = n / 10;
        }
        sum = fd + ld;
        System.out.print("sum of first digit and last digit is =" + sum);
    }
}
