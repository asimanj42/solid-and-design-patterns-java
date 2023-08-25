package az.example.solidprinciples.d;

public class PaymentController {

    private PaymentInterface paymentInterface;

    public PaymentController(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void payment() {
        this.paymentInterface.pay();
    }
}
