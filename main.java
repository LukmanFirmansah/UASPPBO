import java.util.ArrayList;
import java.util.List;

// Kelas utama sebagai entry point program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Admin
        Admin admin = new Admin("admin123", "adminpass");

        // Pendaftaran user baru
        Pendaftaran pendaftaran = new Pendaftaran();
        User newUser1 = pendaftaran.daftarUser();
        User newUser2 = pendaftaran.daftarUser();

        // Menambahkan user baru ke admin
        admin.tambahUser(newUser1);
        admin.tambahUser(newUser2);

        // Menampilkan info nasabah oleh admin
        admin.lihatInfoNasabah();

        // Melakukan proses login
        Login login = new Login();
        User loggedInUser1 = login.prosesLogin(admin);
        User loggedInUser2 = login.prosesLogin(admin);

        // Menampilkan info nasabah setelah login
        if (loggedInUser1 != null && loggedInUser2 != null) {
            loggedInUser1.lihatInfoSendiri();
            loggedInUser2.lihatInfoSendiri();

            // Melakukan transfer
            Transfer transfer = new Transfer();
            transfer.transferUang(loggedInUser1, loggedInUser2);

            // Menampilkan info nasabah setelah transfer
            loggedInUser1.lihatInfoSendiri();
            loggedInUser2.lihatInfoSendiri();

            // Melakukan penyimpanan dan penarikan
            Simpan simpan = new Simpan();
            simpan.simpanUang(loggedInUser1);

            Tarik tarik = new Tarik();
            tarik.tarikUang(loggedInUser1);

            // Menampilkan info nasabah setelah simpan dan tarik
            loggedInUser1.lihatInfoSendiri();
        } else {
            System.out.println("Login gagal. Silakan coba lagi.");
        }
    }
}