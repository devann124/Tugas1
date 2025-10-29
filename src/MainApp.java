import java.util.Scanner;

/**
 * Program utama untuk menjalankan aplikasi nota pemesanan.
 */
public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MenuItem nasiGoreng = new MenuItem("Seblak special", 15000);
        MenuItem mieAyam = new MenuItem("Seblak hemat", 12000);
        MenuItem esTeh = new MenuItem("Es Teh", 5000);
        MenuItem kopi = new MenuItem("Joshua", 8000);

        Order order = new Order();

        System.out.println("=== SELAMAT DATANG DI WARUNG SEDAP RASA ===");
        char ulang;
        do {
            System.out.println("\nPilih menu:");
            System.out.println("1. Seblak special - Rp15.000");
            System.out.println("2. Seblak hemat - Rp12.000");
            System.out.println("3. Es Teh - Rp5.000");
            System.out.println("4. Joshua - Rp8.000");
            System.out.print("Pilih (1-4): ");
            int pilih = input.nextInt();

            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();

            switch (pilih) {
                case 1 -> order.tambahPesanan(new OrderItem(nasiGoreng, jumlah));
                case 2 -> order.tambahPesanan(new OrderItem(mieAyam, jumlah));
                case 3 -> order.tambahPesanan(new OrderItem(esTeh, jumlah));
                case 4 -> order.tambahPesanan(new OrderItem(kopi, jumlah));
                default -> System.out.println("Menu tidak tersedia!");
            }

            System.out.print("Tambah pesanan lagi? (y/n): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        order.cetakNota();

        input.close();
    }
}
