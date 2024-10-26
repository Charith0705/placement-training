public class u{
    public static void main(String[] args){
        int discount=10;
        double totalPrice=200;
        double priceAfterDiscount=totalPrice*(1-((double)discount/100));
        System.out.println("customer has paid a bill of amount:"+priceAfterDiscount);
    }
}
