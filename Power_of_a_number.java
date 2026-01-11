public class Power_of_a_number {
    public static int power(int num,int pow){
        int result=1;
        for(int i=0;i<pow;i++){
            result *=num;
        }
        return result;
    }
    public static void main(String[] args) {
        int num=2;
        int pow=4;
        System.out.println(power(num,pow));
    }
}
