# Laporan Modul 2: Dasar Pemrograman Java
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek  
**Nama:** [Isi nama lengkap]  
**NIM:** [Isi NIM]  
**Kelas:** [Isi]

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
#### Screenshoot Hasil
*(![Screenshot 2025-09-19 104535.png](../../src/gambar/png/Screenshot%202025-09-19%20104535.png))*
*(![Screenshot 2025-09-19 104542.png](../../src/gambar/png/Screenshot%202025-09-19%20104542.png))*



