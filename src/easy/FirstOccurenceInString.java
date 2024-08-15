package easy;

public class FirstOccurenceInString {
    public int strStr(String haystack, String needle) {
        int hl= haystack.length();
        int nl = needle.length();

        if(!haystack.contains(needle) || nl>hl) return -1;
        if(hl == nl) {
            return  haystack.equals(needle)?0:-1;
        }
        for(int i=0; i <hl-nl; i++){
            if(haystack.substring(i, i + nl).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
