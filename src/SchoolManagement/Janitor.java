package SchoolManagement;

public class Janitor extends Employees{

    public Janitor(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        fte = false;
        jobTitle="housekeeping";
    }

    @Override
    public void increaseSalary(double d) {
        System.out.println("We will try our best");
    }

    @Override
    public void increaseSalary() {
        salary*=1.05;
    }

    @Override
    public void reduceSalary(double d) {
        salary-=d;
    }

    @Override
    public void reduceSalary() {
        salary*=0.95;
    }

    @Override
    public void setSalary(double salary) {
        if (salary>30000 || salary<0){
            new InvalidSalaryException();
        }else {
            super.setSalary(salary);
        }

    }

    @Override
    public void setDayOfPTO(int dayOfPTO) {
        if (dayOfPTO>5 || dayOfPTO<0){
            throw new InvalidNumberOfPTO();
        } else {
            this.dayOfPTO=dayOfPTO;
        }
    }

    @Override
    public void setFte(boolean fte) {
        System.out.println("This is contracted position only.");
        this.fte=false;
    }
}
