package az.example.designpatterns.creational.abstarctfactory;

public interface CarFactory {

    public Car getCar(String carName, String modelName, String motor);
}
