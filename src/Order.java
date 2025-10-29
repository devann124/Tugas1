import java.util.ArrayList;
import java.util.List;

/**
 * Kelas Order berfungsi untuk menyimpan pesanan dan mencetak nota.
 */
public class Order {
    private List<OrderItem> daftarPesanan;
    private double total;

    public Order() {
        daftarPesanan = new ArrayList<>();
        total = 0;
    }

    public void tambahPesanan(OrderItem item) {
        daftarPesanan.add(item);
        total += item.getSubTotal();
    }

    public void cetakNota() {
        System.out.println("\n===== NOTA PEMESANAN =====");
        for (OrderItem item : daftarPesanan) {
            System.out.println(item.getNamaItem() + " x" + item.getJumlah() +
                    " = Rp " + item.getSubTotal());
        }
        System.out.println("--------------------------");
        System.out.println("Total Bayar: Rp " + total);
        System.out.println("==========================");
    }
}
