package modul_2;

public class ForLoopDemo {
    public static void main(String[] args){
        //Contoh 1: Menampilkan Angka 1-10
        System.out.println(" === Angka 1-10 ===");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(1+"");
        }
        System.out.println();

        //Contoh 2: Menampilkan Angka Genap
        System.out.println("\n=== Angka Genap 2-20 ===");
        for (int i = 2; i <= 20 ; i+= 2) {
            System.out.println(i + "");
        }
        System.out.println();

        //Contoh 3: Countdown
        System.out.println("\n=== Countdown===");
        for (int i = 10; i >+ 1 ; i--) {
            System.out.println(i +"");
        }
        System.out.println();

        //Contoh 4: Table Perkalian
        System.out.println("\n === Table Perkalian 5 ===");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("5x"+i+"="+(5*i));
        }
    }
}
