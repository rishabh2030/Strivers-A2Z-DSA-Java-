public class onesContinue {
    public static void main(String[] args) {
        int [] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int ans =  filpKBits(arr,2);
        System.out.println(ans);
    }
    public static int filpKBits(int []arr,int k)
    {
        int max = 0;
        int start = 0;
        int zeroCount = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                zeroCount++;
            }
            while(zeroCount > k)
            {
                if(arr[start] == 0)
                {
                    zeroCount--;
                }
                start++;
            }
            max = Math.max(max, i-start+1);
        }
        return max;
    }
}
