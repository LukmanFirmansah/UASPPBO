import java.util.ArrayList;
import java.util.List;

// Kelas Admin yang merupakan turunan dari User
class Admin extends User {
    private List<User> daftarUser;

    // Konstruktor
    public Admin(String username, String password) {
        super(username, password, "Admin");
        this.daftarUser = new ArrayList<>();
    }

    // Menambahkan user baru ke daftar users
    public void tambahUser(User user) {
        daftarUser.add(user);
    }

    // Menampilkan info seluruh nasabah
    public void lihatInfoNasabah() {
        System.out.println("Informasi Seluruh Nasabah:");
        for (User user : daftarUser) {
            System.out.println("Username: " + user.username);
            System.out.println("Nama Lengkap: " + user.namaLengkap);
            System.out.println("------------------------");
        }
    }
}