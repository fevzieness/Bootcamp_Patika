import java.util.Scanner;
public class vucutkitleindeks {
    public static void main(String[] args) {
        // Değişkenleri tanımlayınız.
        double kilo, boy, indeks;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Giriniz(kg): ");
        kilo = inp.nextDouble();

        System.out.print("Lütfen Boyunuzu Giriniz(m): ");
        boy = inp.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + indeks);

    }
}
