package az.example.solidprinciples.d;

public class Payoneer implements PaymentInterface{
    @Override
    public void pay() {
        System.out.println("Payoneer payment");
    }
}
