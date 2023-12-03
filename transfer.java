import java.util.ArrayList;
import java.util.List;

// Kelas Transfer untuk operasi transfer
class Transfer {
    // Metode untuk melakukan transfer uang
    public void transferUang(User pengirim, User penerima) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah yang ingin ditransfer: ");
        double jumlahTransfer = scanner.nextDouble();

        if (jumlahTransfer > pengirim.getSaldo()) {
            System.out.println("Transfer gagal. Saldo tidak mencukupi.");
        } else {
            Transaksi transaksiPengirim = new Transaksi("Transfer ke " + penerima.getUsername(), -jumlahTransfer);
            Transaksi transaksiPenerima = new Transaksi("Transfer dari " + pengirim.getUsername(), jumlahTransfer);

            pengirim.tambahTransaksi(transaksiPengirim);
            penerima.tambahTransaksi(transaksiPenerima);

            System.out.println("Transfer berhasil!");
        }
    }
}