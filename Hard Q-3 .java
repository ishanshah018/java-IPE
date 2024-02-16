//// Q-1

// import java.util.*;

// class Ex {
// public static void main(String args[]) {
// double perc;
// int temp = 0;

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter percentage: ");
// perc = sc.nextDouble();

// if (perc > 70) {
// System.out.println("Grade A");
// } else if (perc > 60 && perc <= 70) {
// System.out.println("Grade B");
// } else if (perc > 50 && perc <= 60) {
// System.out.println("Grade C");
// } else {
// System.out.println("Grade F");
// }

// }
// }

// //Q-2

// import java.util.*;

// class Ex {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int a, b, c;

// System.out.println("Enter nber 1: ");
// a = sc.nextInt();
// System.out.println("Enter nber 2: ");
// b = sc.nextInt();
// System.out.println("Enter nber 3: ");
// c = sc.nextInt();

// if (a > b) {
// if (a > c) {
// System.out.println(a + " is maximum nber");
// } else {
// System.out.println(c + " is maximum nber");
// }
// } else {
// if (b > c) {
// System.out.println(b + " is maximum nber");
// } else {
// System.out.println(c + " is maximum nber");
// }
// }
// }
// }

// //Q-3

// import java.util.*;

// class Ex {
// public static void main(String args[]) {
// char letter;

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Letter: ");
// letter = sc.next().charAt(0);
// switch (letter) {
// case 'a':
// case 'e':
// case 'i':
// case 'o':
// case 'u':
// case 'A':
// case 'E':

// case 'I':
// case 'O':
// case 'U':
// System.out.println("Entered letter is VOWEL.");
// break;
// default:
// System.out.println("Entered letter is COnSOnAnT.");
// }
// }
// }

// //Q-4

// import java.util.*;

// class Ex {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter N: ");
// int n = sc.nextInt();

// System.out.print("Enter the starting of the range: ");
// int st = sc.nextInt();

// System.out.print("Enter the end of the range: ");
// int end = sc.nextInt();

// System.out.print("Multiples of " + n + " within the range [" + st + ", " +
// end + "]: ");

// for (int i = st; i <= end; i++) {
// if (i % n == 0)
// System.out.print(i + " ");
// }
// }
// }

// //Q-5

// import java.util.*;

// class Ex {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int ec = 0;
// int oc = 0;

// System.out.println("Enter 10 nbers:");

// for (int i = 0; i < 10; i++) {
// int n = sc.nextInt();

// if (n % 2 == 0) {
// ec++;
// } else {
// oc++;
// }
// }

// System.out.println("nber of even nbers: " + ec);
// System.out.println("nber of odd nbers: " + oc);

// }
// }

// //Q-6

// import java.util.*;

// class Ex {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter number:");
// int n = sc.nextInt();

// boolean temp = false;

// for (int i = 2; i <= n / 2; ++i) {
// // condition for nonprime number
// if (n % i == 0) {
// temp = true;
// break;
// }
// }
// if (!temp)
// System.out.println(n + " is a prime number.");
// else
// System.out.println(n + " is not a prime number.");
// }
// }

// //Q-7

// import java.util.*;

// class Ex {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number ");
// int m = sc.nextInt();
// int temp = m, r, n = m;

// double sum = 0;
// int count = 0;
// while (n > 0) {
// n = n / 10;
// count++;
// }
// while (m > 0) {
// r = m % 10;
// sum = sum + (Math.pow(r, count));
// m = m / 10;
// }
// if (sum == temp)
// System.out.println("Armstrong");
// else
// System.out.println("Not an Armstrong");
// }
// }

// //Q-8

// import java.util.*;

// class Ex {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number of terms in the Fibonacci series: ");
// int n = sc.nextInt();

// int a = 0, b = 1;

// System.out.print("Fibonacci Series up to " + n + " terms: ");

// if (n >= 1) {
// System.out.print(a);
// }
// if (n >= 2) {
// System.out.print(", " + b);
// }

// for (int i = 3; i <= n; i++) {
// int sum = a + b;
// System.out.print(", " + sum);
// a = b;
// b = sum;
// }
// }
// }

// //Q-9

// import java.util.*;

// class Ex {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter number: ");
// int n = sc.nextInt();

// int i;
// int fd = 0, sum = 0;

// int ld = n % 10;

// while (n > 0) {
// fd = n % 10;
// n = n / 10;
// }
// sum = fd + ld;
// System.out.print("sum of first digit and last digit is =" + sum);
// }
// }

// //Q-14

// import java.util.*;

// class Ex {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter n :");
// int n = sc.nextInt();
// int x = 1;

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(x + " ");
// }
// x++;
// System.out.println();
// }
// }
// }

// //Q-16

// import java.util.*;

// public class Ex {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a string: ");
// String input = sc.nextLine();

// int vc = 0;
// for (char ch : input.toLowerCase().toCharArray()) {
// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
// vc++;
// }
// }
// System.out.println("Number of vowels in the string: " + vc);
// }
// }

// //Q-17

// import java.util.*;

// class Ex {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a");
// int a = sc.nextInt();
// System.out.println("Enter b");
// int b = sc.nextInt();

// a = a + b;
// b = a - b;
// a = a - b;

// System.out.println("Value of a after Swappin is " + a);
// System.out.println("Value of b after Swappin is " + b);
// }
// }

// //Q-18

// import java.util.*;

// class Ex {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter year: ");
// int a = sc.nextInt();

// if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
// System.out.println(a + " is a leap year.");
// } else {
// System.out.println(a + " is not a leap year.");
// }
// }
// }

// //Q-19

// import java.util.*;

// class Ex {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the value of N: ");
// int n = sc.nextInt();

// double sum = 0;
// double numerator = 1;
// double denominator = 3;

// for (int i = 0; i < n; i++) {
// sum += numerator / denominator;
// numerator += 2;
// denominator += 2;
// }

// System.out.println("Sum of the series up to the " + n + "th term: " + sum);
// }
// }

// HARD

// //Q-1

// import java.util.Scanner;

// class rectangle {
//     doube width;
//     double height;

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Width");
//         double width = sc.nextDouble();
//         System.out.println("Enter Height");
//         double height = sc.nextDouble();

//         rectangle r = new rectangle();
//         rectangle r1 = new rectangle(width, height);

//         double area = getArea();
//         double peri = getPerimeter();

//         System.out.println("Area of Rectangle is" + area());
//         System.out.println("Perimeter of Rectangle is" + peri());
//     }

//     rectangle() {

//     }

//     rectangle(double width, double height) {

//     }

//     double getArea() {
//         return width * height;
//     }

//     double getPerimeter() {
//         return 2 * (width + height);
//     }

// }

// //Q-3

import java.util.*;

class figure {
    double a;
    double b;

    figure() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        a = sc.nextInt();
        System.out.println("Enter B");
        b = sc.nextInt();
        // return 0;
    }

    double area() {
        return 0;
    }
}

class rectangle extends figure {
    double area() {
        return a * b;
    }
}

class triangle extends figure {
    double area() {
        return 0.5 * a * b;
    }
}

class main {
    public static void main(String[] args) {
        System.out.println("For Area of Triangle");
        triangle m1 = new triangle();
        double x = m1.area();
        System.out.println(x);

        System.out.println("For Area of Rectangle");
        rectangle m2 = new rectangle();
        double y = m2.area();
        System.out.println(y);
    }
}
