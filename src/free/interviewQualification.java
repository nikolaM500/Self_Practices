package free;

import java.util.Scanner;
/*
Requirements:

ESSENTIAL: Strong JAVA programming/scripting experience and passion for testing
Minimum 5 years of experience in Java development
Minimum 5 years of experience in Software Quality Assurance (QA)
Minimum 3 years of experience with TestNG, Maven, SureFire
Demonstrated experience with IntelliJ
Demonstrated experience with CI/CD tools (Jenkins experience preferred)
Demonstrated Experience writing SQL queries (Oracle DB experience preferred)
Demonstrated with JIRA, GIT and Bitbucket
Agile/Scrum experience
Excellent communication skills / Comfortable working in a collaborative environment
Self-motivated, highly driven
Bachelor's Degree in related area (Computer Science, Information Systems, Engineering) or an equivalent combination of education and experience
Full English proficiency

Highly Desirable Experience:

2-3+ years of experience with web-services testing (Rest/SOAP/RestAssured)
Experience with Selenium
Experience with Bash command line
 */
public class interviewQualification {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double points = 0;
        int yearsSelenium = 0;
        int yearsBashCommandLine = 0;
        int yearsWebST = 0;

        System.out.println("Your first name:");
        String firstName = in.next();
        in.nextLine();
        System.out.println("Your last name:");
        String lastName = in.next();
        in.nextLine();
        String fullName = firstName+" "+lastName;
        System.out.println("Your phone number:");
        long phoneNumber = in.nextLong();
        in.nextLine();
        System.out.println("Your email:");
        String email = in.nextLine();
        if (!email.contains("@") || !email.endsWith(".com")) {
            System.out.println("enter valid email:");
            email = in.nextLine();
            if (!email.contains("@") || !email.endsWith(".com")){
                System.out.println("Email must contain \"@\", and must end with\".com\"");
                System.out.println("enter valid email:");
                email = in.nextLine();
            }

        }
        System.out.println("On scale 1-10 grade your Java programming skill");//1
        int javaGrade = in.nextInt();
        if (javaGrade > 0 && javaGrade < 11){
            if (javaGrade>8){
                points+=5;
            }else if (javaGrade > 6){
                points+=2;
            }else if (javaGrade > 4){
                points+=0;
            }else if (javaGrade > 2){
                points-=10;
            }else {
                points-=20;
            }
        }else {
            points-=5;
        }
        System.out.println(points);
        System.out.println("How many years of experience in Java development?");//2
        int yearsOfJava = in.nextInt();
        if (yearsOfJava >= 5) {
            points+=5;
        }else if (yearsOfJava >= 3) {
            points+=4;
        }else if (yearsOfJava >= 1) {
            points+=2;
        }
        System.out.println(points);

        System.out.println("How many years of experience in Software Quality Assurance (QA)?");//3
        int yearsOfQA = in.nextInt();
        if (yearsOfQA >= 7) {
            points+=5;
        }else if (yearsOfQA >= 5){
            points+=4;
        }else if (yearsOfQA >= 3){
            points+=3;
        }else if (yearsOfQA > 0) {
            points+=2;
        }
        System.out.println(points);
        System.out.println("How many years of experience in QA Automation?");// * 4
        int yearsOfQaAutomation = in.nextInt();
        if (yearsOfQaAutomation <= yearsOfQA && yearsOfQaAutomation>0){
            if (yearsOfQaAutomation > 5) {
                points+=5;
            }else if (yearsOfQaAutomation >= 4) {
                points+=4;
            }else {
                points+=1;
            }
        } else{
            points-=20;
        }
        System.out.println(points);
        System.out.println("How many years of experience with TestNG, Maven, SureFire?");//5
        int yearsTestNGMavenSureFire = in.nextInt();
        if (yearsTestNGMavenSureFire >= 5) {
            points+=5;
        }else if (yearsTestNGMavenSureFire == 4) {
            points+=4;
        }else if (yearsTestNGMavenSureFire == 3) {
            points+=3;
        }else if (yearsTestNGMavenSureFire == 2) {
            points+=2;
        }else if (yearsTestNGMavenSureFire == 1) {
            points+=1;
        }
        System.out.println(points);
        System.out.println("Do you have experience with IntelliJ?\ntype Yes or No");//6
        String IntelliJ = in.next();
        if (IntelliJ.equalsIgnoreCase("Yes")) {
            points+=5;
        }
        System.out.println(points);
        System.out.println("Do you have experience with CI/CD tools?\ntype Yes or No");//7
        String ciCd = in.next();
        if (ciCd.equalsIgnoreCase("Yes")) {
            points+=5;
        }
        System.out.println(points);
        System.out.println("Do you have experience with SQL queries tools?\ntype Yes or No");//8
        String sQL = in.next();
        if (sQL.equalsIgnoreCase("Yes")) {
                System.out.println("How many years of experience with SQL queries tools?");
                int yearsSql = in.nextInt();
                if (yearsSql >= 5) {
                    points+=5;
                }else if (yearsSql == 4) {
                    points+=4;
                }else if (yearsSql == 3) {
                    points+=3;
                }else if (yearsSql == 2) {
                    points+=2;
                }else if (yearsSql == 1) {
                    points+=1;
                }

        }
        System.out.println(points);
        System.out.println("Do you have experience with JIRA, GIT and Bitbucket?\ntype Yes or No");//9
        String jira = in.next();
        if (jira.equalsIgnoreCase("Yes")) {
            points+=5;
        }
        System.out.println(points);

