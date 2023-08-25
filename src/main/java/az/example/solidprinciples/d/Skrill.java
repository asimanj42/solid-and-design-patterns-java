package az.example.solidprinciples.d;

public class Skrill implements PaymentInterface{
    @Override
    public void pay() {
        System.out.println("Skrill payment");
    }
}