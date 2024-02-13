//Q-2

import java.util.*;

class Ex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter number 1: ");
        a = sc.nextInt();
        System.out.println("Enter number 2: ");
        b = sc.nextInt();
        System.out.println("Enter number 3: ");
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is maximum number");
            } else {
                System.out.println(c + " is maximum number");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is maximum number");
            } else {
                System.out.println(c + " is maximum number");
            }
        }
    }
}
