
/*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın. 
  1.Taksimetre KM başına 2.20 TL tutmaktadır.
  2.Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
  3.Taksimetre açılış ücreti 10 TL'dir. */

import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
    int km;
    double perKm = 2.20, total, StartPrice = 10;
    Scanner input = new Scanner(System.in);
    System.out.print("Mesafeyi KM cinsinden giriniz: ");
    km = input.nextInt();
    
    total = km * perKm;
    total += StartPrice;

    total = (total < 20) ? 20 : total;
    System.out.println("Toplam tutar :" + total);


    
    }
}
