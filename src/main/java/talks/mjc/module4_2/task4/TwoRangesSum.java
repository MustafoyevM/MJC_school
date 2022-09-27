package talks.mjc.module4_2.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        else if(lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int firstSum = 0,lastSum = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if(i <= numberToSkip){
                firstSum += i;
            }
            else{
                lastSum += i;
            }
        }

        System.out.println("skipped sum is number" + firstSum);
        System.out.println("counted sum is number" + lastSum);
    }
}
