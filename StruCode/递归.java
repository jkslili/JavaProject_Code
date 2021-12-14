package StruCode;

public class 递归 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            fun(i);
            System.out.println(i);
        }
    }
    static int fun(int i)
    {
        if(i==0)
            return 0;
        else
            return fun(--i);
    }
}
