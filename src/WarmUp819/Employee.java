package WarmUp819;

public class Employee {

    /*
    Create a class called Employee
            instance variables:
                    name, id, ssn, jobTitle, salary, gender
            actions:
                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string
     */

    String name;
    String id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;


    public void setEmployeeInfo(String name, String id, long ssn, String jobTitle, double salary, char gender){
        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }
    public String toString(){
        return "================="+"\nEmployee name: "+name+"\nEmployee id: "+id+"\nJob title: "+
                jobTitle+"\nSalary: "+salary+"\n" +
                "=================";
    }
}
