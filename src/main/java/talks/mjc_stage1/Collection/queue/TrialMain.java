package talks.mjc_stage1.Collection.queue;

import java.util.List;

public class TrialMain {
    public static void main(String[] args) {
        PriorityQueueCreater object = new PriorityQueueCreater();
        List<String> first = List.of("Java", "PriorityQueue", "class");
        List<String> second = List.of("It", "is", "different", "from", "standard", "queues", "where", "FIFO");
        System.out.println(object.createPriorityQueue(first, second));

    }
}
