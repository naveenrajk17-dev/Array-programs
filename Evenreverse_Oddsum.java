package Arrays_Program;
import java.util.*;
public class Evenreverse_Oddsum {
    public static void main(String[] args) {
        int[] ar={102,541,745,174,34};
        for(int i=0;i<ar.length;i++){
            int num=ar[i];
            if(num%2==0){
                int rev=0;
                while(num>0){
                    rev=rev*10+num%10;
                num /=10;
                }
                ar[i]=rev;
            }
            else{
                int sum=0;
                while(num>0){
                    sum=sum+num%10;
                    num /=10;
                }
                ar[i]=sum;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
