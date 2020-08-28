package Constructor;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

public class Employee {
    /*class Name: Employee
            instance variables:
                    name, jobTitle, ID, salary
            1st constructor: initialize the name of the employee
            2d constructor: initialize the name, jobTitle of the employee
                            (MUST apply constructor Call)
            3rd Constructor: initialize the name, jobTitle, ID of the employee
                            (MUST apply constructor Call)
            4th Constructor: initialize all the instance of the employee
                                (MUST apply constructor Call)
            Instance methods:
                toString()  */
    Scanner in = new Scanner(System.in);

    String firstName, lastName, jobTitle, EID, email;
    double salary;
    boolean isFullTime;
    double hourlyRate;
    int weeklyHours;

    static double federalTaxRate, stateTaxRate;
    static String companyName;
    static int workingWeeks;
    static int ptoWeeks;

    static {
        companyName = "mb-soft";
        workingWeeks = 48;
        ptoWeeks=4;
        federalTaxRate=0.22;
        stateTaxRate=0.08;
    }

    public Employee(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=setEmail();
    }
    public Employee(String firstName, String lastName, String jobTitle){
        this(firstName,lastName);
        this.jobTitle=jobTitle;
    }
    public Employee(String firstName, String lastName, String jobTitle, double hourlyRate){
        this(firstName,lastName,jobTitle);
        this.hourlyRate=hourlyRate;
    }

    public Employee(String firstName, String lastName, String jobTitle,
                    double hourlyRate,String EID){
        this(firstName,lastName,jobTitle,hourlyRate);
        this.EID=EID;
    }

    public Employee(String firstName, String lastName, String jobTitle,
                    double hourlyRate,String EID, boolean isFullTime){
        this(firstName,lastName,jobTitle,hourlyRate, EID);
        this.isFullTime=isFullTime;
        if (isFullTime){
            weeklyHours=40;
        }else {
            System.out.println("How many hours per week? ");
            weeklyHours=in.nextInt();
        }
        this.salary=calcSalary();
    }

    public double calcSalary(){
        salary=(isFullTime)?(hourlyRate*weeklyHours*(workingWeeks+ptoWeeks)):(hourlyRate*weeklyHours*workingWeeks);
        return salary;
    }
    public double stateTax(){
        return calcSalary()*stateTaxRate;
    }
    public double federalTax(){
        return calcSalary()*federalTaxRate;
    }
    public double totalTax(){return stateTax()+federalTax();}

    public double salaryAfterTax(){
        return calcSalary()-totalTax();
    }

    public void ifRaisePerHour(int n){
        double ifR = hourlyRate+n;
        if (isFullTime){
            System.out.println("If "+firstName+" is raised "+n+"$, salary: "+
                    (ifR*weeklyHours*(workingWeeks+ptoWeeks))+
                    "$,\ntakes home: "+((ifR*weeklyHours*(workingWeeks+ptoWeeks))-
                    ((ifR*weeklyHours*(workingWeeks+ptoWeeks))*federalTaxRate)
                    -((ifR*weeklyHours*(workingWeeks+ptoWeeks))*stateTaxRate))+"$.");
        }else {
            System.out.println("If " + firstName + " is raised " + n + "$, salary: " + (ifR * weeklyHours * workingWeeks) +
                    "$,\ntakes home: " + ((ifR * weeklyHours * workingWeeks) - ((ifR * weeklyHours * workingWeeks) * federalTaxRate)
                    - ((ifR * weeklyHours * workingWeeks) * stateTaxRate)) + "$.");
        }
    }

    public void takesHome(){
        System.out.println(firstName+" takes home: "+salaryAfterTax());
    }

    public double raisePerHour(int n){
        hourlyRate+=n;
        return hourlyRate;
    }

    public void effectiveHrPrice(){
        System.out.println(firstName+"'s effective hour costs: "+(calcSalary()/workingWeeks/weeklyHours)+"$");
    }

    public String setEmail(){
        return email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+companyName+".com";
    }
    public String toString(){
        String employment = (isFullTime)?("FTE"):("Contractor");
        return firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+" "+
        lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase()+
                "\nJob title: "+jobTitle+", "+employment+",\nEmail: "+setEmail()+
                "\nSalary: "+calcSalary();
    }









}
