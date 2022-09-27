package talks.mjc.module4_1.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println(first > ((second > third)?second:third)? first:(second > third)?second:third);
    }
}
