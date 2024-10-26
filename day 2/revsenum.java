public class revsenum {
    public static void main(String[] args) {
        int n=1234,rem,temp=0;
        while(n!=0){
            rem=n%10;
            temp=temp*10+rem;
            n=n/10;
        }
        System.out.println(temp);
    }
}
