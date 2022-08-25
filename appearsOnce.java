import java.util.ArrayList;
import java.util.HashMap;

public class appearsOnce {
    public static void main(String[] args) {
        int [] arr = {5 ,5 ,8 ,8 ,11 ,11 ,12 ,12 ,14 ,14 ,24 ,27 ,27 ,28 ,28 ,31 ,31, 45, 45};
        search(arr);
    }
    public static void search(int []arr)
    {
        int ele = 0;
        for(int i=1;i<arr.length;i++)
        {
            int val = arr[i] ^ arr[i-1] ;
            if(val == 0)
            {
                ele = arr[i-1];
            }
        }
        System.out.println(ele);
    }
}

