public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,0,1};
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
    public static int findMaxConsecutiveOnes(int []arr)
    {
        int max = -1;
        int count = 0;
        for(int val : arr)
        {
            if(val == 1)
            {
                count++;
            }
            else{
                max = Math.max(count,max);
                count = 0;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}
