public class sumofdigit {
    public static void main(String[] args) {
        int a=255,rem,temp=0;
        while (a!=0) {
            rem=a%10;
            temp=temp+rem;
            a=a/10;
        }
        System.out.println(temp);
    }
}
