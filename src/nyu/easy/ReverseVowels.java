package nyu.easy;

import java.util.*;

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
        int begin= 0; int end= s.length()-1;
        char[] c = s.toCharArray();
        Set<Character> set=new HashSet<Character>(){};
        set.addAll(List.of('A','E','I','O','U','a','e','i','o','u'));
        int tempb =-1, tempe=-1;
        char tempp = 0, temppdd = 0;
        while (begin<end) {

            if (set.contains(c[begin])){
                tempp = c[begin];
                tempb = begin;
            }

            if (set.contains(c[end])){
                tempe = end;
                temppdd = c[end];
            }
            if (tempb!=-1 && tempe!=-1){
                c[tempb] = temppdd;
                c[tempe] = tempp;
                tempb = -1;
                tempe = -1;
            }
            begin++;
            end--;
        }
        return String.copyValueOf(c);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("Euston saw I was not Sue."));
    }
}
//euston saw I was not SuE.

//Eestun sow a wIs nat Sou.
//Euston saw I was not Sue.