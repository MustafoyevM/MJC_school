package talks.mjc_stage1.Collection.setInterface;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashSetCreater {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        int size = sourceList.size();
        HashSet<Integer> list = new HashSet<Integer>();
        for (Integer number : sourceList) {
            if (number % 2 == 0) {
                while (number % 2 == 0) {
                    list.add(number);
                    number /= 2;
                    if (number == 1)
                        list.add(number);
                }
            } else {
                list.add(number);
                list.add(number * 2);
            }
        }
        return list;
    }
}
