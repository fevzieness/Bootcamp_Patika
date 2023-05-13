import java.util.Scanner;

public class ciftsayı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,toplam=0,onikininkati=0,ortalama=0;
        System.out.println("Sayı giriniz:");
        sayi=input.nextInt();
        while(0<=sayi){
          if(sayi%12==0&&sayi!=0){
              toplam=toplam+sayi;
              onikininkati++;
          }sayi--;
        }ortalama=toplam/onikininkati;
        System.out.println("3 ve 4'e bölünen sayıların ortalaması:"+ortalama);
    }
}
