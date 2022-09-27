package talks.mjc.Module3.task5;

public class TimeConvertor {
    public static void main(String[] args) {
        TimeConvertor object = new TimeConvertor();
        object.convert(3.5f);
    }
    public void convert(float minutes) {
        System.out.println(minutes * 60);
    }
}
