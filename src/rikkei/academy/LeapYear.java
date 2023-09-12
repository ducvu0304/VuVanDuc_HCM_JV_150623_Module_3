package rikkei.academy;

public class LeapYear {
    public void CheckLeapYear(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(isLeapYear)  {
            System.out.println(year + " là năm nhuận");
        }else {
            System.out.println(year + " Không phải là năm nhuận");
        }
    }
}
