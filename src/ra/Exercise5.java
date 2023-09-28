package ra;

import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        String string = "Điểm chung cuộc sẽ quyết định thứ hạng năng lực cạnh tranh ở lĩnh vực trung tâm tài chính của các thành phố";

        List<String> list = Arrays.asList(string.split(" "));

        System.out.println(list);

        int index = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).length() > list.get(j).length()) {
                    String temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("Từ ngắn nhất: " + list.get(0));
    }
}