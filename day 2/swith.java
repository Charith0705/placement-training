import java.util.Scanner;
public class swith {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        int a=u.nextInt();
        switch (a) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
        
            default:
                break;
        }
    }
}
