/* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360 */

import java.util.Scanner;
public class dairealan {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarı çapını giriniz: ");
        r = inp.nextInt();
        System.out.print("Lütfen dairenin merkez açı ölçüsünü giriniz: ");
        a = inp.nextInt();

        alan = (pi * (r*r) * a) / 360;
        
        System.out.print("Bilgilerini girdiğiniz dairenin alanı: " + alan);



       


    }
}
