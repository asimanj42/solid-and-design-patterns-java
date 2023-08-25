package az.example.designpatterns.creational.abstarctfactory;

public class MercedesFactory implements CarFactory{


    @Override
    public  Car getCar(
            String carName, String modelName, String motor) {
        return new Mercedes(carName, modelName, motor);
    }
}
