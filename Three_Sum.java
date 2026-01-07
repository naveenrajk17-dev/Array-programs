package Arrays_Program;
import java.util.*;
/* Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0. */
public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> st=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    st.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){j++;}
                    while(j<k && nums[k]==nums[k+1]){k--;}
                }
            }
        }
        return st;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = threeSum(nums);

        System.out.println("3Sum Triplets:");
        for (List<Integer> triplet : ans) {
            System.out.println(triplet);
        }
    }
}
// it will take long time to run. but the time=n^2 space=n^2
/*class InnerThree_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> st=new HashSet<>();

        for(int i=0;i<nums.length-2;i++){

            Set<Integer> hs=new HashSet<>();

            for(int j=i+1;j<nums.length;j++){

                
                int sum = -(nums[i]+nums[j]);

                if(hs.contains(sum))
                {
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],sum);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hs.add(nums[j]);
            }
        }
        return new ArrayList<>(st);
    }
}*/
/* nums[i] + nums[j] + nums[k] = 0
                   third = -(nums[i] + nums[j]) */
