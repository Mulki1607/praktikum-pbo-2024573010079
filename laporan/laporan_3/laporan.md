# Laporan Praktikum Modul 3 – Pemrograman Java (Array & String)
### Mata Kuliah: Praktikum Pemrograman Berorientasi Objek
#### Kelas: 2D – Teknologi Informasi
#### Nama: Malikul Mulki
#### NIM: 22573010079

## Tujuan Pembelajaran

1. Mahasiswa mampu memahami konsep dasar array satu dimensi.

2. Mahasiswa dapat menggunakan method (fungsi) dalam pengolahan data array.

3. Mahasiswa memahami manipulasi string menggunakan method bawaan Java.

4. Mahasiswa dapat membuat program analisis data sederhana berbasis array dan string.

## Dasar Teori

1. Array adalah struktur data yang menyimpan sekumpulan elemen dengan tipe data sama dalam satu variabel.

2. String merupakan kumpulan karakter yang digunakan untuk menyimpan teks.

3. Method adalah fungsi dalam Java yang dapat digunakan untuk memecah program menjadi bagian-bagian yang lebih kecil agar mudah dikelola dan digunakan kembali.

## Tugas dan Hasil Implementasi
    package modul_3;

    public class ArraySatuDimensi {
    public static void main(String[] args) {
    int[] nilai = {85, 98, 78, 92, 88};
    String[] nama = {"Alice", "Bop", "Charlie", "Diana", "Eva"};
    
            System.out.println("Jumlah Siswa: " + nilai.length);
            System.out.println("Nama Siswa Pertama: " + nama[0]);
            System.out.println("Nilai Siswa Pertama: " + nilai[0]);
    
            System.out.println("\nData Semua Siswa:");
            for (int i = 0; i < nama.length; i++) {
                System.out.println((i + 1) + ". " + nama[i] + " - Nilai: " + nilai[i]);
            }
        }
    }

##### Proses Pengerjaan:

Membuat dua array: nama (String) dan nilai (int).

Menggunakan for loop untuk menampilkan seluruh data siswa.

Mengakses elemen array dengan indeks.

##### Output:

    Jumlah Siswa: 5
    Nama Siswa Pertama: Alice
    Nilai Siswa Pertama: 85
    
    Data Semua Siswa:
    1. Alice - Nilai: 85
       2. Bop - Nilai: 98
       3. Charlie - Nilai: 78
       4. Diana - Nilai: 92
       5. Eva - Nilai: 88

##### Tugas 2 – StringDasar

    Kode: StringDasar.java

    package modul_3;
        import java.util.Scanner;
        
    public class StringDasar {
    public static void analisisString(String teks) {
    System.out.println("\n=== ANALISIS STRING ===");
    System.out.println("Teks asli: \"" + teks + "\"");
    System.out.println("Panjang string: " + teks.length());
    System.out.println("Karakter pertama: " + teks.charAt(0));
    System.out.println("Karakter terakhir: " + teks.charAt(teks.length() - 1));
    System.out.println("Uppercase: " + teks.toUpperCase());
    System.out.println("Lowercase: " + teks.toLowerCase());

        String[] kata = teks.trim().split("\\s+");
        System.out.println("Jumlah kata: " + kata.length);

        int jumlahVokal = hitungVokal(teks);
        System.out.println("Jumlah vokal: " + jumlahVokal);
    }

    public static int hitungVokal(String teks) {
        String vokal = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < teks.length(); i++) {
            if (vokal.contains(String.valueOf(teks.charAt(i)))) count++;
        }
        return count;
    }

    public static String reverseString(String teks) {
        return new StringBuilder(teks).reverse().toString();
    }

    public static boolean isPalindrome(String teks) {
        String cleanTeks = teks.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanTeks).reverse().toString();
        return cleanTeks.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        analisisString(kalimat);
        System.out.println("\nString terbalik: \"" + reverseString(kalimat) + "\"");

        if (isPalindrome(kalimat)) System.out.println("String ini adalah palindrome!");
        else System.out.println("String ini bukan palindrome.");
    }
}

##### Proses Pengerjaan:

Menggunakan method untuk analisis panjang string, huruf vokal, dan pengecekan palindrome.

Memanfaatkan StringBuilder untuk membalik string.

Input dari pengguna menggunakan Scanner.

##### Tugas 3 – TextProcessing

Kode: TextProcessing.java

        package modul_3;
    import java.util.Scanner;
    
    public class TextProcessing {
    public static void prosesDataMahasiswa(String data) {
    System.out.println("\n=== PENGOLAHAN DATA MAHASISWA ===");
    String[] dataMahasiswa = data.split(",");
    for (int i = 0; i < dataMahasiswa.length; i++) {
    dataMahasiswa[i] = dataMahasiswa[i].trim();
    System.out.println((i + 1) + ". " + dataMahasiswa[i]);
    }

            System.out.println("\nJumlah mahasiswa: " + dataMahasiswa.length);
            String panjang = dataMahasiswa[0], pendek = dataMahasiswa[0];
            for (String n : dataMahasiswa) {
                if (n.length() > panjang.length()) panjang = n;
                if (n.length() < pendek.length()) pendek = n;
            }
    
            System.out.println("Nama terpanjang: " + panjang);
            System.out.println("Nama terpendek: " + pendek);
        }
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan daftar nama (dipisahkan koma): ");
            String data = input.nextLine();
            prosesDataMahasiswa(data);
        }
    }

