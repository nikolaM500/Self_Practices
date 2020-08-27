package Constructor;

public class SalaryCalculator {
    /* Create class called SalaryCalculator
instance variables:
 hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
 add a constructor can initialize those fields
 instance methods:
 salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
 salaryAfterTax(): returns the salary after tax as double ( salary - stateTax - federalTax)
 stateTax(): returns the total state tax as double ( salary * stateTaxRate)
 federalTax(): returns the total federal tax as double ( salary * federalTaxRate)

 toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
Collapse*/

    double hourlyRate, stateTaxRate;
    int weeklyHours;
    static double federalTaxRate;

    static {
        federalTaxRate=0.22;
    }

    public  SalaryCalculator(double hourlyRate, double stateTaxRate,int weeklyHours){

        this.hourlyRate=hourlyRate;
        this.stateTaxRate=stateTaxRate;
        this.weeklyHours=weeklyHours;
    }

    public double salary(){
        return weeklyHours*hourlyRate*48;
    }
    public double ifRaisePerHour(int n){
        double ifR = hourlyRate+n;
        return ifR*weeklyHours*48;
    }
    public double raisePerHour(int n){
        hourlyRate+=n;
        return hourlyRate;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString(){
        return "Pay per hour: "+hourlyRate+"\nWorking hours per week: "
                +weeklyHours+"\nTotal salary: "+salary();
    }



}
