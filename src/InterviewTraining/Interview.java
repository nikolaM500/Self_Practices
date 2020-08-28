package InterviewTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Interview {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> team = new ArrayList<>();
        ArrayList<String> group1 = new ArrayList<>();
        ArrayList<String> group2 = new ArrayList<>();

        team.addAll(Arrays.asList("Adem","Ali","Ashenafi","Burak","Dilobar", "Ebrahim",
                "Hamid","Mohammed","Mokhinur","Nikola","Omer","Taha","Ulvi"));

        System.out.println(team);
        System.out.println();
        System.out.println("How many students participate tomorrow?");
        int nP = scan.nextInt();
        System.out.println("Enter their names: ");
        for (int i = 0; i <= nP; i++) {
            group1.add(i,scan.nextLine());
        }

       // if (group1.size()>=6){
        while (group1.size() > 5) {
            while (group1.size() > 3) {
                for (int i = 0; i < group1.size() - 3; i++) {
                    group2.add(i, group1.get(random.nextInt(group1.size() - i)));
                    group1.remove(group2.get(i));
                }
            }

        }
       // }

        System.out.println("Group 1: "+group1);
        System.out.println("Link creates: "+group1.get(random.nextInt(group1.size()-1)));
        System.out.println();
        if (!group2.isEmpty()){
            System.out.println("Group 2: "+group2);
            System.out.println("Link creates: "+group2.get(random.nextInt(group2.size()-1)));
        }








    }


}
