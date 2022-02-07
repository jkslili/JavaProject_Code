package LeetCode;

import java.util.*;


public class Day5 {
    /**
     *
     * @param num_money int整型 奖金的总数,单位为元
     * @return int整型
     */
    static int CalulateMethodCount (int num_money) {
        int sum=0;
        if(num_money==0)
            return 1;
        if(num_money!=0)
            for(int i=1;i<=2;i++)
            sum += CalulateMethodCount(num_money-i);
        return sum;

    }

    public static void main(String[] args) {
        Integer i01 = -128;
        int i02 = -128;
        Integer i03 =Integer.valueOf(-128);
        Integer i04 = new Integer(-128);
        System.out.println(i01 == i02);
    }
}