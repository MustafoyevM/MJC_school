package talks.mjc.module4_1.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("leap" );
        }
        else
            System.out.println("not leap");
    }
}
