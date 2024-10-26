import java.util.Scanner;
public class sqorcube {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        int a=u.nextInt();
        double x=Math.sqrt(a);
        if(x*x==a){
            System.out.println("perfect square");
        }
        else{
            System.out.println("not a perfect square");
        }
    }
}
