
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İslemler:\n" +
                "*\n" +
                "+\n" +
                "-\n" +
                "/\n");
        double number1, number2;
        String process;
        System.out.print("Lutfen yapmak istediginiz işlemin amblemi yaziziniz: ");
        process = input.nextLine();
        System.out.print("number1 i giriniz: ");
        number1 = input.nextDouble();
        System.out.print("number2 yi giriniz: ");
        number2 = input.nextDouble();

        switch (process) {
            case "*":
                System.out.println("Çarpma islemi sonucu: " + (number1 * number2));
                break;
            case "+":
                System.out.println("Toplama islemi sonucu: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Çıkarma islemi sonucu: " + (number1 - number2));
                break;
            case "/":
                System.out.println("Bölme islemi sonucu: " + (number1 / number2));
                break;
            default:
                System.out.println("Hatali tuşlama");
        }
    }
}
    

       