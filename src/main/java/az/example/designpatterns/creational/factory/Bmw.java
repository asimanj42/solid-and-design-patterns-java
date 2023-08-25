package az.example.designpatterns.creational.factory;

public class Bmw extends Car{

    private String carName;
    private String model;
    private String motor;

    public Bmw(String carName, String model, String motor) {
        this.carName = carName;
        this.model = model;
        this.motor = motor;
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getMotor() {
        return motor;
    }


    @Override
    public String toString() {
        return "Bmw{" +
                "carName='" + carName + '\'' +
                ", model='" + model + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
