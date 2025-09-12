package modul_1.DataDiri;

import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args){
        System.out.println("Data Mahasiswa");
        String Nama = "Malikul Mulki";
        String Nim = "2024573010079";
        LocalDate Tgllahir = LocalDate.of(2006, 8, 12);
        String Jurusan = "Teknologi Informasi dan Komputer";
        String Prodi = "Teknik Informatika";
        int Semester = 3;
        System.out.println("Nama: " +Nama);
        System.out.println("Nim: " + Nim);
        System.out.println("Tanggal Lahir: " + Tgllahir);
        System.out.println("Jurusan: " + Jurusan);
        System.out.println("Prodi: "+ Prodi);
        System.out.println("Semester ke: " + Semester);
    }
}
