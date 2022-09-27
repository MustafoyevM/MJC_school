package talks.mjc_stage1.Collection.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap){
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> temp : sourceMap.entrySet()) {
            if(!map.containsKey(temp.getValue()))
                    map.put(temp.getValue(), temp.getKey());
        }
        return map;
    }

}
