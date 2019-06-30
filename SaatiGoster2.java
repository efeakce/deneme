import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SaatiGoster {
    public static void main(String[] args) {
        long GecenSaniye = System.currentTimeMillis() / 1000;
        int SuankiSaniye = (int)(GecenSaniye % 60) ;
        long GecenDakika = GecenSaniye / 60 ;
        int SuankiDakika =(int)(GecenDakika % 60) ;
        long GecenSaat = GecenDakika / 60 ;
        int SuankiSaat = (int)(GecenSaat % 24 ) + 3 ;
        long GecenGun = GecenSaat / 24;
        int SuankiGun = (int) ((GecenGun % 30.41666666666667) * 10000) /10000;

        System.out.println("Şuan benim hesabıma göre saat; " + SuankiSaat + ":" + SuankiDakika + ":" + SuankiSaniye);

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(formatter));


    }
}
