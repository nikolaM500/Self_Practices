package ScrumTeamTask;

/*1. create an array of Testers and store the testers info in your group
2. create an array of developers store the developers info in your group
3. create an object of ScrumTeam and store the testers & developers above to the scrum team*/
public class AppleInc {

    public static void main(String[] args) {

        Tester[] testersTeam = new Tester[2];
        Developer[] developersTeam = new Developer[6];

        Tester sdet1 = new Tester("Nazeb",35,'m',100000,"sdet","e25fd3");
        Tester sdet2 = new Tester("Nagib",38,'m',105000,"sdet","e52fgt");

        testersTeam[0]=sdet1;
        testersTeam[1]=sdet2;

        for (Tester each : testersTeam) {
            System.out.println(each);
        }
        System.out.println();
        Developer dev1 = new Developer("Ketrin",39,'f',140000,"dev","e65ds1");
        Developer dev2 = new Developer("Ramush",32,'m',125000,"dev","e78oil");
        Developer dev3 = new Developer("Raidus",42,'m',170000,"dev","e96flg");
        Developer dev4 = new Developer("Rubi",36,'f',145000,"dev","e5uyi2");
        Developer dev5 = new Developer("Kahrikap",34,'m',165000,"dev","edf52t");
        Developer dev6 = new Developer("Shruti",26,'f',150000,"dev","e85ret");

        developersTeam[0] = dev1;
        developersTeam[1] = dev2;
        developersTeam[2] = dev3;
        developersTeam[3] = dev4;
        developersTeam[4] = dev5;
        developersTeam[5] = dev6;

        for (Developer each : developersTeam) {
            System.out.println(each);
        }
        System.out.println();
        ScrumTeam team1 = new ScrumTeam(testersTeam,developersTeam);

        System.out.println(team1);







    }


}
