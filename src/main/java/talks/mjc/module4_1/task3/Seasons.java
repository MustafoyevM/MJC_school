package talks.mjc.module4_1.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if(month > 0 && month < 13){
            if(month == 1 || month == 2 || month == 12)
                System.out.println("Winter");
            if(month >= 3 && month <= 5)
                System.out.println("Spring");
            if(month >= 6 && month <= 8)
                System.out.println("Summer");
            if(month >= 9 && month <= 11)
                System.out.println("Autumn");
        }
        else{
            System.out.println("wrong number!");
        }
    }
}
