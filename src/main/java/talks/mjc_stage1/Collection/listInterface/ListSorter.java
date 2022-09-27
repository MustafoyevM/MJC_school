package talks.mjc_stage1.Collection.listInterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

//ListComparator

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return (Math.abs(Integer.parseInt(o1)) > Math.abs(Integer.parseInt(o2)) ? 1 : -1);
    }
}
//Math.abs(Integer.parseInt(o1)):Math.abs(Integer.parseInt(o2))