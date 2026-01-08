package Arrays_Program;

import java.util.Arrays;
/*
Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0). */
public class Three_Sum_Closest {
    public static int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int Closest_sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            int sum=0;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<Math.abs(Closest_sum-target)){
                    Closest_sum=sum;
                }
                
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
                else {
                   return sum;
                }
            }
        }
        return Closest_sum;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4}; int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }
}
