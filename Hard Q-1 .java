//Q-1

import java.util.Scanner;

class rectangle {
    doube width;
    double height;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width");
        double width = sc.nextDouble();
        System.out.println("Enter Height");
        double height = sc.nextDouble();

        rectangle r = new rectangle();
        rectangle r1 = new rectangle(width, height);

        double area = getArea();
        double peri = getPerimeter();

        System.out.println("Area of Rectangle is" + area());
        System.out.println("Perimeter of Rectangle is" + peri());
    }

    rectangle() {

    }

    rectangle(double width, double height) {

    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

}
