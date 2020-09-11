package SchoolManagement;

public class InvalidPaymentException extends RuntimeException{

    public InvalidPaymentException(int n) {
        super("Invalid payment");
        System.err.println("Payment of "+n+" is unable to process");
    }
}
