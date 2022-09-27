package talks.mjc.module4_2.task2;

public class WordsBuilder {
    public static void buildPhrase(char... chars) {
        System.out.println(chars);
    }
    public static void main(String[] args) {
        buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
    }
}
