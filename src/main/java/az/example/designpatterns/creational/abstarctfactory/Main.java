package az.example.designpatterns.creational.abstarctfactory;

public class Main {
    public static void main(String[] args) {
        MercedesFactory mercedesFactory = new MercedesFactory();
       Car car =  mercedesFactory.getCar("Mercedes","S class","v8");
        System.out.println(car);
    }
}
