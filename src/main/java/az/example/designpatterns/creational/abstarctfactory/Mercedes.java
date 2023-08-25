package az.example.designpatterns.creational.abstarctfactory;

public class Mercedes extends Car {

    private String carName;
    private String model;
    private String motor;

    public Mercedes(String carName, String model, String motor) {
        this.carName = carName;
        this.model = model;
        this.motor = motor;
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
    public String getCarName() {
        return carName;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "carName='" + carName + '\'' +
                ", model='" + model + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
