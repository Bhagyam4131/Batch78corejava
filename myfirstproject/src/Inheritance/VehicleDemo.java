package Inheritance;

class Vehicle {
    int speed = 50;

    void display() {
        System.out.println("speed: " + speed);
    }
}

class Car extends Vehicle {
    int speed = 100;

    @Override
    void display() {
        System.out.println("speed: " + speed);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle v = new Car();

        System.out.println("speed of " + v.speed);
        v.display();
    }
}
