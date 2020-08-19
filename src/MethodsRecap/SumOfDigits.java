package MethodsRecap;


public class SumOfDigits {

    public static void main(String[] args) {

        String s = "a1b2c3";
        int sum = 0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)) {
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
    }
}
