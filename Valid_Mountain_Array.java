package Arrays_Program;
/*
Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
 */
public class Valid_Mountain_Array {
    
    public static boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int index=0;
        if(n<3){
            return false;
        }
        for(int i=0;i<n-1;i++){
            
            if(arr[i]==arr[i+1]){
                return false;
            }
            if(arr[i]>arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==0){
            return false;
        }
        for(int j=index;j<n-1;j++){
            if(arr[j]==arr[j+1]){
                return false;
            }
            if(arr[j]<arr[j+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1={2,1};
        int[] arr2={3,5,5};
        int[] arr3={0,3,2,1};
        System.out.println(validMountainArray(arr1));
        System.out.println(validMountainArray(arr2));
        System.out.println(validMountainArray(arr3));
    }
    
}
