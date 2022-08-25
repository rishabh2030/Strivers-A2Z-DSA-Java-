// package array;

import java.util.Arrays;

public class checkIfArrayIsSortedOrNot {
    public static void main(String[] args) {
    int arr [] = {3,4,5,1,2};
    System.out.println(navtiveApprouch(arr));
    }
    public static boolean navtiveApprouch(int [] arr)
    {
        int count = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                count++;
            }
        }
        if(arr[0]<arr[arr.length-1])
        {
            count++;
        }
        if(count <= 1)
        {
            return true;
        }
        return false;
    }
}
