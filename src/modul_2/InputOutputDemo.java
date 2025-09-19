package modul_2;

import java.util.Scanner;

public class InputOutputDemo {
    public static void Malikumain (String[] args){
        //Membuat objek scanner
        Scanner input = new Scanner(System.in);

        //Membaca input string
        System.out.println("Masukkan Nama Anda: ");
        String nama = input.nextLine();

        //Membaca input integer
        System.out.println("Masukkan Umur Anda: ");
        int umur = input.nextInt();

        //Membaca Input Double
        System.out.println("Masukkan Tinggi Anda(cm): ");
        double tinggi = input.nextDouble();

        //Menampilkan Output
        System.out.println("\n=== Data Anda ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + "Tahun");
        System.out.println("Tinggi: " + tinggi + "cm");

        //Menutup Scanner
        input.close();
    }
}
