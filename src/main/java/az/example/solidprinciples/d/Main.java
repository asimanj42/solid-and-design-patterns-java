package az.example.solidprinciples.d;

public class Main {
    public static void main(String[] args) {
        PaymentController paymentController = new PaymentController(new Paypal());
        paymentController.payment();
    }
}
