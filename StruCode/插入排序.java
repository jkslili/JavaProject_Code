package StruCode;

public class 插入排序 {
    static void insertArrays(int [] arr){
        int length=arr.length;
        if(arr==null|| length<2)
            return;
        for(int i=1;i<length;i++)
        {
            for (int j =i ; j >=1; j--) {
                if(arr[j]<arr[j-1] && arr[j]!=arr[j-1])
                {
                    arr[j] ^= arr[j-1];
                    arr[j-1] ^= arr[j];
                    arr[j] ^= arr[j-1];
                }

            }
        }
    }
}
