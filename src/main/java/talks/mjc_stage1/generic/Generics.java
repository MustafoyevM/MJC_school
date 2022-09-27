package talks.mjc_stage1.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Generics {
    //TODO: Refactor Method-1
    public List<List<String>> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> Object genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public void cloneMethod(List<Object> consumer, List<Object> producer) {
        consumer.addAll(producer);
    }

}
