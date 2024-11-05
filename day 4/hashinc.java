import java.util.Scanner;
public class hashinc {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        int n=u.nextInt();
        int[] array= new int[n +1];
        for(int i=1;i<=n;i++){
            int k=u.nextInt();
            array[k]=i;
        }
        for(int i=1;i<=n;i++){
            System.out.println(array[i]+" ");
        }

    }
}
