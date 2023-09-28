package ra;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            list.add((int)(Math.random()*20));
        }

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
