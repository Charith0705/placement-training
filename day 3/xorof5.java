import java.util.Scanner;
public class xorof5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int n=u.nextInt(),a=0;
        for(int i=1;i<=n;i++){
            a=a^i;
        }
        System.out.println(a);
    }
}
