package modul_3;

public class ArraySatuDimensi{
    public  static void main(String[]args){
        //1. Deklarasi dan Inisialisasi Array
        int[] nilai = {85, 98, 78, 92, 88};
        String[] nama = {"Alice", "Bop", "Charlie", "Diana", "Eva"};

        //2. Menampilkan Panjang Array
        System.out.println("Jumlah Siswa: "+ nilai.length);

        //3. Mengakses Elemen Array
        System.out.println("Nama Siswa Pertama: "+ nama[0]);
        System.out.println("Nilai Siswa Pertama: "+ nilai[0]);

        //4. Menampilkan Semua Data Menggunakan Loop
        System.out.println("\nData Semua Siswa: ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i+1)+ ". " + nama[i] + "- Nilai: " + nilai[i]);
        }
    }
}