import java.util.ArrayList;
import java.util.List;

// Kelas Rekening untuk operasi transfer antar rekening
class Rekening {
    // Metode untuk melakukan transfer antar rekening
    public void transferAntarRekening(User pengirim, User penerima) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor rekening penerima: ");
        String nomorRekening = scanner.next();

        // Cek apakah nomor rekening valid dan penerima adalah nasabah
        if (nomorRekening.equals(penerima.getUsername()) && !pengirim.equals(penerima)) {
            Transfer transfer = new Transfer();
            transfer.transferUang(pengirim, penerima);
        } else {
            System.out.println("Transfer antar rekening gagal. Nomor rekening tidak valid atau penerima bukan nasabah.");
        }
    }
}