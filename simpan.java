import java.util.ArrayList;
import java.util.List;

// Kelas Simpan untuk operasi penyimpanan uang
class Simpan {
    // Metode untuk melakukan penyimpanan uang
    public void simpanUang(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah yang ingin disimpan: ");
        double jumlahSimpan = scanner.nextDouble();

        if (jumlahSimpan > 0) {
            Transaksi transaksi = new Transaksi("Simpan uang", jumlahSimpan);
            user.tambahTransaksi(transaksi);
            System.out.println("Penyimpanan berhasil!");
        } else {
            System.out.println("Penyimpanan gagal. Jumlah harus lebih dari 0.");
        }
    }
}
