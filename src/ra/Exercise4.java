package ra;

import entity.FootballTeam;
import entity.Sort;
import entity.Student;

public class Exercise4 {
    public static void main(String[] args) {
        FootballTeam[] arrayList = new FootballTeam[3];
        int id = 1;

        arrayList[0] = new FootballTeam(1, "MU", 22, 18);
        arrayList[1] = new FootballTeam(2, "MC", 22, 36);
        arrayList[2] = new FootballTeam(3, "Liver", 22, 34);

        FootballTeam.selectionSort(arrayList);

        for (int i = 0; i < 3; i++) {
            System.out.println(arrayList[i].getName() + " - " + arrayList[i].getScore());
        }
    }
}
