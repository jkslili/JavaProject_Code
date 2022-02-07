package LeetCode;

public class Day4 {
    public static void main(String[] args) {

    }
    static String longestCommonPrefix(String[] strs) {
        int leng=200,index=0;
        for (int i = 0; i <strs.length ; i++) {
            if(strs[i].length()<leng)
            {
                leng=strs[i].length();
                index=i;
            }
        }
        for(int i=0; i < strs[index].length();i++)
        {
            for(int j=0; j < strs.length;j++)
            {

            }
        }
        return strs[0];
    }
}
