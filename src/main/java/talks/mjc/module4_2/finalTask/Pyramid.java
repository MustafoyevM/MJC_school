package talks.mjc.module4_2.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        if(cathetusLength == 0){
            return;
        }
        StringBuilder copy = new StringBuilder();
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if(cathetusLength - i >= j){
                    s.append(" ");
                }

            }
            if(i != 1){
                copy.append(i);
            }
            if(i != 1){
                s.append(copy.reverse());
                s.append(1);
                s.append(copy.reverse());
            }
            else
                s.append(1);
            if(i != cathetusLength)
                s.append("\n");
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
