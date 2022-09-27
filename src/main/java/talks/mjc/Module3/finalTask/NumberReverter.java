package talks.mjc.Module3.finalTask;

public class NumberReverter {
    public void revert(int number) {
        int a = (number % 10) *100;
        number = number / 10;
        a += (number % 10) * 10;
        number = number / 10;
        a += number;
        System.out.println(a);
    }

    public static void main(String[] args) {
        NumberReverter object = new NumberReverter();
        object.revert(489);
    }
}
