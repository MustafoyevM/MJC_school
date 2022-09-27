package talks.mjc.module4_2.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += 9 * Math.pow(10, i);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int lengthOfLastNumber = 4;
        int sum = 0, number = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += 9 * Math.pow(10, i) + number;
            number += 9 * Math.pow(10, i);
        }
        System.out.println(sum);
    }
    public void printAlphabet() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char)i);
        }}
}
