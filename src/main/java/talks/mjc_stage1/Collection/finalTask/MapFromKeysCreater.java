package talks.mjc_stage1.Collection.finalTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreater {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap){
        Map<Integer, Set<String>> map = new HashMap<>();
        try {

            for (Map.Entry<String, Integer> temp : sourceMap.entrySet()) {
                if (!map.containsKey(temp.getKey().length()))
                    map.put(temp.getKey().length(), Set.of(temp.getKey()));
                else {
                    Set<String> temp2 = new HashSet<>();
                    temp2.addAll(map.get(temp.getKey().length()));
                    temp2.add(temp.getKey());
                    map.put(temp.getKey().length(), temp2);//get(temp.getKey().length())
                }//Set.of(temp.getKey()).addAll(
            }
        }
        catch (Exception e){

        }
        return map;
    }
}
