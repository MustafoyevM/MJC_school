package talks.mjc.module4_2.task5;

public class Cross {
    public static void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if(i == j || i + j == sideLength - 1){
                    System.out.print(8);
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printCross(3);
    }
}
/*
88888
 888
  8
 888
88888

88888
 888
  8
 888
88888

 8
888
 8
8 8
 8
8 8

expected: <
888
 8
888
> but was: <
888
 8
888
> but was: <
8   8
 8 8
  8
 8 8
8   8
>
 */