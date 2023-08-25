package az.example.solidprinciples.l;

public class PetrolCar extends Vehicle{
    public PetrolCar(String model, int year) {
        super(model, year);
    }

    @Override
    public void speedUp(){
        System.out.println("Petrol car is speeding up");
    }
    @Override
    public void slowDown(){
        System.out.println("Petrol car is slowing down");
    }

    @Override
    public void fuel() {
        System.out.println("Car is getting fuel");
    }
}
