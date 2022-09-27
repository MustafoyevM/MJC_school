package talks.mjc.module4_1.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        System.out.println((divider==0) ? "division by zero" : (((dividend/divider)*divider==dividend)? "can be divided completely":"cannot be divided completely"));
    }
}
