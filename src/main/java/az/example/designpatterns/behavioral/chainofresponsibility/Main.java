package az.example.designpatterns.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
      CargoCompany xCargo =  XCargo.getCargoCompany();
      xCargo.sendCargo(EnumCity.GUBA);
    }
}
