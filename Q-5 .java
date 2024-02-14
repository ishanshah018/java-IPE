//Q-5 

import java.util.*;

class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ec = 0;
        int oc = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                ec++;
            } else {
                oc++;
            }
        }

        System.out.println("Number of even numbers: " + ec);
        System.out.println("Number of odd numbers: " + oc);

    }
}
