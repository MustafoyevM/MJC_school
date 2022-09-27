package talks.mjc.module4_2.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        int sum = 0;
        for (int i = 0; i < Integer.toString(number).length(); i++) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
