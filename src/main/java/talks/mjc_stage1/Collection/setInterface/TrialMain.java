package talks.mjc_stage1.Collection.setInterface;

import java.util.List;

public class TrialMain {
    public static void main(String[] args) {
        HashSetCreater object = new HashSetCreater();
        System.out.println(object.createHashSet(List.of(2, -1, 3, 8, -5, 12)));
    }
}
