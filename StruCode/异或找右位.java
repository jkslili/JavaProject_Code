package StruCode;

public class 异或找右位 {
    public static void main(String[] args) {
        System.out.println(YI(8));
    }
    static int YI(int n)
    {
        return n & ( ~n + 1 );
    }
    int yi(int n)
    {
        return n & ( ~n + 1 );
    }

}
