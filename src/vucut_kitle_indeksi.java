import java.util.Scanner;

public class vucut_kitle_indeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = inp.nextDouble();
        indeks = kilo/(boy*boy);
        System.out.println("Kilonuz : "+kilo);
        System.out.println("Boyunuz : "+boy);
        System.out.println("Vücut kitle indeksiniz : "+indeks);
    }
}