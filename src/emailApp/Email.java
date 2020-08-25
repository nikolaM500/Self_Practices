package emailApp;

import java.util.Scanner;

public class Email {
    /*EMAIL APPLICATION
    - creating email accounts for new hires
    application should : 1. generate email firstname.lastname@department.company.com
                        2. Determine department ,if none leave blank
                        3. Generate random string for password
                        4.Have set methods to change password, set the mailbox capacity,
                        and define an alternate email address
                        5. Have get methods to display name, email, and mailbox capacity
     */

        private String firstName, lastName, department,password,email,alternateEmail;
        private int mailboxCapacity = 500;
        private int defaultPasswordLength = 10;
        private String company = "OMB";
public Email(String firstName, String lastName) {
    this.firstName=firstName;
    this.lastName = lastName;
    this.department=setDepartment();
    this.password=randomPassword(defaultPasswordLength);
    email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+company+".com";

}

private String setDepartment(){
    System.out.println("Enter the department\n1 Sales\n2 Accounting\n3 Development");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    return (depChoice==1)?"Sales":(depChoice==2)?"Accounting":(depChoice==3)?"Development":"";

}

public void  setAlternateEmail(String altEmail){
    this.alternateEmail=altEmail;
}



private String randomPassword(int length) {

    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
    char[] password = new char[length];
    for (int i = 0; i <length ; i++) {
        int random = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(random);
    }
    return new String(password);
}

public String setPassword(String newPassword) {
    return password=newPassword;
}

public void setEmailCapacity(int capacity){
    this.mailboxCapacity=capacity;
}

public void changePassword(String password){
    this.password=password;
}
public void showInfo(){

    System.out.println("employee: "+firstName+" "+lastName+
            "\nemail "+email+"\npassword "+password);


}

}
