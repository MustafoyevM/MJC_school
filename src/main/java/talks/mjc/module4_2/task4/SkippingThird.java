package talks.mjc.module4_2.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int i = 1; i <= lastPrinted; i++) {
            if (i == 3)
                continue;
            System.out.println(i);
        }
    }
}
