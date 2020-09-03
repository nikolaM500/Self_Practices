package ScrumTeamTask;

import Constructor.Test;

/*Attributes: name, age, gender, Salary, ID, jobTitle
 Actions: setInfo(), smokeTesting(),  creatingTicket(), toString()*/
public class Tester extends Employee {

    public  Tester(String name, int age, char gender,double salary,String jobTitle, String eid) {
        setInfo(name, age, gender, salary, jobTitle, eid);
    }

    public void smokeTesting(){
        System.out.println("Tester "+name + " is performing Smoke Test.");
    }

    public  void creatingTicket(){
        System.out.println("Tester "+name + " is creating a ticket.");
    }

    public String toString(){
        return "Employee name: "+name+", age: "+age+", gender: "+gender+", position: "+jobTitle+", sid: "+eid;
    }

}
