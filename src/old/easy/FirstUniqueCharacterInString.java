package old.easy;

/**
 * Given a string s,
 * find the first non-repeating character in it and return its index. If it does not exist, return -1.
 **/

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

        static public int firstUniqChar(String s) {
            int result = -1;
            Map<Character, Integer> chars = new LinkedHashMap<>();
            for(int i = 0; i < s.length(); i++){
                if(chars.containsKey(s.charAt(i))) {
                    chars.put(s.charAt(i),chars.get(s.charAt(i))+1);
                } else chars.put(s.charAt(i),0);
            }

            for(int j = 0; j < s.length() ;j++){
                if(chars.get(s.charAt(j))==1){
                    return j;
                }
            }
            return -1;
        }

}
