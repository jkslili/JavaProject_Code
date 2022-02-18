package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Day9 {
    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<String>();
        for (int i = n; i >=2; i--) {
            for (int j = 1; j <= n; j++) {
                if(j>i)
                    continue;
                if(gcd(j,i)==1)
                    res.add(j+"/"+i);

            }
        }
        return res;
    }
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
