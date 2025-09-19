package modul_2;

import java.util.Scanner;
public class WhileLoopDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Contoh While Loop
        System.out.println("=== While Loop - Tebak Angka ===");
        int angkaRahasia = 7;
        int tebakan = 0;

        while (tebakan != angkaRahasia){
            System.out.println("Tebak Angka 1-10: ");
            tebakan = input.nextInt();

            if(tebakan < angkaRahasia){
                System.out.println("Terlalu Kecil!");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu Besar!");
            }else {
                System.out.println("Benar! Angka Rahasia Adalah "+ angkaRahasia);
            }
        }

        //Contoh DoWhileLoop
        System.out.println("\n===Do-While-Loop-Menu===");
        int pilihan;

        do {
            System.out.println("\n1. Tampilkan Pesan");
            System.out.println("\n2. Hitung Faktorial");
            System.out.println("3. Keluar");
            System.out.println("Pilih Menu");
            pilihan = input.nextInt();

            switch (pilihan){
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.println("Masukan Angka Untuk Difaktorkan: ");
                    int n = input.nextInt();
                    long faktorial = 1;
                    for (int i = 1; i <= n ; i++) {
                        faktorial *= i;
                    }
                    System.out.println("Faktorial " + n + "=" + faktorial);
                    break;
                case 3:
                    System.out.println("Terimakasih!");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid!!");
            }
        }while (pilihan != 3);
        input.close();
    }
}