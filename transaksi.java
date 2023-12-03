import java.util.ArrayList;
import java.util.List;

// Kelas Transaksi sebagai contoh untuk asosiasi
class Transaksi {
    private String deskripsi;
    private double jumlah;

    // Konstruktor
    public Transaksi(String deskripsi, double jumlah) {
        this.deskripsi = deskripsi;
        this.jumlah = jumlah;
    }

    // Representasi String dari objek Transaksi
    @Override
    public String toString() {
        return "Transaksi: " + deskripsi + ", Jumlah: " + jumlah;
    }

    // Getter untuk mendapatkan jumlah transaksi
    public double getJumlah() {
        return jumlah;
    }
}