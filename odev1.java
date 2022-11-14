import java.util.Scanner;
public class odev1 {
    public static void main(String[] args) {

    double kilo, boy ;
    Scanner inp = new Scanner(System.in);

    System.out.print("Lütfen kilonuzu giriniz : ");
    kilo = inp.nextDouble();
    System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
    boy = inp.nextDouble();
    double vucutKitleEndeksi = (kilo / (boy * boy)) ;
    System.out.print(" vücur kitle endeksiniz : "+ vucutKitleEndeksi);
    }
}
