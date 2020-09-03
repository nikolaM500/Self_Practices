package ScrumTeamTask;
/*  attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo*/
public class Employee extends Person {

    double salary;
    String eid, jobTitle;

    public void setInfo(String name, int age, char gender,double salary,String jobTitle, String eid) {
        setInfo(name, age, gender);
        this.salary=salary;
        this.jobTitle=jobTitle;
        this.eid=eid;
    }


    public void work(){
        System.out.println(name + " is working.");
    }


}