        System.out.println("Do you have experience with web-services testing" +
                " (Rest/SOAP/RestAssured)?\ntype Yes or No");//10*
        String webServicesTesting = in.next();
        webServicesTesting = webServicesTesting.toLowerCase();
        switch (webServicesTesting) {
            case "yes":
                System.out.println("How many years of experience in web-services testing?");
                yearsWebST = in.nextInt();
                if (yearsWebST >= 5) {
                    points+=5;
                }else if (yearsWebST == 4) {
                    points+=4;
                }else if (yearsWebST == 3) {
                    points+=3;
                }else if (yearsWebST == 2) {
                    points+=2;
                }else if (yearsWebST > 0) {
                    points+=1;
                }
                break;
            case "no":
                points-=5;
                break;
        }
        System.out.println(points);
        System.out.println("Do you have experience with Selenium?\ntype Yes or No");//11*
        String selenium = in.next();
        selenium = selenium.toLowerCase();
        switch (selenium) {
            case "yes":
                System.out.println("How many years of experience with Selenium?");
                yearsSelenium = in.nextInt();
                if (yearsSelenium >= 5) {
                    points+=5;
                }else if (yearsSelenium == 4) {
                    points+=4;
                }else if (yearsSelenium == 3) {
                    points+=3;
                }else if (yearsSelenium == 2) {
                    points+=2;
                }else if (yearsSelenium == 1) {
                    points+=1;
                }
                break;
            case "no":
                points-=5;
                break;
        }
        System.out.println(points);
        System.out.println("Do you have experience with Bash command line?\ntype Yes or No");//12*
        String bashCommandLine = in.next();
        bashCommandLine = bashCommandLine.toLowerCase();
        switch (bashCommandLine) {
            case "yes":
                System.out.println("How many years of experience with Bash command line?");
                yearsBashCommandLine = in.nextInt();

                if (yearsBashCommandLine >= 5) {
                    points+=5;
                }else if (yearsBashCommandLine == 4) {
                    points+=4;
                }else if (yearsBashCommandLine == 3) {
                    points+=3;
                }else if (yearsBashCommandLine == 2) {
                    points+=2;
                }else if (yearsBashCommandLine == 1) {
                    points+=1;
                }
                break;
            case "no":
                points-=5;
                break;
        }
        System.out.println(points);
        System.out.println("Do you have experience in Agile/Scrum?\ntype Yes or No");//13
        String agileScrum = in.next();
        agileScrum = agileScrum.toLowerCase();
        if (agileScrum.equalsIgnoreCase("yes")) {

                System.out.println("How many years of experience in Agile/Scrum?");
                int agile = in.nextInt();
                if (agile >= 5) {
                    points+=5;
                }else if (agile == 4) {
                    points+=4;
                }else if (agile == 3) {
                    points+=3;
                }else if (agile == 2) {
                    points+=2;
                }else if (agile == 1) {
                    points+=1;
                }

        }
        System.out.println(points);
        System.out.println("On scale 1 - 5 grade your communication skills");//13
        int communication = in.nextInt();
        if (communication != 5){
            points-=2;
        }
        System.out.println(points);
        System.out.println("You are comfortable working in a collaborative environment.\ntrue or false");//13
        boolean collaborative = in.nextBoolean();
        if (!collaborative) {
            points -=5;
        }
        System.out.println(points);
        System.out.println("Your coworkers would say:  \"you are self-motivated, highly driven\"\ntrue or false");//14
        boolean motivated = in.nextBoolean();
        if (motivated) {
            points+=5;
        }
        System.out.println(points);
        System.out.println("You have Bachelor's Degree in related area,\n" +
                "or an equivalent combination of education and experience\ntrue or false");//15
        boolean education = in.nextBoolean();
        if (education) {
            points+=5;
        }
        System.out.println(points);
        System.out.println("Full English proficiency\ntrue or false");//15
        boolean englishProficiency = in.nextBoolean();
        if (!englishProficiency) {
            points-=5;
        }
        System.out.println(points);
        if (points>=60 && yearsBashCommandLine>=2 && yearsSelenium >=2 && yearsWebST >=2){
            System.out.println("Dear "+fullName+",\n\n");
            System.out.println("Thank you for applying to Acme.\n");
            System.out.println("Your application for the Sr QA automation engineer (SDET) stood out " +
                    "to us and we would like \nto invite you for an interview at our office.");
            System.out.println("You will meet with our Engineering department manager, Ms. Blake, and two of her");
            System.out.println("team members. The interview will last about 60 minutes. You’ll have the chance to");
            System.out.println("discuss the position’s responsibilities and learn more about our company.");
            System.out.println();
            System.out.println("We would like to conduct your interview sometime this week. Please let me know");
            System.out.println("what time slots you would prefer. I will be sending you a");
            System.out.println("calendar invitation once I receive your reply.\n\n");
            System.out.println("Best regards,\n\n");
            System.out.println("Thomas Gunn");
        } else if (points>50 && (yearsBashCommandLine>=2 || yearsSelenium >=2 || yearsWebST >=2)){
            System.out.println("Dear "+fullName+",\n\n");
            System.out.println("Thank you for applying to Acme.\n");

            System.out.println("My name is Thomas Gunn and I’m a the hiring manager. I would like to have a");
            System.out.println("phone discussion about your application for the SDET role");
            System.out.println("I’d like to tell you more about the company and get to know you a bit better.");
            System.out.println();
            System.out.println("Would you be available for a short introductory phone call on Tuesday nex week?");
            System.out.println("Contacts we have on file are phone: "+phoneNumber+", email:"+email+".\n");
            System.out.println("Looking forward to hearing from you,\n");
            System.out.println("Kind regards,\n\n");
            System.out.println("Thomas Gunn");
        } else if (points>45){
            System.out.println("Dear "+fullName+",\n\n");
            System.out.println("Thank you for applying to Acme.\n");
            System.out.println("I’d like to inform you that we received your application. Our hiring");
            System.out.println("team is currently reviewing all applications and we are planning to schedule");
            System.out.println("interviews in the next two weeks. If you are among");
            System.out.println("qualified candidates, you will receive email from our one of our recruiters");
            System.out.println("to schedule a phone interview. In any case, we will keep you posted on the");
            System.out.println("status of your application.\n");
            System.out.println("Thank you, again, for taking the time to apply to this role at Acme\n");
            System.out.println("Kind regards,\n\n");
            System.out.println("Thomas Gunn");
        } else {
            System.out.println("Dear "+firstName+",\n\n");
            System.out.println("We appreciate your interest in Acme and the time you’ve invested in applying\n");

            System.out.println("We ended up moving forward with another candidate,");
            System.out.println("but we’d like to thank you for talking to our team and giving us the");
            System.out.println("opportunity to learn about your skills and accomplishments.");
            System.out.println("We will be advertising more positions in the coming months.");
            System.out.println("We hope you’ll keep us in mind and we encourage you to apply again.\n");
            System.out.println("We wish you good luck with your job search and professional future endeavors.\n");
            System.out.println("Kind regards,\n\n");
            System.out.println("Thomas Gunn");
        }




















    }
}
