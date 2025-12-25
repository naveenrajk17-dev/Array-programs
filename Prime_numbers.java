package Arrays_Program;
import java.util.*;
public class Prime_numbers {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter array size : ");
        int size=sc.nextInt();
        int[] a=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("enter array elements : ["+i+"] : ");
            a[i]=sc.nextInt();
        }
        int res=prine_count(a);
        System.out.print("Total prime Number : "+res);
        
    }
    public static int prine_count(int[] a){
        int pcount=0;
        for(int i=0;i<a.length;i++){
            int num=a[i];
            if(num<=1){
                continue;
            }

            int divisior_count=0;
            
            for(int j=1;j<=num;j++){
                if(num%j==0){
                    divisior_count++;
                }

            }
            if(divisior_count==2){
                pcount++;
            }
        }
        return pcount;
    }
}
