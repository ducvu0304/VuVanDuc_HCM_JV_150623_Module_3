package rikkei.academy;

import java.util.Scanner;

public class FindPosition {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                          "Connor", "Zachariah",  "Mallory",  "Zoe", "Emily"};

        System.out.print("Enter name of student: ");
        name = sc.next();

        findPosition(name, students);
    }

    public static void findPosition(String name, String[] arr) {
        boolean isExits = false;

        for(int i =0 ; i < arr.length; i++) {
            if(arr[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is " + i);
                isExits = true;
                break;
            }
        }

        if (!isExits) {
            System.out.println("Not found " + name + " in the list.");
        }
    }
}
