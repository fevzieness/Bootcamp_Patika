// Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan program yazınız.


import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar , kdv , kdvliTutar , kdvTutari ;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Fiyatını Giriniz : ");
        tutar = input.nextDouble();

        boolean kdvOrani = (0 < tutar) && (tutar < 1000);
        kdv = kdvOrani ? 0.18 : 0.08 ;
        kdvTutari = tutar * kdv ;
        kdvliTutar = tutar + kdvTutari ;

        System.out.println("Ürün Fiyatı : " + tutar);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("KDV'li Fiyat : " + kdvliTutar);

    }
}


