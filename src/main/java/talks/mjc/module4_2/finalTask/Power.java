package talks.mjc.module4_2.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result *= numberToPrint;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
/*
expected: <     1
    212
   32123
  4321234
 543212345
65432123456
> but was: <     1
    212
   32123
  4321234
 543212345
65432123456

>
 */