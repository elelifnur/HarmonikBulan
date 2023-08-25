import java.util.Scanner;
public class HarmonikBulan {
    public static void main(String[] args){
        int n;
        double total=0.0;

        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        n= input.nextInt();
        for(double i=1;i <= n ;i++){
            total+=(1/i);
        }
        System.out.println(total);
    }
}
