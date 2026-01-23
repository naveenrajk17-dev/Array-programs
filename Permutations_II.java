package Arrays_Program;
/*
Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]] */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations_II {
    public static List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,0,result);
        return result;
    }
    private static void backtrack(int[] nums,int index,List<List<Integer>> result)
    {
        if(index==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int n:nums){
                list.add(n);
            }
            result.add(list);
            return;
        }

        HashSet<Integer> hs=new HashSet<>();

        for(int i=index;i<nums.length;i++){

            if(hs.contains(nums[i])){
                continue;
            }
            hs.add(nums[i]);

            
            swap(nums,index,i);
            backtrack(nums,index+1,result);
            swap(nums,index,i);
        }
    }
    private static void swap(int[] nums,int m,int n)
    {
        int temp=nums[m];
        nums[m]=nums[n];
        nums[n]=temp;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2};
        List<List<Integer>> res=permuteUnique(nums);

        for(List<Integer> ans:res){
            System.out.println(ans);
        }
    }
}
