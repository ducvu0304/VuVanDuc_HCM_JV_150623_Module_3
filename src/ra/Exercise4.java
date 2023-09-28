package ra;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ds");
        list.add("ddsas");
        list.add("dsdsa");
        list.add("dsdá");

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > 3) {
                System.out.println(list.get(i));
            }
        }
    }
}
