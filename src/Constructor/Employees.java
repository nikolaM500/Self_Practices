package Constructor;

public class Employees {

    public static void main(String[] args) {

        Employee e1 = new Employee("John","Smith","SDET",55,"e52f84",true);

        System.out.println(e1);
        e1.takesHome();
        e1.ifRaisePerHour(2);
        e1.effectiveHrPrice();


        System.out.println("==========================================");
        Employee e2 = new Employee("Jeremy","Parks","SDET",55,"e23th9",false);

        System.out.println(e2);
        e2.takesHome();
        e2.ifRaisePerHour(2);








    }

}
