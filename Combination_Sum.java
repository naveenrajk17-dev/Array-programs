package Arrays_Program;

import java.util.ArrayList;
import java.util.List;
/*Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: [] */
public class Combination_Sum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),result);
        return result;
    }

    private static void backtrack(int[] candidates, int target,int index,
    List<Integer> currentlist,  List<List<Integer>> result)
    {
        if(target<0)
        {
            return;
        }

        if(target==0)
        {
            result.add(new ArrayList<>(currentlist));
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            currentlist.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i,currentlist,result);
            currentlist.remove(currentlist.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result =combinationSum(candidates, target);

        System.out.println(result);
    }
}
