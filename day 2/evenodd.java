import java.util.Scanner;
class evenodd {
    public static void main(String[] args) {
        try (Scanner u = new Scanner(System.in)) {
            int n=u.nextInt();
            if (n/2==0) {
                System.out.println("the number is even");
            }
            else{
                System.out.println("the number is odd");
            }
        }
    }
}
