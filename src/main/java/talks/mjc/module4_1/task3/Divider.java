package talks.mjc.module4_1.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if(number == 0)
            System.out.println("cannot divide by zero");
        else {
            if (number % 5 == 0 && number % 11 == 0)
                System.out.println("Dividable");
            else
                System.out.println("Non-dividable");
        }
    }
}
