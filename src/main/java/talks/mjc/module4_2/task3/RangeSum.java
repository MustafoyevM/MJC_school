package talks.mjc.module4_2.task3;

public class RangeSum {

    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
