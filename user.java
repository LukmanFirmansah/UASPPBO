import java.util.ArrayList;
import java.util.List;

// Kelas User sebagai parent class
class User {
    private String username;
    private String password;
    private String namaLengkap;
    private double saldo;
    private List<Transaksi> transaksiList;

    // Konstruktor
    public User(String username, String password, String namaLengkap) {
        this.username = username;
        this.password = password;
        this.namaLengkap = namaLengkap;
        this.saldo = 0.0;
        this.transaksiList = new ArrayList<>();
    }

    // Metode untuk menampilkan informasi nasabah
    public void lihatInfoSendiri() {
        System.out.println("Username: " + username);
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Saldo: " + saldo);
        System.out.println("Riwayat Transaksi:");
        for (Transaksi transaksi : transaksiList) {
            System.out.println(transaksi);
        }
    }

    // Metode untuk menambahkan transaksi
    public void tambahTransaksi(Transaksi transaksi) {
        transaksiList.add(transaksi);
        saldo += transaksi.getJumlah();
    }

    // Metode untuk melakukan proses login
    public boolean login(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    // Metode untuk mendapatkan saldo
    public double getSaldo() {
        return saldo;
    }
}
