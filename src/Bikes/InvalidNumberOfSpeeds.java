package Bikes;

public class InvalidNumberOfSpeeds extends RuntimeException{
    public InvalidNumberOfSpeeds(int n) {
        super("Unavailable speeds number");
        System.err.println(n + " is unavailable speeds number");
    }
}
