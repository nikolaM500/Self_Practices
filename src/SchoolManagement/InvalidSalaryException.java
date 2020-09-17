package SchoolManagement;

public class InvalidSalaryException extends RuntimeException{

    public InvalidSalaryException() {
        super("Salary out of pay range");
        System.err.println("Salary out of bound for this position");
    }

    public InvalidSalaryException(double d){
        System.err.println(4 + "$ is out of bound for this position");
    }

}
