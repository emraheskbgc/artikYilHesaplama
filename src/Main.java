import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;
        boolean  artikMi = false;

        Scanner input = new Scanner(System.in);

        System.out.print(" Lütfen Bir Yıl Giriniz  = " );
        yil = input.nextInt();

        if (yil % 4 ==0 ){
            if (yil % 100 == 0){
                if (yil % 400 == 0)
                {
                    artikMi = true;
                }else{
                    artikMi = false;
                }
            }else {
                artikMi = true;
            }
        }else {
            artikMi = false;
        }

        if (artikMi){
            System.out.println(yil + " Girmiş Olduğunuz Yıl Artık Bir Yıldır !");
        }else{
            System.out.println(yil + " Girmiş Olduğunuz Yıl Artık Bir Yıl Değildir !");
        }



    }
}
