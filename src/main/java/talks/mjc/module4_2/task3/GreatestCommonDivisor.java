package talks.mjc.module4_2.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min = (first < second)? first : second;
        while (first % second != 0){
            min = second;
            second = first % second;
            first = min;
        }
        System.out.println(second);
    }

    public static void main(String[] args) {
        int first = 80,second = 420;

        int min = (first < second)? first : second;
        while (first % second != 0){
            min = second;
            second = first % second;
            first = min;
        }
        System.out.println(second);
    }



}
