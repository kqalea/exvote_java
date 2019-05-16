package cracking.cp1;

public class ChapterOne {
    public static boolean isUniqueChars(String str){
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i) ;
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
