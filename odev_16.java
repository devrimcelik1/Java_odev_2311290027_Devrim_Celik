import java.util.Scanner;

public class odev_16 {

        public static void main(String[] args) {

            String metin = "Bilgiye ulaşmanın hem çok kolay hem de çok zor olduğu" +
                    " şu son zamanlarda, insanların bilgi ihtiyacını karşılamak için" +
                    " ille de basılı kaynaklara yönelmelerini beklemek oldukça yanlış"  ;



            Scanner scanner = new Scanner(System.in);
            System.out.print("Bulmak istediğiniz karakteri giriniz: ");
            char arananKarakter = scanner.next().charAt(0);


            int karakterSayisi = sayac(metin, arananKarakter);
            System.out.println("Metin içinde '" + arananKarakter + "' karakteri " + karakterSayisi + " kez bulunmaktadır.");

            scanner.close();
        }


        private static int sayac(String metin, char arananKarakter) {
            int sayac = 0;

            for (int i = 0; i < metin.length(); i++) {
                if (metin.charAt(i) == arananKarakter) {
                    sayac++;
                }

            }
            System.out.println(metin);
            return sayac;

        }
    }


