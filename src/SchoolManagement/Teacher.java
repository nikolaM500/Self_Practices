package SchoolManagement;

public class Teacher extends Employees {

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        eid = firstName.substring(-3).toUpperCase()+firstName.length()+
                lastName.substring(0,3).toLowerCase() + lastName.length();
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+schoolName.trim().toLowerCase()+".com";
        jobTitle="instructor";
    }

    @Override
    public void increaseSalary(double d) {
        salary+=d;
    }

    @Override
    public void increaseSalary() {
        salary = salary+(salary*0.1);
    }

    @Override
    public void reduceSalary(double d) {
        salary-=d;
    }

    @Override
    public void reduceSalary() {
        salary=salary - (salary*0.1);
    }

    @Override
    public void setFte(boolean fte) {

    }

    @Override
    public void setDayOfPTO(int dayOfPTO) {

    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }
}
