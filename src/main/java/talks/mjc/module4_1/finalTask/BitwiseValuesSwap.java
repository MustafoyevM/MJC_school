package talks.mjc.module4_1.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = first + second;
        second = first - second;
        first = first -second;
        System.out.println(first);
        System.out.println(second);
    }
}
