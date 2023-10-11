package ra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise2 {
    public static void main(String[] args) {
        String filePath = "src\\data\\exercise2.txt";

        System.out.println("Số dòng trong file: " + countLine(filePath));
    }

    static int countLine(String filePath) {
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while (reader.readLine() != null) {
                count++;
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        return count;
    }
}
