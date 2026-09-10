
class Vehicle {

    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {

    @Override
    void display() {
        System.out.println("This is a car");
    }
}

class Bike extends Vehicle {

    @Override
    void display() {
        System.out.println("This is a bike");
    }
}

public class task5 {

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.display();

        v = new Bike();
        v.display();
    }
}