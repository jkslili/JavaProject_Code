package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Day10 {
    public int findCenter(int[][] edges) {
        Set<Integer> o = new HashSet<Integer>();
        int res=0;
        for(int [] i:edges)
        {
            for(int j:i){
                if(o.contains(j))
                    o.add(j);
                else
                    return j;
            }
        }
        return res;
    }
}
