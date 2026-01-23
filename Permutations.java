package Arrays_Program;

import java.util.ArrayList;
import java.util.List;

public class Permutations 
{
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,0,result);
        return result;
    }
    private static void backtrack(int[] nums,int index,List<List<Integer>> result){
        if(index==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int n:nums){
                list.add(n);
            }
            result.add(list);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            backtrack(nums,index+1,result);
            swap(nums,index,i);
        }
    }
    private static void swap(int[] nums,int m,int n){
        int temp=nums[m];
        nums[m]=nums[n];
        nums[n]=temp;
    }
    public static void main(String[] args) 
    {
        int[] nums={1,2,3};
        List<List<Integer>> res=permute(nums);

        for(List<Integer> ans:res){
            System.out.println(ans);
        }
    }
}
