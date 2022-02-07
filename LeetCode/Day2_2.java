package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day2_2 {
    /*
    简化路径
     */
        public String simplifyPath(String path) {
            String [ ] strings = path.split("//*");
            List<String> res = new ArrayList<String>();
            for(int i=0;i<strings.length;i++)
            {
                if(strings[i].equals("")) {
                    continue;
                }
                if(strings[i].equals("."))
                    continue;
                if(strings[i].equals("..")){
                    if(res.size()==0)
                        continue;
                    res.remove(res.size()-1);
                    continue;
                }
                res.add(strings[i]);
            }
            path="";
            System.out.println(res.size());
            if(res.size()==0)
                return "/";
            for(int i=0;i<res.size();i++)
            {
                path += "/"+res.get(i);
            }
            return  path;
        }

    public static void main(String[] args) {
            String test="/home/";
        String [] strings = test.split("//*");
        for(int i=0;i<strings.length;i++)
        {
            System.out.println(strings[i]);

        }
    }
}
