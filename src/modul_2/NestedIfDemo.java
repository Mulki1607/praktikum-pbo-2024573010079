package modul_2;

import java.util.Scanner;
public class NestedIfDemo {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Umur: ");
        int umur = input.nextInt();

        if (umur>= 0){
            if (umur <= 2){
                System.out.println("Katagori: Bayi");
            } else if (umur <=5){
                System.out.println("Katagori: Balita");
            } else if (umur <= 12) {
                System.out.println("Katagori: Anak-anak");
            } else if (umur <= 19) {
                System.out.println("Katagori: Remaja");
            } else if (umur <= 59) {
                System.out.println("Katagori: Dewasa");
            } else {
                System.out.println("Katagori: Lansia");
            }
        } else {
            System.out.println("Umur tidak Valid!");
        }
        input.close();
        }
}
