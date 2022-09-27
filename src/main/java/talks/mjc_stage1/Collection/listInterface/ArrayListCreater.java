package talks.mjc_stage1.Collection.listInterface;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreater {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        int length = sourceList.size();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            if(i % 3 == 0){
                result.add(sourceList.get(i - 1));
                result.add(sourceList.get(i - 1));
            }
        }

        return result;
    }
}
