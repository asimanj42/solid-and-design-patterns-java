package az.example.solidprinciples.d;

public class Paypal implements PaymentInterface{
    @Override
    public void pay() {
        System.out.println("Paypal payment");
    }
}