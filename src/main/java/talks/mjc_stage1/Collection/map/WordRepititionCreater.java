package talks.mjc_stage1.Collection.map;

import talks.mjc.module6.Main;

import java.util.HashMap;
import java.util.Map;

public class WordRepititionCreater {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence = sentence.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        if(sentence.length() < 1)
            return map;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= 97 && sentence.charAt(i) <= 122 || sentence.charAt(i) == 32){}
            else{

                sentence = sentence.replace(Character.toString(sentence.charAt(i)),"");
            }
        }

        for (String str : sentence.split(" ")) {
            if(map.containsKey(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }
        return map;
    }
}
class tRILA{
    public static void main(String[] args) {
        System.out.println((int)((char)(',')));
    }
}