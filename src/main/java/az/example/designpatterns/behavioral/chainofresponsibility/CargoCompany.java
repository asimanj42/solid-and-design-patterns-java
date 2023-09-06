package az.example.designpatterns.behavioral.chainofresponsibility;

public abstract class CargoCompany {

    private EnumCity currentCity;
    private CargoCompany nextCargoCompany;

    public CargoCompany(EnumCity currentCity){
        this.currentCity = currentCity;
    }

    public CargoCompany getNextCargoCompany() {
        return nextCargoCompany;
    }

    public CargoCompany setNextCargoCompany(CargoCompany nextCargoCompany) {
        this.nextCargoCompany = nextCargoCompany;
        return this;
    }

    public EnumCity getEnumCity() {
        return currentCity;
    }

    public void sendCargo(EnumCity targetCity) {
        writeComingCargoDetails(targetCity);
        if (getEnumCity().equals(targetCity)) {
            writeReceivedCargoDetails();
        } else if (getNextCargoCompany() != null) {
            getNextCargoCompany().sendCargo(targetCity);
        } else {
            writeErrorDetails( targetCity);
        }
    }

    private static void writeErrorDetails(EnumCity targetCity ) {
        System.out.println(targetCity+" office is not available");
    }

    private void writeReceivedCargoDetails() {
        System.out.println(getEnumCity().getCity() + " cargo company received");
    }

    private void writeComingCargoDetails(EnumCity city) {
        System.out.println(city.getCity() + " cargo is in " + getEnumCity().getCity());
    }
}
