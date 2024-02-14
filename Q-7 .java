//Q-7 

import java.util.*;

class Ex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int m = sc.nextInt();
        int temp = m, r, n = m;

        double sum = 0;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        while (m > 0) {
            r = m % 10;
            sum = sum + (Math.pow(r, count));
            m = m / 10;
        }
        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not an Armstrong");
    }
}
