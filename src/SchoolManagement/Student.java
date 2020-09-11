package SchoolManagement;

public class Student {

    String fullName,firstName,lastName,email,studentID;
    double payedFees, remainingFees, studentLoan;
    static double totalFees, studentLoanRate;


    static {
        totalFees=30000;
        studentLoanRate=8.7;
    }

    public Student(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        fullName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+" "+
                lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+"gmail.com";
        studentID=lastName.substring(lastName.length()-3)+firstName.length()+
                lastName.substring(1,3).toLowerCase()+firstName.substring(0,2)+
                lastName.length();
        payedFees=0;
        remainingFees= totalFees-payedFees;
        studentLoan=0;
    }

    public void makePayment(int n){
        if (payedFees+n>totalFees){
            throw new InvalidPaymentException(n);
        }else if (n > 0){
            payedFees+=n;
        }else {
            throw new InvalidPaymentException(n);
        }

    }
    public void checkTuitionBalance(){
        System.out.println("Remaining balance is: "+ remainingFees);
    }

    public void getLoan(int n){
        if (n>remainingFees){
            throw  new InvalidLoanAmountException(n);
        }else if (n<1000){
            throw  new InvalidLoanAmountException(n);
        }else{
            studentLoan=n*studentLoanRate;
            remainingFees-=studentLoan;
        }
    }

    public void makeLoanPayment(int n){
        if (n>studentLoan){
            throw new InvalidPaymentException(n);
        }else if (n > 100){
            studentLoan-=n;
        }else {
            throw new InvalidPaymentException(n);
        }
    }

}
