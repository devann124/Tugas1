/**
 * Kelas OrderItem merepresentasikan satu pesanan.
 */
public class OrderItem {
    private MenuItem menuItem;
    private int jumlah;

    public OrderItem(MenuItem menuItem, int jumlah) {
        this.menuItem = menuItem;
        this.jumlah = jumlah;
    }

    public double getSubTotal() {
        return menuItem.getHarga() * jumlah;
    }

    public String getNamaItem() {
        return menuItem.getNama();
    }

    public int getJumlah() {
        return jumlah;
    }
}