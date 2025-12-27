package Arrays_Program;

public class SubArray {
    public static void display(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] a={8,4,3,6,2};
        display(a);
    }
}
