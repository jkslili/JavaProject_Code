package StruCode;

public class 折半 {
    /*
    逻辑正确，代码存在错误
     */
    public static void main(String[] args) {
        boolean flag=二分法(0,9,new int[] {1,2,3,4,5,6,7,8,9,10},2);
        System.out.println(flag);
    }
    static boolean 二分法(int index,int end,int [] arr,int n){
        int res=(index+end)/2;
        if(res==index||res==end)
            return false;
        if(arr[res]!=n) {
            if(arr[res]<n)
                return 二分法(index,res,arr,n);
            else
                return 二分法(res,end,arr,n);
        }
        else
            return true;

    }
}
