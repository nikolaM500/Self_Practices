package SchoolManagement;

public class Dean extends Employees{

    public Dean(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        eid="xx001";
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+
                "@"+"dean."+schoolName.trim().toLowerCase()+".com";
    }

    @Override
    public void setDayOfPTO(int dayOfPTO) {

    }

    @Override
    public void setFte(boolean fte) {

    }

    @Override
    public void increaseSalary() {

    }

    @Override
    public void increaseSalary(double d) {

    }

    @Override
    public void reduceSalary() {

    }

    @Override
    public void reduceSalary(double d) {

    }
}
