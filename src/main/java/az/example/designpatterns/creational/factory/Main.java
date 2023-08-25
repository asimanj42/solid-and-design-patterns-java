package az.example.designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar("mercedes", "S class", "v8");
        System.out.println(car1);
    }
}
