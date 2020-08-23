package day_822;

public class Offer {
/*Create a class called Offer that has:
               fields :
                    location, company, salary , isFullTime
                create a constructor that can initialize all the fields

            toString -- print all info about offers
        create a class called MyOffers
            Create 5 offer objects
                1. use for loop to print out the info of each offer
                2. write a program that can only retain the offers if:
                        1. the offer is for fulltime position
                        2. offer is from your local area
                        3. salary is greater than 100K*/

    String location;
    String company;
    String position;
    double salary;
    boolean isFullTime;
    boolean isOnTheWestCoast;

    public Offer(String location, String company,String position, double salary, boolean isFullTime,boolean isOnTheWestCoast){
        this.location = location;
        this.company = company;
        this.position = position;
        this.salary=salary;
        this.isFullTime = isFullTime;
        this.isOnTheWestCoast = isOnTheWestCoast;
    }

    public String toString(){
        String employmentType ="";
        if (isFullTime){
            employmentType= "position is full time";
        }else {
            employmentType = "position is contracted";
        }
        return company+" is located at "+location+", position available is "+position+
                "\nSalary is "+salary+"$ "+employmentType+"\n";
    }







}
