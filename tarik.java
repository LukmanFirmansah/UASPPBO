import java.util.ArrayList;
import java.util.List;

// Kelas Tarik untuk operasi penarikan uang
class Tarik {
    // Metode untuk melakukan penarikan uang
    public void tarikUang(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah yang ingin ditarik: ");
        double jumlahTarik = scanner.nextDouble();

        if (jumlahTarik > 0 && jumlahTarik <= user.getSaldo()) {
            Transaksi transaksi = new Transaksi("Tarik uang", -jumlahTarik);
            user.tambahTransaksi(transaksi);
            System.out.println("Penarikan berhasil!");
        } else {
            System.out.println("Penarikan gagal. Jumlah tidak valid atau saldo tidak mencukupi.");
        }
    }
}