package talks.mjc.module4_2.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if(toBreakWith > numberToGoUntil)
            System.out.println("iterating till the end");
        for (int i = 0; i < numberToGoUntil; i++) {
            System.out.println(i);
            if(i == toBreakWith)
                break;
        }
    }
}
