//Q-6

import java.util.*;

class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        boolean temp = false;
        
        for (int i = 2; i <= n / 2; ++i) {
            // condition for nonprime number
            if (n % i == 0) {
                temp = true;
                break;
            }
        }
        if (!temp)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}
