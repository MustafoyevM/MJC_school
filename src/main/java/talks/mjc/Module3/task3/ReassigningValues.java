package talks.mjc.Module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(first + "\n" + second + "\n" + third);
        int linkToFirst =  first ;
        int linkToSecond = second;
        int linkToThird =  third ;
        first =  4;
        second = 6;
        third =  15;
        System.out.println(first + "\n" + second + "\n" + third);
        System.out.println(linkToFirst + "\n" + linkToSecond + "\n" + linkToThird);
        double d = 1.8;
        for (int i = 0; i < 3000; i++) {
            d *= 10;
        }
        System.out.println(d);
    }
}
