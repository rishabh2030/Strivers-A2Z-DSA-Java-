public class longestSubarrayWithGivenSumK {
    public static void main(String[] args) {
        int [] arr = {10, 5, 2, 7, 1, 9};
        subArraySum(arr,15);
    }
    public static int subArraySum(int [] arr,int sum)
    {
        // int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                // int currSum = 0;
                for(int k=i ; k <= j ; k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
        return 0;
    }
}
