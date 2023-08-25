package az.example.solidprinciples.l;

public abstract class Vehicle {

    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void speedUp(){
        System.out.println("Vehicle is speeding up");
    }

    public void slowDown(){
        System.out.println("Vehicle is slowing down");
    }

    public abstract void fuel();
}
