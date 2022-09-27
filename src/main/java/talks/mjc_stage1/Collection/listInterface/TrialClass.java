package talks.mjc_stage1.Collection.listInterface;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TrialClass {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        list.addIfAbsent("four");
        list.addIfAbsent("one");

        ListIterator<String> it = list.listIterator(list.size());
        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
