package talks.mjc_stage1.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

public class StringSplitter {
    /**
     * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
     *
     * @param source     source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        List<String> result = new ArrayList<>();
        String temp = source;
        for (String s : delimiters) {
            StringTokenizer st = new StringTokenizer(source, s);
            temp = "";
            while(st.hasMoreTokens()){
                temp = temp + st.nextToken() + " ";
            }
        }/*" so on are you know (anything) " +
                "or any action for example: (third exprience) | fourth experience"*/
        StringTokenizer st2 = new StringTokenizer(temp, " ");
        while (st2.hasMoreTokens()){
            result.add(st2.nextToken());
        }
        return result;
    }
}
