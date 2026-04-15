package Arrays_Program;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public static int[] productExceptSelf(int[] nums) {

        int n=nums.length;

        int[] pre=new int[n];
        int[] suf=new int[n];
        int[] res=new int[n];

        pre[0]=1;

        for(int i=1;i<n;i++)
        {
            pre[i]=nums[i-1] * pre[i-1];
        }

        suf[n-1]=1;

        for(int j=n-2;j>=0;j--)
        {
            suf[j]=nums[j+1] * suf[j+1];
        }

        for(int k=0;k<n;k++){
            res[k]= pre[k] * suf[k];
        }

        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        int[] result = productExceptSelf(a);

        System.out.println("Input: " + Arrays.toString(a));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
