package Arrays_Program;

import java.util.Arrays;
/* Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
  */
public class Next_Permutation {
    public static void nextPermutation(int[] nums) {
     int n=nums.length;
     int i=n-2; 
     
     while(i>=0 && nums[i]>=nums[i+1])
     {
        i--;
     } 

     if(i>=0)
     {
        int j=n-1;
        while(nums[j]<=nums[i])
        {
            j--;
        }
     
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    // Reverse right side
    int left = i + 1;
    int right = n - 1;

    while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,1,5};

        System.out.println("Before: " + Arrays.toString(arr));

        nextPermutation(arr);

        System.out.println("After:  " + Arrays.toString(arr));
    }
}
