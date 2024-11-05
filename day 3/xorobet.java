import java.util.Scanner;

public class xorobet {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner u =new Scanner(System.in);
        int l=u.nextInt(),r=u.nextInt();
        int a= xor(r);
        int b= xor(l-1);
        System.out.println(a^b);
    }
    public static int xor(int n) {
        if(n%4==1) return 1; 
        if(n%4==2) return n+1;
        if(n%4==3) return 0;
        return n;
    }
}
