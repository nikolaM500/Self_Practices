package WarmUp819;

public class HumanResources {
    /*
    create a class called HumanResources
            declare 5 variables of Employee as static
            use static block to:
                        1. initialize those static variables
                        2. set all the info of the Employees
     */


    public static Employee e1 = new Employee();
    public static Employee e2 = new Employee();
    public static Employee e3 = new Employee();
    public static Employee e4 = new Employee();
    public static Employee e5 = new Employee();


    static {

        e1.setEmployeeInfo("Marko","eid312",146983565,"developer",
                135000,'M');
        e2.setEmployeeInfo("Tina","eid682",146986145,"developer",
                142000,'F');
        e3.setEmployeeInfo("Mirna","eid916",226598357,"developer",
                115000,'F');
        e4.setEmployeeInfo("Dragan","eid985",986521432,"SDET",
                125000,'M');
        e5.setEmployeeInfo("Slavisa","eid853",9872563,"QA",
                75000,'M');
    }



}
