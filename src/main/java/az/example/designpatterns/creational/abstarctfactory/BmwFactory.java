package az.example.designpatterns.creational.abstarctfactory;

public class BmwFactory implements CarFactory {


    @Override
    public Car getCar(String carName, String modelName, String motor) {
        return new Bmw(carName, modelName, motor);
    }
}
