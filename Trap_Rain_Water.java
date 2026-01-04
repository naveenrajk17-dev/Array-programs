package Arrays_Program;
/* 
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 */
public class Trap_Rain_Water {
    public static int trap(int[] height) 
    {
        int left = 0;
        int right = height.length - 1;

        int leftmax = 0;
        int rightmax = 0;
        int totalwater = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftmax) {
                    leftmax = height[left];
                } else {
                    totalwater += leftmax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightmax) {
                    rightmax = height[right];
                } else {
                    totalwater += rightmax - height[right];
                }
                right--;
            }
        }
        return totalwater;
    }
        /* 
        int[] max_left=new int[height.length];
        int[] max_right=new int[height.length];
   
           int totalwater=0;
        
           max_left[0] = height[0]; 
           max_right[max_right.length-1] = height[height.length-1]; 

            for(int l=1;l<max_left.length;l++){
                max_left[l]=Math.max(max_left[l-1],height[l]);
            }
            for(int r=max_right.length-2;r>=0;r--){
                max_right[r]=Math.max(max_right[r+1],height[r]);
            }


        for(int i=0;i<height.length;i++){

            int water=Math.min(max_left[i],max_right[i])-height[i];
              if(water>0){
                totalwater+=water;
               }
        }
        return totalwater;
    }*/
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
