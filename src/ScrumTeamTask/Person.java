package ScrumTeamTask;


/*attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo*/
public class Person {
    String name;
    int age;
    char gender;

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void walk(){
        System.out.println(name+" is walking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


}
