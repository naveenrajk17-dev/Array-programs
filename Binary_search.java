package Arrays_Program;

public class Binary_search {
    public static int binarysearch(int[] a,int element)
    {
        int index=-1;
        int left=0,right=a.length-1;
        while(left<=right)
        {
            
            int mid=(left+right)/2;
            if(element==a[mid]){
                index=mid;
                return index;
            }
            else if(element>a[mid]){
                left=mid+1;
            }
            else if(element<a[mid]){
                right=mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] a={3,4,5,7,8,9};
        int element=4;
        
        System.out.println("The Element "+element+" is in Index : "+binarysearch(a,element));
    }
}
