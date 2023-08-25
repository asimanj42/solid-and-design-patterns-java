package az.example.solidprinciples.l;

public class ElectricCar extends Vehicle {
    public ElectricCar(String model, int year) {
        super(model, year);
    }

    @Override
    public void speedUp(){
        System.out.println("Electric car is speeding up");
    }
    @Override
    public void slowDown(){
        System.out.println("Electric car is slowing down");
    }

    @Override
    public void fuel() {
        System.out.println("Electric car is recharging");
    }


}
