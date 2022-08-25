import java.util.Arrays;

public class rotateAnArray {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12,14,16,18,20};
        int k = 3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }   
    public static void rotate(int [] arr,int k)
    {
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);        
    }
    public static void reverse(int []arr,int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
