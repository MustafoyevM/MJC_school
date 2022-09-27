package talks.mjc.module4_1.finalTask;

public class TriangleValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        System.out.println(((firstSide + secondSide) > thirdSide
                && (secondSide + thirdSide) > firstSide
                && (firstSide + thirdSide) > secondSide) ? "this is a valid triangle" :
                "it's not a triangle");
    }
}
