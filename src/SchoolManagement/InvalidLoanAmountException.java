package SchoolManagement;

public class InvalidLoanAmountException extends RuntimeException{
    public InvalidLoanAmountException(int n) {
        super("Unable to process requested amount");
        System.err.println("Amount of "+n+"$ is unavailable");
    }
}
