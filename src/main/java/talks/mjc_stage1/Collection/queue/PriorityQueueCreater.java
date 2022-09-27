package talks.mjc_stage1.Collection.queue;


import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreater {


    public PriorityQueue<String> createPriorityQueue
            (List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priority = new PriorityQueue<String>(Comparator.reverseOrder());

        priority.addAll(firstList);
        priority.addAll(secondList);
        return priority;
    }
}

//class Compare implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        int result = o1.compareTo(o2);
//        if (result == 0)
//            result = o1.compareTo(o2);
//        return result;
//    }
//}
/*"Java", "PriorityQueue", "class");
("It", "is", "different", "from", "standard", "queues", "where", "FIFO");
["where", "standard", "queues", "is", "from", "different", "class",  "PriorityQueue", "Java", "It", "FIFO"]
*/

/* List<String> listUpper = new ArrayList<>();
        List<String> listLower = new ArrayList<>();
        for (String str : firstList) {
            if(Character.isUpperCase(str.charAt(0)))
                listUpper.add(str);
            else
                listLower.add(str);
        }
        for (String str : secondList) {
            if(Character.isUpperCase(str.charAt(0)))
                listUpper.add(str);
            else
                listLower.add(str);
        }


        priority.addAll(listLower);
        priority.addAll(listUpper);


        return priority;
        */
