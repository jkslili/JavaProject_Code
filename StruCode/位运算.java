package StruCode;

public class 位运算 {
    public static void main(String[] args) {
        int n = -13;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n>>3);
        System.out.println(n>>>3);  //带符号
        System.out.println(n<<2);
    }
}
