package talks.mjc.Module3.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int res = Math.round(numberToBeRounded);
        System.out.println(res);
    }

    public static void main(String[] args) {
        FloatTypeCasting object = new FloatTypeCasting();
        object.roundNumber(5.6f);
    }
}
