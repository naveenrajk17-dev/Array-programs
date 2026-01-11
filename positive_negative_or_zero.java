public class positive_negative_or_zero {
    public static void number(int num){
        if(num==0){
            System.out.println("Zero");
        }
        else if(num>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negetive");
        }
    }
    public static void main(String[] args) {
        number(0);
    }
}
