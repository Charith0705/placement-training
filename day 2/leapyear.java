import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        try (Scanner u = new Scanner(System.in)) {
            int a=u.nextInt();
            if (a%4==0 || a%100==0 || a%400==0) {
                System.out.println("the year is leap year");
            }
            else{
                System.out.println("the year is not leap year");
            }
        }
    }
}
