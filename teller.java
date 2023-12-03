import java.util.ArrayList;
import java.util.List;

// Kelas Teller untuk operasi transaksi
class Teller {
    // Metode untuk melakukan transaksi simpang nomor
    public Transaksi transaksiSimpangNomor(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan deskripsi transaksi: ");
        String deskripsi = scanner.nextLine();

        System.out.print("Masukkan jumlah transaksi: ");
        double jumlah = scanner.nextDouble();

        // Membuat objek transaksi baru
        Transaksi transaksi = new Transaksi(deskripsi, jumlah);

        System.out.println("Transaksi berhasil!");
        return transaksi;
    }
}