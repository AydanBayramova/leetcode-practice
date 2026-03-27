package strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (map.containsKey(sChar)) {
                if (tChar != map.get(sChar)) return false;
            } else {
                if (map.containsValue(tChar)) return false;

                map.put(sChar, tChar);

            }
        }
        return true;
    }
}
