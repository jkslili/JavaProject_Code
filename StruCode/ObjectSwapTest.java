package StruCode;

public class ObjectSwapTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Swap swap = new Swap();
        double[] arr =  swap.swap(a,b);
        a=(int)arr[0];
        b=(int)arr[1];
        System.out.println(a+" "+b);
    }
}
