package az.example.solidprinciples.l;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new ElectricCar("Ford",1999);
        v.speedUp();
        v.slowDown();
        v.fuel();
    }
}
