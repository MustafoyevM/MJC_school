package talks.mjc.module4_1.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if(first % second ==0 || second % first == 0)
            System.out.println("Aliquot");
        else
            System.out.println("Not aliquot");
    }
}
