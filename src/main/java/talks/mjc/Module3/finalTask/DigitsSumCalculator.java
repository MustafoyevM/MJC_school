package talks.mjc.Module3.finalTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number;
        System.out.println(sum);

    }
}
