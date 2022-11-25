import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double alan,cevre,u;
        System.out.print("Üçgenin 1.kenarını giriniz:");
        a = input.nextInt();
        System.out.print("Üçgenin 2.kenarını giriniz:");
        b =input.nextInt();
        System.out.print("Üçgenin 3.kenarını giriniz:");
        c = input.nextInt();
        cevre=a + b + c;
        u = cevre / 2;
        alan = Math.sqrt(u * (u-a)*(u-b)*(u-c));
       System.out.println("Üçgenin ALANI:" +alan);


    }
}
