package talks.mjc.module4_2.task2;

public class PowerOfTwo {
    public static void powerOfTwo(int power) {
        int i = 1, a = 1;
        System.out.println(1);
        while (i <= power){
            System.out.println(a *= 2);
            i++;
        }
    }

    public static void main(String[] args) {
        powerOfTwo(3);
    }
}
