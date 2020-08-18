package MethodsRecap;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter DateTimeFormat = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        System.out.println(now.format(DateTimeFormat));
    }
/*
 public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);

        System.out.println(today.format(dtf));
 */

}
