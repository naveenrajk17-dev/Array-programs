package Arrays_Program;

import java.util.Arrays;
/* Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0 */
public class Count_Primes {
    public static int countPrimes(int n) {
        if (n <= 2){
            return 0;
        }

        int Count_Primes=0;
        boolean[] is_prime=new boolean[n];
        Arrays.fill(is_prime,true);
        is_prime[0]=false;
        is_prime[1]=false;

        for(int i=2;i*i<n;i++){
            if(is_prime[i])
            {
                for(int j=i*i;j<n;j+=i)
                {
                is_prime[j]=false;
                }
            }           
        }

        for(int i=2;i<n;i++){
            if(is_prime[i]){
                Count_Primes++;
            }
        }
        return Count_Primes;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }
}
