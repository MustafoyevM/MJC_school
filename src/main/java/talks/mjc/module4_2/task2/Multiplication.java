package talks.mjc.module4_2.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        while (Math.abs(i) <= Math.abs(multiplyByAndToInclusive)){
            System.out.println(i * multiplyByAndToInclusive);
//            i = (multiplyByAndToInclusive >= 0)? ++i : --i;
            i++;
        }
    }

    public static void main(String[]args) {
        int multiplyByAndToInclusive = -5;
        int firstPrinted = 0;
        int result = 0;
        if (multiplyByAndToInclusive < 0) {
            while (firstPrinted >= multiplyByAndToInclusive) {
                result = (-1) * firstPrinted * multiplyByAndToInclusive;
                System.out.println(result);
                firstPrinted--;
            }
        } else if (multiplyByAndToInclusive > 0) {
            while (firstPrinted <= multiplyByAndToInclusive) {
                result = firstPrinted * multiplyByAndToInclusive;
                System.out.println(result);
                firstPrinted++;
            }
        }

    }
}
