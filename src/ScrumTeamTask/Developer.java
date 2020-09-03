package ScrumTeamTask;
/*Attributes: ame, age, gender, Salary, ID, jobTitle
Actions: setInfo(), coding(),  fixBug(), toString()*/
public class Developer extends Employee {

    public  Developer(String name, int age, char gender,double salary,String jobTitle, String eid) {
        setInfo(name, age, gender, salary, jobTitle, eid);
    }
    public String toString(){
        return "Employee name: "+name+", age: "+age+", gender: "+gender+", position: "+jobTitle+", sid: "+eid;
    }

    public void coding(){
        System.out.println("Developer "+name + " is developing a program.");
    }

    public  void fixBug(){
        System.out.println("Developer "+name + " is fixing a bug.");
    }
}
