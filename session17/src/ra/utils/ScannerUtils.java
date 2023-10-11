package ra.utils;

import java.util.Scanner;

public class ScannerUtils {

    public static int inputInteger(Scanner scanner) {
        while (true){
            try {
                return Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.printStackTrace();
            }

        }
    }
}
