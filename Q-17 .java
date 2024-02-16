//Q-17

import java.util.*;

class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a after Swappin is " + a);
        System.out.println("Value of b after Swappin is " + b);
    }
}
