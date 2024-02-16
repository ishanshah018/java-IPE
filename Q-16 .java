//Q-16

import java.util.*;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        int vc = 0;
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vc++;
            }
        }
        System.out.println("Number of vowels in the string: " + vc);
    }
}
