import java.util.Scanner;

public class sınıgGecme {
    public static void main(String[] args) {
        // Değişken dersleri tanımlama
        int Matematik, Fizik, Türkçe, Kimya, Müzik;

        // Scanner sınıfı tanımlıyoruz
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan İnput Al
        System.out.print("Lütfen Matematik Notunuzu Giriniz: ");
        Matematik = input.nextInt();

        System.out.print("Lütfen Fizik Notunuzu Giriniz: ");
        Fizik = input.nextInt();

        System.out.print("Lütfen Türkçe Notunuzu Giriniz: ");
        Türkçe = input.nextInt();

        System.out.print("Lütfen Kimya Notunuzu Giriniz: ");
        Kimya = input.nextInt();

        System.out.print("Lütfen Müzik Notunuzu Giriniz: ");
        Müzik = input.nextInt();

        int toplam = (Matematik + Fizik + Türkçe + Kimya + Müzik);
        double ortalama = toplam / 5;

        if (ortalama >= 55) {
            System.out.println("Sınıfı geçtiniz. Ortalamanız : " + ortalama);
        } else {
            System.out.println("Sınıfta kaldınız. Ortalamanız : " + ortalama);
        }

    }
}
