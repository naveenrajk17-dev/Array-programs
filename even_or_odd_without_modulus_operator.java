public class even_or_odd_without_modulus_operator 
{
    public static void Even_or_Odd(int number){
        if((number & 1)== 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Even_or_Odd(11);
    }
}
