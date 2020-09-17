package SchoolManagement;

public class InvalidNumberOfPTO extends RuntimeException{
    public InvalidNumberOfPTO() {
        System.err.println("Number of pto days is not accepted");
    }
}
