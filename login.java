import java.util.ArrayList;
import java.util.List;

// Kelas Login untuk operasi login
class Login {
    // Metode untuk melakukan proses login
    public User prosesLogin(Admin admin) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String enteredUsername = scanner.next();

        System.out.print("Masukkan password: ");
        String enteredPassword = scanner.next();

        // Melakukan iterasi pada daftar user untuk mencocokkan informasi login
        for (User user : admin.getDaftarUser()) {
            if (user.login(enteredUsername, enteredPassword)) {
                System.out.println("Login berhasil!");
                return user;
            }
        }

        System.out.println("Login gagal. Username atau password salah.");
        return null;
    }
}