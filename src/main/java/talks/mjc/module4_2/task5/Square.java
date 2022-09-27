package talks.mjc.module4_2.task5;

public class Square {
    public static void printSquareFrom8s(int sideLength){
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                if(j == 1 || j == sideLength || i == sideLength || i == 1){
                    System.out.print(8);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSquareFrom8s(3);
    }
}
