import java.util.ArrayList;
import java.util.List;

// Kelas Saldo untuk operasi melihat saldo
class Saldo {
    // Metode untuk melihat saldo
    public void lihatSaldo(User user) {
        System.out.println("Saldo Anda saat ini: " + user.getSaldo());
    }
}