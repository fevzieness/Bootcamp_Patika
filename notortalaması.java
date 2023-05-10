import java.util.Scanner;
public class notortalaması {
    public static void main(String[] args) {
        // Değişken Oluşturuyoruz
        int Matematik, Fizik, Kimya, Türkçe, Tarih, Muzik;
        
        // Scanner Sınıfı Tanımlama İşlemi
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan input al
        System.out.println("Matematik Notunuz: ");
        Matematik = inp.nextInt();

        System.out.println("Fizik Notunuz: ");
        Fizik = inp.nextInt();

        System.out.println("Kimya Notunuz: ");
        Kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz: ");
        Türkçe = inp.nextInt();

        System.out.println("Tarih Notunuz: ");
        Tarih = inp.nextInt();

        System.out.println("Müzik Notunuz: ");
        Muzik = inp.nextInt();

        int toplam = (Matematik + Fizik + Kimya + Türkçe + Tarih + Muzik);
        double ortalama = toplam / 6.0;

        System.out.println(" Not Ortalamaniz: " + ortalama);
        String sonuc = (ortalama >=60) ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);



    }

    
}