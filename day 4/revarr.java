import java.util.Scanner;
public class revarr {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        int n=u.nextInt();
        int[] array= new int[n +1];
        for(int i=0;i<=n;i++){
            array[i]=u.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
