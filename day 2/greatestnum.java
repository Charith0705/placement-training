import java.util.Scanner;
public class greatestnum {
    public static void main(String[] args) {
        try (Scanner u = new Scanner(System.in)) {
            int a=u.nextInt(),b=u.nextInt(),c=u.nextInt();
            if (a>b && a>c) {
                System.out.println(a+"is the greatest number");
            }
            else if (b>a && b>c) {
                System.out.println(b+"is the greatest number");
            }
            else{
                System.out.println(c+"is the greatest number");
            }
        }
    }
}
