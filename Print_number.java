package Arrays_Program;

public class Print_number {
    public static void Number(int[] a){
    for(int i=0;i<a.length;i++){
            for(int j=1;j<=a[i];j++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] number={8,4,3,6,2};
        Number(number);
    }

}
