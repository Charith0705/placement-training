import java.util.Scanner;
class h {
    public static void main(String[] args){
        int d,c;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            d=scan.nextInt();
            System.out.print("Enter b number:");
            c=scan.nextInt();
        }
        System.out.println("a="+d);
        System.out.print("b="+c);
    }
    
}