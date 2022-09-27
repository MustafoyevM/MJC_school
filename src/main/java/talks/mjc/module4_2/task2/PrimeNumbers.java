package talks.mjc.module4_2.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers1(int printToInclusive) {
        int i = 3;
        if(printToInclusive >= 2)
            System.out.println(2);
        while (i < printToInclusive){
            if(checkToPrime(i)){
                System.out.println(i);
            }
            i++;

        }
    }

    public static void main(String[] args) {
        printPrimeNumbers(33);
    }

    private static boolean checkToPrime(int i) {
        int j = 2;
        while (j < i){
            if(i % j == 0){
                return false;
            }
            j++;
        }
        return true;
    }
    public static void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i <= printToInclusive){
            boolean prime = true;
            int j = 2;
            while(j < i){
                if(i % j == 0 && i != 2){
                    prime = false;
                    break;
                }
                j++;
            }
            if(prime) System.out.println(i);
            i++;
        }
    }
}
