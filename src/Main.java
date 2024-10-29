import java.util.ArrayList;
import java.util.HashMap;

/**
 * Kelas PesananMakanan merepresentasikan sistem pemesanan makanan sederhana.
 * Kelas ini menyimpan daftar menu makanan beserta harganya dan dapat digunakan
 * untuk menambahkan pesanan, menghitung total biaya, dan menampilkan detail pesanan.
 */
class PesananMakanan {
    private HashMap<String, Integer> menu;
    private ArrayList<String> pesanan;

    /**
     * Konstruktor untuk kelas PesananMakanan.
     * Menginisialisasi menu dengan beberapa item makanan dan harganya, serta
     * membuat list kosong untuk menampung pesanan.
     */
    public PesananMakanan() {
        menu = new HashMap<>();
        menu.put("Nasi Goreng", 15000);
        menu.put("Mie Goreng", 12000);
        menu.put("Sate Ayam", 20000);
        pesanan = new ArrayList<>();
    }

    /**
     * Menampilkan daftar menu beserta harganya.
     */
    public void tampilkanMenu() {
        System.out.println("Menu:");
        for (String makanan : menu.keySet()) {
            System.out.println(makanan + ": Rp" + menu.get(makanan));
        }
    }

    /**
     * Menambahkan item makanan ke dalam pesanan.
     *
     * @param makanan Nama makanan yang ingin ditambahkan ke dalam pesanan.
     * Jika makanan tidak ada dalam menu, pesan kesalahan akan ditampilkan.
     */
    public void tambahkanPesanan(String makanan) {
        if (menu.containsKey(makanan)) {
            pesanan.add(makanan);
            System.out.println(makanan + " berhasil ditambahkan ke pesanan.");
        } else {
            System.out.println("Makanan tidak tersedia di menu.");
        }
    }

    /**
     * Menghitung total harga dari semua item yang ada dalam pesanan.
     *
     * @return Total harga pesanan sebagai bilangan bulat.
     */
    public int hitungTotal() {
        int total = 0;
        for (String makanan : pesanan) {
            total += menu.get(makanan);
        }
        return total;
    }

    /**
     * Menampilkan semua item dalam pesanan beserta total harga.
     */
    public void tampilkanPesanan() {
        System.out.println("Pesanan Anda:");
        for (String makanan : pesanan) {
            System.out.println(makanan);
        }
        System.out.println("Total: Rp" + hitungTotal());
    }

    /**
     * Metode utama untuk menjalankan aplikasi.
     * Membuat instance PesananMakanan, menampilkan menu, dan menambahkan item ke pesanan.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        PesananMakanan pesanan = new PesananMakanan();
        pesanan.tampilkanMenu();
        pesanan.tambahkanPesanan("Nasi Goreng");
        pesanan.tambahkanPesanan("Mie Goreng");
        pesanan.tampilkanPesanan();
    }
}
