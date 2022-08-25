// package array;

import java.util.Arrays;
import java.util.HashSet;

public class dublicateElement {
    public static void main (String []args)
    {
        int [] arr = {2,2,2};
        bruteForce(arr);
        // System.out.println(bruteForce(arr));
        twoPointerApprouch(arr);
    }    
    public static int twoPointerApprouch(int []arr)
    {
        int j = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[j])
            {
                arr[j]=arr[i];
                j++; 
            }
        }
        System.out.println(Arrays.toString(arr));
        return j+1;
    }
    public static int bruteForce(int []arr)
    {
        HashSet<Integer> set = new HashSet<>();
        
        for(int val : arr)
        {
            set.add(val);
        }
        int j = 0;
        for (int val : set) {
            System.out.println(j);
            System.out.println(val);
            arr[j]=val;
            j++;
            
        }
        // System.out.println(Arrays.toString(arr));
        return set.size();
    }
}
