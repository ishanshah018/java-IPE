//Q-4

import java.util.*;

class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter the starting of the range: ");
        int st = sc.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        System.out.print("Multiples of " + n + " within the range [" + st + ", " + end + "]: ");
        
        for (int i = st; i <= end; i++) {
            if (i % n == 0)
                System.out.print(i + " ");
        }
    }
}
