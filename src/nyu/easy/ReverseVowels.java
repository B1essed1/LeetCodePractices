package nyu.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <h>345. Reverse Vowels of a String
 * <li>Easy
 * <li/> Topics
 * <li/>Companies
 * <li/> Given a string s, reverse only all the vowels in the string and return it.
 * <li/> The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 * */
public class ReverseVowels {
    public String reverseVowels(String s) {
        int begin= 0; int end= s.length();
        Set<Character> set=new HashSet<Character>(){};
        set.addAll(List.of('A','E','I','O','U'));
        while (begin<end) {
            int tempb =-1, tempe=-1;
            if (set.contains(s.charAt(begin))){
            }

            if (set.contains(s.charAt(end))){

            }
        }
    }
}