###### Proses Pengerjaan:

Data mahasiswa dipisahkan dengan split(",").

Menggunakan trim() untuk membersihkan spasi.

Menghitung jumlah nama, nama terpanjang, dan terpendek.

Tugas 4 – ArrayMethod

Kode: ArrayMethod.java

        package modul_3;
    import java.util.Scanner;
    
    public class ArrayMethod {
    public static int[] inputArray(int ukuran) {
    Scanner input = new Scanner(System.in);
    int[] array = new int[ukuran];
    for (int i = 0; i < ukuran; i++) {
    System.out.print("Angka ke-" + (i + 1) + ": ");
    array[i] = input.nextInt();
    }
    return array;
    }
    
        public static void tampilkanArray(int[] array) {
            System.out.print("Array: [");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    
        public static int cariMaksimum(int[] array) {
            int maks = array[0];
            for (int i = 1; i < array.length; i++)
                if (array[i] > maks) maks = array[i];
            return maks;
        }
    
        public static int cariMinimum(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++)
                if (array[i] < min) min = array[i];
            return min;
        }
    
        public static double hitungRataRata(int[] array) {
            int total = 0;
            for (int n : array) total += n;
            return (double) total / array.length;
        }
    
        public static int[] urutkanArray(int[] array) {
            int[] baru = array.clone();
            for (int i = 0; i < baru.length - 1; i++) {
                for (int j = 0; j < baru.length - 1 - i; j++) {
                    if (baru[j] > baru[j + 1]) {
                        int temp = baru[j];
                        baru[j] = baru[j + 1];
                        baru[j + 1] = temp;
                    }
                }
            }
            return baru;
        }
    
        public static void main(String[] args) {
            System.out.println("==== PROGRAM ANALISIS ARRAY ====");
            int[] data = inputArray(5);
    
            System.out.println("\n==== HASIL ANALISIS ====");
            tampilkanArray(data);
            System.out.println("Nilai Maksimum: " + cariMaksimum(data));
            System.out.println("Nilai Minimum: " + cariMinimum(data));
            System.out.println("Rata-rata: " + hitungRataRata(data));
            System.out.print("Array setelah diurutkan: ");
            tampilkanArray(urutkanArray(data));
        }
    }


###### Proses Pengerjaan:

Membuat beberapa method: input array, cari min/maks, rata-rata, dan sorting (Bubble Sort).

Input dari pengguna dan output hasil analisis array.

Tugas 5 – latihan1 (Analisis Nilai Siswa)

Kode: latihan1.java

    package modul_3;
    
    public class latihan1 {
    public static double hitungRata_rata(int[] data) {
    int total = 0;
    for (int n : data) total += n;
    return (double) total / data.length;
    }
    
        public static int nilaiTertinggi(int[] data) {
            int max = data[0];
            for (int n : data) if (n > max) max = n;
            return max;
        }
    
        public static int nilaiTerendah(int[] data) {
            int min = data[0];
            for (int n : data) if (n < min) min = n;
            return min;
        }
    
        public static void main(String[] args) {
            String[] nama = {"Sukarno", "Suharto", "Habiebie", "Agus", "Wati", "Susilo", "Jecko", "Bro Wo"};
            int[] nilai = {94, 92, 98, 96, 86, 93, 99, 100};
    
            double rata = hitungRata_rata(nilai);
            int tertinggi = nilaiTertinggi(nilai);
            int terendah = nilaiTerendah(nilai);
    
            System.out.println("\nRata-rata Nilai Siswa: " + rata);
            System.out.println("Nilai Tertinggi: " + tertinggi);
            System.out.println("Nilai Terendah: " + terendah);
        }
    }
    package modul_3;
    
    public class latihan1 {
    public static double hitungRata_rata(int[] data) {
    int total = 0;
    for (int n : data) total += n;
    return (double) total / data.length;
    }
    
        public static int nilaiTertinggi(int[] data) {
            int max = data[0];
            for (int n : data) if (n > max) max = n;
            return max;
        }
    
        public static int nilaiTerendah(int[] data) {
            int min = data[0];
            for (int n : data) if (n < min) min = n;
            return min;
        }
    
        public static void main(String[] args) {
            String[] nama = {"Sukarno", "Suharto", "Habiebie", "Agus", "Wati", "Susilo", "Jecko", "Bro Wo"};
            int[] nilai = {94, 92, 98, 96, 86, 93, 99, 100};
    
            double rata = hitungRata_rata(nilai);
            int tertinggi = nilaiTertinggi(nilai);
            int terendah = nilaiTerendah(nilai);
    
            System.out.println("\nRata-rata Nilai Siswa: " + rata);
            System.out.println("Nilai Tertinggi: " + tertinggi);
            System.out.println("Nilai Terendah: " + terendah);
        }
    }

##### Proses Pengerjaan:

Membuat tiga method untuk menghitung rata-rata, nilai tertinggi, dan nilai terendah.

Data siswa disimpan dalam array nama_siswa dan nilai_siswa.

Menampilkan hasil analisis nilai di konsol.

##### Output:

    Rata-rata Nilai Siswa: 94.75
    Nilai Tertinggi: 100
    Nilai Terendah: 86

### Kesimpulan

Penggunaan array dan method membantu mengelola data dengan efisien.

String manipulation di Java sangat berguna dalam pengolahan teks.

Program dapat dikembangkan lebih lanjut dengan menambahkan fitur seperti pencarian data atau penyimpanan ke file.