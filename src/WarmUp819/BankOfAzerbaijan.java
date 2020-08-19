package WarmUp819;



import java.util.ArrayList;
import java.util.Random;

public class BankOfAzerbaijan {

    /*
    in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee info
     */
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        Random random = new Random();
        int number = random.nextInt(4);
        int number1 = random.nextInt(4);

        if (number==number1 && number+1<=4){
            number++;
        }else if (number==number1){
            number--;
        }

        switch (number){
            case 0:
                employeeList.add(HumanResources.e1);
                break;
            case 1:
                employeeList.add(HumanResources.e2);
                break;
            case 2:
                employeeList.add(HumanResources.e3);
                break;
            case 3:
                employeeList.add(HumanResources.e4);
                break;
            case 4:
                employeeList.add(HumanResources.e5);
                break;
        }

        switch (number1){
            case 0:
                employeeList.add(HumanResources.e1);
                break;
            case 1:
                employeeList.add(HumanResources.e2);
                break;
            case 2:
                employeeList.add(HumanResources.e3);
                break;
            case 3:
                employeeList.add(HumanResources.e4);
                break;
            case 4:
                employeeList.add(HumanResources.e5);
                break;
        }


        for (Employee each : employeeList) {

            System.out.println(each);

        }


    }

}
