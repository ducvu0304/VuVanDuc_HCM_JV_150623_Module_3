package date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise6 {
    public static void main(String[] args) {
        LocalDate localDate =  LocalDate.of(1996,9,4);

        System.out.println("Age: " + (LocalDate.now().getYear() - localDate.getYear()));
    }

}
