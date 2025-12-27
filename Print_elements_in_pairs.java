package Arrays_Program;
public class Print_elements_in_pairs {
    public static void pairs(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] a={8,4,3,6,2};
        pairs(a);
    }
}
