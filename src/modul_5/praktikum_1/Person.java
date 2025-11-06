package modul_5.praktikum_1;

public class Person{
    //Private - hanya bisa di akses dalam class ini
    private String nama;
    private int umur;

    //Default (package-private) -  bisa di akses dalam package yang sama
    String alamat;

    //Protected - bisa di akses dalam package dan subclass
    protected String telepon;

    public String email;

    //Constructor;
    public Person(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    //Public method untuk menampilkan info
    public void tampilkanInfo(){
        System.out.println("INFORMASI PERSON");
        System.out.println("Nama : " + nama);       //ok - dalam class yang sama
        System.out.println("Umur : " + umur);       //ok - dalam class yang sama
        System.out.println("Alamat : " + alamat);   //ok - dalam class yang sama
        System.out.println("Telepon : " + telepon); //ok - dalam class yang sama
        System.out.println("Email : " + email);     //ok - dalam class yang sama
    }

    //Private method - hanya bisa di panggil dalam class ini
    private void metodePribadi(){
        System.out.println("Ini adalah method private");
    }

    //Protected method
    protected void metodeProtected(){
        System.out.println("Ini adalah protected method");
    }

    //Method yang mengakses private method
    public void panggilMetodePribadi(){
        metodePribadi();    //ok - dalam class yang sama
    }
}
