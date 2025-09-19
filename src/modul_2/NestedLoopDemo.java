package modul_2;

public class NestedLoopDemo {
    public static void main(String[] args) {
        //Contoh1: Pola Bintang
        System.out.println("=== Pola Bintang Segitiga ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
        //Contoh 2: Tabel Perkalian
        System.out.println("\n Table Perkalian 1-5 ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
        }

        //Contoh3: Pola Angka
        System.out.println("\n===Pola Angka===");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + "");
            }
            System.out.println();
        }
    }
}