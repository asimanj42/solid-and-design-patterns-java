package az.example.designpatterns.creational.factory;

public class CarFactory {


    public static Car getCar(String carName,String modelName, String motor) {
        Car car;
        if (modelName.equalsIgnoreCase("Bmw")) {
            car = new Bmw(carName,modelName, motor);
        } else if (modelName.equalsIgnoreCase("Mercedes")) {
            car = new Mercedes(carName,modelName, motor);
        } else {
            throw new IllegalArgumentException("Invalid model name: " + modelName);
        }
        return car;
    }

}
