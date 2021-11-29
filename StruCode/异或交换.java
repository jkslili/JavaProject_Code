package StruCode;

public class 异或交换 {
    public static void main(String[] args) {
        /*
        原理：任何一个数字X,X^X=0.
         */
        int a = 12;
        int b = 32;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
