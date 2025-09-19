package modul_2;

import java.util.Scanner;
public class MenuDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU PILIHAN===");
        System.out.println("1. Hitung Luas Persegi");
        System.out.println("2. Hitung Luas Lingkaran");
        System.out.println("3. Hitung Luas Segitiga");
        System.out.println("4. Keluar");

        System.out.println("Pilih Menu )1-4: ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                System.out.println(" Masukan Sisi Persegi: ");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("Luas Persegi: "+luasPersegi);
                break;

            case 2:
                System.out.println("Masukkan Jari-Jari Lingkaran: ");
                double jarijari = input.nextDouble();
                double luasLingkaran = Math.PI * jarijari * jarijari;
                System.out.println("Luas Lingkaran: " + luasLingkaran);
                break;

            case 3:
                System.out.println("Masukkan Nilai Alas Segitiga: ");
                double alas = input.nextDouble();
                System.out.println("Masukkan Tinggi Segitiga: ");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga: "+ luasSegitiga);
                break;

            case 4:
                System.out.println("Terimakasih");
                break;

            default:
                System.out.println("Pilihan Tidak Valid!!");
        }
        input.close();
    }
}
