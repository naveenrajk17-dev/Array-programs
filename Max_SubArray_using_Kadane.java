package Arrays_Program;
/* Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.  */
public class Max_SubArray_using_Kadane {
    public static int maxSubArray(int[] nums) {
        int currrent_sum=0;
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            currrent_sum +=nums[i];
            Max=Math.max(currrent_sum,Max);
            if(currrent_sum<0)
            {
                currrent_sum=0;
            }
        }
        return Max;
    }
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        
        System.out.println(maxSubArray(a));
    }
}
