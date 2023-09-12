public class DayOfMonth {
    public void getDayOfMonth(int month) {
        int day = 28;

        switch (month) {
            case 2:
                System.out.println("The month " +  month + "has 28 or 29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                System.out.println("The month " + month + "has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                System.out.println("The month " + month + "has 30 days");
                break;
            default:
                System.out.println("This month doesn't exists");
        }
    }
}
