package Arrays_Program;

import java.util.HashMap;

/* Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */

public class Contains_Duplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int j=map.get(nums[i]);

                if((i - j) <= k)
                {
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.print(containsNearbyDuplicate(nums,k));
    }
}
