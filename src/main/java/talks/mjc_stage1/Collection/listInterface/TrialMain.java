package talks.mjc_stage1.Collection.listInterface;

import java.util.List;

public class TrialMain {

    public static void main(String[] args) {
//        LinkedListCreater listCreater = new LinkedListCreater();
//        System.out.println(listCreater.createLinkedList(List.of(1, 8, 9, 10, 11, 16, 18)));
//        ArrayListCreater arrayListCreater = new ArrayListCreater();
//        System.out.println(arrayListCreater.createArrayList(List.of("The", "ArrayList", "class", "has", "many",
//                "useful", "methods")));
        ListSorter listSorter = new ListSorter();
        List<String> list = List.of("-5", "-12", "0", "20", "9", "-20", "37");
        listSorter.sort(list);
        System.out.println(list);
    }
}
