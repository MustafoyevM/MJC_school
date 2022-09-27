package talks.mjc.module4_2.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i = 0; i <= numberTableToPrint; i++) {
            int result = numberTableToPrint * i;
            System.out.println(i + " x " + numberTableToPrint + " = " + result);
        }
    }
}
