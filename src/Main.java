import java.util.Scanner;



public class Main {



    public static void main(String[] args) {





        System.out.println("Yaşınızı giriniz.".toUpperCase());

        Scanner input = new Scanner(System.in);

        int i = input.nextInt();







        if(i >= 65) {

            System.out.println("Yaşlısınız.");

        } else if (i >= 50){

            System.out.println("Orta yaştasınız.");

        } else if (i >= 30){

            System.out.println("Yetişkinsiniz.");

        } else if (i >= 20){

            System.out.println("Gençsiniz.");

        } else if (i == 15) {

            System.out.println("Harika zeki bab akıllı Efe kral PAŞaAaA!!!!");

        } else if (i>= 13) {

            System.out.println("Ergensiniz.");

        } else if (i >= 5) {

            System.out.println("Çocuksunuz.");

        } else if (i >= 0) {

            System.out.println("Bebeksiniz.");

        } else System.out.println("Bizi trollemeye mi geldin bab");







    }







}
