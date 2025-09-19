# Laporan Modul 2: Dasar Pemrograman Java
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek  
**Nama:** [Malikul Mulki]  
**NIM:** [2024573010079]  
**Kelas:** [TI 2A]

---

## 1. Abstrak
Laporan ini membahas implementasi dasar pemrograman Java yang meliputi variabel, tipe data, input-output, struktur kontrol (percabangan dan perulangan), serta penerapan nested loop. Tujuan dari praktikum ini adalah agar mahasiswa memahami konsep fundamental pemrograman Java dan dapat mengimplementasikan program sederhana dengan menggunakan struktur kontrol yang tepat.

---

## 2. Praktikum

### Praktikum 1 - Variabel dan Tipe Data
#### Dasar Teori
Java memiliki dua kategori tipe data utama:
- **Tipe Data Primitif:** `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`
- **Tipe Data Referensi:** `String`, `Array`, `Object`, dll.

#### Langkah Praktikum
1. Buat package `modul_2`
2. Buat file `VariabelDemo.java`
3. Implementasikan deklarasi variabel dengan tipe data berbeda dan tampilkan menggunakan `System.out.println()`
   package modul_2;

public class VariableDemo {
public static void main(String[]args){
//deklarasi dan inisialisasi variable
int umur = 20;
double tinggi = 175.5;
char grade = 'A';
boolean lulus = true;
String nama = "Jofn Beo";

        //Menampilkan Nilai Varible
        System.out.println("Nama: " + nama);
        System.out.println("Umur: "+ umur + "tahun");
        System.out.println("Tinggi: " + tinggi + "cm");
        System.out.println("Grade: " + grade);
        System.out.println("Lulus: "+lulus);

        int a= 10;
        int b= 3;
        System.out.println("\n=== Operasi Aritmatika ===");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("axb="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));

        System.out.println("=== Casting Typee Data ===");
        double nilaiDouble = 9.8;
        int nilaiInt = (int) nilaiDouble;

        System.out.println("Nilai double: "+ nilaiDouble);
        System.out.println("Setelah casting ke int: "+nilaiInt);

        //Automatik promotion
        byte byteVar = 50;
        short shortVar = 100;
        int hasil = byteVar + shortVar;
        System.out.println("byte + short= " + hasil + "(tipe: int");

    }
}



#### Analisa dan Pembahasan
Program menampilkan nilai variabel sesuai dengan tipe datanya. Mahasiswa dapat memahami bagaimana mendeklarasikan, menginisialisasi, dan menampilkan data dari berbagai tipe data di Java.

---

### Praktikum 2 - Input, Output dan Scanner
#### Dasar Teori
Untuk membaca input dari pengguna, digunakan class `Scanner` dari package `java.util`. Method yang umum digunakan antara lain:
- `nextInt()` untuk membaca integer
- `nextDouble()` untuk membaca bilangan pecahan
- `nextLine()` untuk membaca string dengan spasi

#### Langkah Praktikum
1. Buat file `InputOutputDemo.java`
2. Import `java.util.Scanner`
3. Buat objek Scanner
4. Minta pengguna memasukkan nama, umur, dan nilai; kemudian tampilkan kembali di layar.
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


#### Screenshoot Hasil
*(![Screenshot 2025-09-19 104137.png](../../src/gambar/png/Screenshot%202025-09-19%20104137.png))*

#### Analisa dan Pembahasan
Program berhasil menerima input dari pengguna dan menampilkannya kembali. Mahasiswa memahami cara menggunakan `Scanner` dan perbedaan antara `next()`, `nextLine()`, dan method lainnya.

---

### Praktikum 3 - Struktur Kontrol: Percabangan
#### Dasar Teori
Percabangan digunakan untuk pengambilan keputusan dalam program. Struktur percabangan di Java meliputi `if`, `if-else`, `if-else if-else`, dan `switch`.

#### Langkah Praktikum
1. Buat file `GradeDemo.java`
2. Implementasikan program untuk menentukan nilai huruf dari input nilai (0–100)
3. Tambahkan program menu dengan `switch` untuk memilih operasi
4. Buat program kategori usia menggunakan `nested if`
   package modul_2;

import  java.util.Scanner;
public class GradeDemo {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai (0-100): ");
        int nilai = input.nextInt();

        char grade;
        String keterangan;

        //Menggunakan if-else if -else
        if (nilai >= 85){
            grade ='A';
            keterangan = "Exelent";
        } else if (nilai >= 75) {
            grade = 'B';
            keterangan = "Good";
        } else if (nilai >= 65) {
            grade = 'C';
            keterangan = "Fair";
        } else if (nilai >= 55) {
            grade = 'D';
            keterangan = "Poor";
        } else {
            grade ='E';
            keterangan = "Fail";
        }

        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);

        input.close();
    }
}


#### Screenshoot Hasil
*(![Screenshot 2025-09-19 104403.png](../../src/gambar/png/Screenshot%202025-09-19%20104403.png))*

#### Analisa dan Pembahasan
Percabangan dapat membantu program menentukan jalur eksekusi yang berbeda sesuai kondisi. Hasil menunjukkan nilai huruf yang sesuai dan kategori yang tepat berdasarkan input.

---

### Praktikum 4 - Struktur Kontrol: Perulangan
#### Dasar Teori
Perulangan digunakan untuk mengeksekusi blok kode berulang kali. Java menyediakan `for`, `while`, dan `do-while`. Nested loop digunakan untuk menghasilkan pola dua dimensi seperti tabel atau segitiga.

#### Langkah Praktikum
1. Buat file `NestedLoopDemo.java`
2. Implementasikan program berikut:
    - **Pola Bintang Segitiga**
    - **Tabel Perkalian 1-5**
    - **Pola Angka**
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
#### Screenshoot Hasil
*(![Screenshot 2025-09-19 104535.png](../../src/gambar/png/Screenshot%202025-09-19%20104535.png))*
*(![Screenshot 2025-09-19 104542.png](../../src/gambar/png/Screenshot%202025-09-19%20104542.png))*



