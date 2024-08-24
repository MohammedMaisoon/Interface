public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();
        Payment bankTransferPayment = new BankTransferPayment();

        processTransaction(creditCardPayment, 100.00);
        processTransaction(payPalPayment, 200.00);
        processTransaction(bankTransferPayment, 300.00);
    }
    public static void processTransaction(Payment paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}