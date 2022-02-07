package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day2_3 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans = new LinkedList<Boolean>();
        String res = "";
        String temp;
        for(int i = 0;i < A.length ; i++)
            res += Integer.toString(A[i]);
        for(int i=1;i<=A.length;i++) {
            temp = res.substring(0,i);
            if(temp.length()==1 && temp.equals(0)) {
                ans.add(true);
                continue;
            }
            else if(temp.length()==2)
            {
                ans.add(false);
                continue;
            }
            else if(temp.length()>=3) {



            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        System.out.println("1234".substring(0,0));
    }
}
