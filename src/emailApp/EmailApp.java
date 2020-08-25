package emailApp;

public class EmailApp {

    Email em1 = new Email("John","Smith");

    public static void main(String[] args) {
        Email em1 = new Email("John","Smith");

        em1.showInfo();
        em1.changePassword("blablabla");
        em1.showInfo();
    }

}
