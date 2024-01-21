import java.util.Scanner;

public class odev_3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n Hesap Makinası");
                System.out.println("1. Toplama");
                System.out.println("2. Çıkarma");
                System.out.println("3. Çarpma");
                System.out.println("4. Bölme");
                System.out.println("5. Çıkış");


                int secim = scanner.nextInt();

                if (secim == 5) {
                    System.out.println("Programdan çıkılıyor.");
                    break;
                }

                System.out.print("İlk sayıyı girin: ");
                double sayi1 = scanner.nextDouble();

                System.out.print("İkinci sayıyı girin: ");
                double sayi2 = scanner.nextDouble();

                switch (secim) {
                    case 1:
                        toplamaislemi(sayi1, sayi2);
                        break;
                    case 2:
                        cikarmaislemi(sayi1, sayi2);
                        break;
                    case 3:
                        carpmaislemi(sayi1, sayi2);
                        break;
                    case 4:
                        bolmeislemi(sayi1, sayi2);
                        break;
                    default:
                        System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                }
            }

            scanner.close();
        }

        private static void toplamaislemi(double sayi1, double sayi2) {
            double sonuc = sayi1 + sayi2;
            System.out.println("Toplama işleminin Sonucu: " + sonuc);
        }

        private static void cikarmaislemi(double sayi1, double sayi2) {
            double sonuc = sayi1 - sayi2;
            System.out.println("Çıkarma işleminin Sonucu: " + sonuc);
        }

        private static void carpmaislemi(double sayi1, double sayi2) {
            double sonuc = sayi1 * sayi2;
            System.out.println("Çarpma işleminin Sonucu: " + sonuc);
        }

        private static void bolmeislemi(double sayi1, double sayi2) {
            if (sayi2 != 0) {
                double sonuc = sayi1 / sayi2;
                System.out.println("Bölme işleminin Sonucu: " + sonuc);
            } else {
                System.out.println("Bir sayıyı sıfıra bölemezsiniz.");
            }
        }
    }


