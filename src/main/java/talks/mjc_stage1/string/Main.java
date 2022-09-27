package talks.mjc_stage1.string;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringSplitter stringSplitter = new StringSplitter();
        Collection<String> object = List.of("\\(","\\)", "|");
        stringSplitter.splitByDelimiters(" so on are you know (anything) " +
                "or any action for example: (third exprience) | fourth experience", object);


    }
}
