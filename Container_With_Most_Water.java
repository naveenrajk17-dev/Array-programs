package Arrays_Program;
/*
Example 1:

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1 */
public class Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_water=0;

        while(left<right)
        {
            int length=right-left;
            int water=Math.min(height[left],height[right]) * length;

            max_water=Math.max(water,max_water);

            if(height[left] < height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }

        return max_water;
    }
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}