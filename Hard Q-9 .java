//Q-9

import java.util.*;

class Ex {
    public static void main(String args[]) {
        Ex m1 = new Ex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal: ");
        int dc = sc.nextInt();
        System.out.println(m1.find(dc));
    }

    int find(int dc) {    
        if (dc == 0)
            return 0;
        else
            return (dc % 2 + 10 * find(dc / 2));
    }

}
