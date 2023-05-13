import java.util.Scanner;
public class kasa {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        /*a = Armut
         * e = Elma
         * d = Domates
         * m = Muz
         * p = Patlıcan
         */
        double a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5.00;
        double aF, eF, dF, mF, pF, toplam;

        Scanner input = new Scanner(System.in);
        
        // Kullanıcıdan Veri Alınız
        System.out.print("Kaç Kg Armut Aldınız: ");
        aF = input.nextDouble();

        System.out.print("Kaç Kg Elma Aldınız: ");
        eF = input.nextDouble();

        System.out.print("Kaç Kg Domates Aldınız: ");
        dF = input.nextDouble();

        System.out.print("Kaç Kg Muz Aldınız: ");
        mF = input.nextDouble();

        System.out.print("Kaç Kg Patlıcan Aldınız: ");
        pF = input.nextDouble();

        // Matematiksel Formülasyonları Yazıyoruz
        toplam = (a * aF) + (e * eF) + (d * dF) + (m * mF) + ( p * pF);

        System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplam);







    }
}
