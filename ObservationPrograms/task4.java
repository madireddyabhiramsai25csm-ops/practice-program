
class Area {

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }
public class task4{
    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("Area of circle = " + a.area(7.0));
        System.out.println("Area of rectangle = " + a.area(10, 5));
        System.out.println("Area of triangle = " + a.area(10.0, 5.0));
    }
}
}