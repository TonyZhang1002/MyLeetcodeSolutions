package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem49 {
    public ArrayList<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List<String>> ans = new HashMap<>();
        for (String s : strs) {
            char[] sChars = s.toCharArray();
            Arrays.sort(sChars);
            String key = String.valueOf(sChars);
            if (!ans.containsKey(key))  ans.put(key, new ArrayList<>());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
