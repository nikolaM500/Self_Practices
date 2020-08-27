package Constructor;

public class Salary {



    public static void main(String[] args) {
        SalaryCalculator sal1 = new SalaryCalculator(56,0.08,40);
        System.out.println(sal1);



        System.out.println(sal1.salary());

        sal1.raisePerHour(3);

        System.out.println(sal1.salary());

        System.out.println(sal1.hourlyRate);

        System.out.println(sal1.ifRaisePerHour(5));
        System.out.println(sal1.hourlyRate);




    }

}
