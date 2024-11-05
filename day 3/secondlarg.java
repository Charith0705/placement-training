import java.util.Scanner;
public class secondlarg {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int size=r.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elemnets of the array: ");
        for(int i=0;i<size;i++){
            array[i]=r.nextInt();
        }
        int largest=array[0];
        for(int i=1;i<size;i++){
            if(array[i]>largest) largest=array[i];
        }
        int s_largest=-1;
        for(int i=0;i<size;i++){
            if(array[i]>s_largest && array[i]!=largest) s_largest=array[i];
        }
        System.out.println(s_largest);
    }
}
