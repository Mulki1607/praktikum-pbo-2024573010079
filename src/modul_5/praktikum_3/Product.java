package modul_5.praktikum_3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product {
    private final String productId;
    private final LocalDateTime createdAt;

    private String nama;
    private double harga;
    private int stok;

    private String adminPin;

    private static int counter = 1000;

    public Product(String nama, double harga, int stok, String adminPin){
        this.productId = generateProductId();
        this.createdAt = LocalDateTime.now();
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.adminPin = adminPin;
    }
    private  String generateProductId(){
        counter++;
        return "PRD-" + counter;
    }
    private boolean validatePin(String adminPin){
        return this.adminPin.equals(adminPin);
    }
    public String getProductId(){
        return productId;
    }
    public String getCreatetAt(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        return createdAt.format(formatter);
    }
    public String getNama(){
        return nama;
    }
    public void  setNama(String nama, String pin){
        if (!validatePin(pin)){
            System.out.println("x PIN salah! Gagal mengubah nama.");
            return;
        }
        if (nama == null || nama.trim().isEmpty()){
            System.out.println("x Nama product tidak boleh kosong!");
            return;
        }
        this.nama = nama;
        System.out.println("Harga berhasil di ubah ");
    }
    public double getHarga(){
        return  harga;
    }
    public void setHarga(double harga, String pin){
        if (!validatePin(pin)){
            System.out.println("xpin salah1 Gagal mengubah harga.");
            return;
        }
        if (harga< 0){
            System.out.println("Harga tidak boleh negatif");
            return;
        }
        this.harga = harga;
        System.out.println("Harga berhasil diubah menjadi Rp %.2f\n"+ harga);
    }
    public int getStok(){
        return stok;
    }
    public void setStok(int stok, String pin){
        if (!validatePin(pin)){
            System.out.println(" x  PIN salah! Gagal mengubah stok.");
            return;
        }
        if(stok<0){
            System.out.println("x stok tidak boleh negative");
            return;
        }
        this.stok = stok;
        System.out.println("Stok berhasil diubah menjadi"+stok);
    }

    public void changePin(String OldPin, String newPin){
        if (!validatePin(adminPin)){
            System.out.println("Pin lama salah.");
        }
        if (newPin.length()<4){
            System.out.println("PIN harus minimal 4 carachters");
            return;
        }
        this.adminPin = newPin;
        System.out.println("PIN berhasil diubah");
    }
    public double getTotalNilai(){
        return harga * stok;
    }
    public String getStatusStok(){
        if (stok == 0)return "Habis";
        else if (stok< 10) return "Menipis";
        else if (stok<50) return "Tersedia";
        else return "Banyak";
    }
    public boolean kurangiStok(int jumlah){
        if (jumlah <= stok){
            System.out.println(" x Jumlah harus lebih dari 0");
            return false;
        }
        if (jumlah > stok){
            System.out.println("Stok tidak Cukup");
            System.out.println("Stok tersedia: %d, Diminta: %d\n "+ stok + jumlah);
            return false;
        }
        stok-= jumlah;
        System.out.println("Stok dikurangi %d. Stok sekarang: %d\n"+ jumlah + stok);
        if (stok<10){
            System.out.println("Peringatan: stok menipis!");
        }
        return true;
    }
    public void tampilkanInfo(){
        System.out.println("INFORMASI Product");
        System.out.println("...................");
        System.out.println("Product Id      : "+ productId);
        System.out.println("Nama            : "+ nama);
        System.out.println("Harga           : Rp %.2f\n"+ harga);
        System.out.println("Stok            : "+ stok + "("+ getStatusStok()+")");
        System.out.println("Total Nilai     : Rp %.2f\n"+  getTotalNilai());
        System.out.println("Dibuat Pada     : " + getCreatetAt());
    }

}
