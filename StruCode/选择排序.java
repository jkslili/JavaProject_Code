package StruCode;

public class 选择排序 {
    /*
    function: start min to end max
     */
    static public void selectArray(int []arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                index = arr[index] > arr[j] ? j : index;
            }
            if(index==i)
                continue;
            arr[i] = arr[i] ^ arr[index];
            arr[index] = arr[i] ^ arr[index];
            arr[i] = arr[i] ^ arr[index];

        }
    }

    public static void main(String[] args) {
        int [] arr={9,2,1,5,3,7,8};
        //selectArray(arr);
        插入排序.insertArrays(arr);
        display(arr);
    }
    static void display(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
