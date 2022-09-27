package talks.mjc_stage1.Collection.finalTask;

import java.util.List;
import java.util.Map;

public class TrialMain {
    public static void main(String[] args) {
        LessonsGetter object = new LessonsGetter();
        System.out.println(object.getLessons(Map.of("Mondey", List.of("English"),
                "Tuesday",List.of("Mathematics"),
                "Wednesday", List.of("English", "Chemistry"),
                "Thursday", List.of("Literature", "Mathematics"),
                "Friday",List.of("Physics"))));

    }
}
