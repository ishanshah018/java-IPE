//Q-3

import java.util.*;

class Ex {
    public static void main(String args[]) {
        char letter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Letter: ");
        letter = sc.next().charAt(0);
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':

            case 'I':
            case 'O':
            case 'U':
                System.out.println("Entered letter is VOWEL.");
                break;
            default:
                System.out.println("Entered letter is CONSONANT.");
        }
    }
}
