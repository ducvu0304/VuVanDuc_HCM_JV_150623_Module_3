package ra;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            list.add((int)(Math.random()*20));
        }

        System.out.println("List:" + list);

        for (int i = 0; i < list.size() -1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
            }

        }

        System.out.println("Reverse list:" + list);
    }
}
