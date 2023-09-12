import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        float f = 20.5f;
        double d = 20.5;
        boolean b = true;
        char c = 'a';
        String s = "Hà Nội";

        // ==============="Hiển thị thời gian hê thống"=================
        Date date = new Date();
        System.out.println("Time now: " + date);
        System.out.println("");

        // ==============="Khai báo và sử dụng biến"===================
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("c = " + c);

        // ==============="Sử dụng toán tử"===================
        Scanner sc = new Scanner(System.in);
        float width, height, area;

        System.out.println("Enter width: ");
        width = sc.nextFloat();

        System.out.println("Enter height: ");
        height = sc.nextFloat();

        area = width * height;
        System.out.println("area: " + area);
    }
}