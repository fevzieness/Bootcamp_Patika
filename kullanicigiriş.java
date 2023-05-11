import java.util.Scanner;
public class kullanicigiriş {

    public static void main(String[] args) {
        String username, password, choose, newPassword;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen Kullanıcı adınızı girin: ");
        username = input.nextLine();

        System.out.print("Lütfen şifrenizi girin: ");
        password = input.nextLine();

        if (username.equals("java101") && password.equals("patika")) {
            System.out.print("Giriş başarılı  ");

        }
        else {
            System.out.print("Hatalı Giriş Yaptınız");
            System.out.print("Şifrenizi Yenilemek İstermisinix [Y/N]: ");
            choose = input.nextLine();
            switch (choose) {
                case "Y":
                    System.out.print("Yeni şifre giriniz: ");
                    newPassword = input.nextLine();

                    if (newPassword.equals(password)) {
                        System.out.print("Şifreniz bir önceki şifrenizden farklı olmalıdır !!! ");
                    }
                    else {
                        System.out.print("Şifreniz Değiştirildi.");
                        password = newPassword;

                    }
                case "N":
                    System.out.print("Tekrar giriş yapmayı deneyiniz:");



            }
        }




    }
}