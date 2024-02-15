//Q-1

import java.util.*;

class Ex {
    public static void main(String args[]) {
        double perc;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage: ");
        perc = sc.nextDouble();

        if (perc > 70) {
            System.out.println("Grade A");
        } else if (perc > 60 && perc <= 70) {
            System.out.println("Grade B");
        } else if (perc > 50 && perc <= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

    }
}
