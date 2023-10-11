package ra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        String filePath = "src\\data\\exercise4.txt";
        System.out.println(sortWords(filePath));
    }

    static List<String> sortWords(String filePath) {
        List<String> words = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null){
                String[] lineWords = line.split("\\s");

                for (String w: lineWords) {
                    words.add(w);
                }
            };
        }catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(words);

        return words;
    }
}
