import java.util.Scanner;
public class arrayone {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=u.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements fo array: ");
        for(int i=0;i<n;i++){
            arr[i]=u.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
