import java.util.Scanner;
public class halfrev {
    public static void main(String[] args) {
        try (Scanner u = new Scanner(System.in)) {
            int n=u.nextInt();
            int[] array= new int[n +1];
            for(int i=0;i<=n;i++){
                array[i]=u.nextInt();
            }
            int temp=0;
            for(int i=0,j=n/2-1;i<n/4;i++,j--){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            } 
            for(int i=0;i<n;i++) System.out.println(array[i]+" ");
        }
    }
}
