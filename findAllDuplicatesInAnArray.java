// package array;

import java.util.ArrayList;
import java.util.HashMap;

public class findAllDuplicatesInAnArray {
    public static void main (String []args)
    {
        int [] arr = {4,3,2,7,8,2,3,1};
       for (int i : getAllDuplicates(arr)) {
            System.out.println(i);
       }  
    }
    public static ArrayList<Integer> getAllDuplicates(int []arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int val : arr)
        {
            if(map.containsKey(val))
            {
                ans.add(val);
            }
            map.put(val,1);
        }
        return ans;
    }
}
