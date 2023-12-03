import java.util.ArrayList;
import java.util.List;

// Kelas Pendaftaran untuk operasi pendaftaran user baru
class Pendaftaran {
    // Metode untuk mendaftarkan user baru
    public User daftarUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.next();

        System.out.print("Masukkan password: ");
        String password = scanner.next();

        System.out.print("Masukkan nama lengkap: ");
        String namaLengkap = scanner.nextLine();

        // Membuat objek user baru
        User newUser = new User(username, password, namaLengkap);

        System.out.println("Pendaftaran berhasil!");
        return newUser;
    }
}