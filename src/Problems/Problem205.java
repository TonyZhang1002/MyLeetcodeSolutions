package Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem205 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> table = new HashMap<>();
        Set<Character> mapped = new HashSet<>();
        for(int i=0; i < s.length(); i++){
            char ch1 = s.charAt(i), ch2 = t.charAt(i);
            if(table.containsKey(ch1)){
                if(ch2 != table.get(ch1))
                    return false;
            }else{
                if(mapped.contains(ch2)) return false;
                mapped.add(ch2);
                table.put(ch1, ch2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "aa"));
    }
}
