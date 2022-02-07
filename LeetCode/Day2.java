package LeetCode;

class Day2 {
    public int maxDepth(String s) {
        /*
          括号的最大嵌套深度
          给你一个 有效括号字符串 s，返回该字符串的 s 嵌套深度 。
          链接：https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses
         */
        int length = s.length();
        int result = 0;
        int res = 0;
        for(int i=0;i<length;i++){
            if(s.charAt(i) == '(')
                result++;
            if(s.charAt(i) == ')')
                result--;
            if(result>res)
                res=result;
        }
        return res;

    }
}