🍽️ Aplikasi Nota Pemesanan Sederhana
Aplikasi konsol sederhana berbasis Java untuk mencatat pesanan makanan/minuman dan menghasilkan nota (struk) pemesanan.

⚙️ Struktur Proyek
Aplikasi ini terdiri dari beberapa kelas yang memodelkan entitas dalam sistem pemesanan:

MainApp.java: Kelas utama yang berisi logika untuk menjalankan program, menampilkan menu, menerima input pesanan dari pengguna, dan mencetak nota.

MenuItem.java: Kelas yang merepresentasikan satu item menu (makanan/minuman), menyimpan nama dan harga.

OrderItem.java: Kelas yang merepresentasikan detail satu pesanan, menyimpan referensi ke MenuItem dan jumlah item yang dipesan. Kelas ini juga menyediakan metode untuk menghitung subtotal.

Order.java: Kelas yang berfungsi sebagai keranjang pesanan, menyimpan daftar objek OrderItem dan total keseluruhan pembayaran. Kelas ini memiliki metode untuk menambah pesanan dan mencetak nota.

🚀 Cara Menjalankan Aplikasi
Aplikasi ini dapat dijalankan melalui terminal atau Integrated Development Environment (IDE) Java.

Kompilasi (Compile):

Bash

javac MainApp.java MenuItem.java OrderItem.java Order.java
Jalankan (Run):

Bash

java MainApp
💻 Contoh Penggunaan
Setelah menjalankan aplikasi, Anda akan disambut dengan menu dan diminta untuk memasukkan pilihan:

=== SELAMAT DATANG DI WARUNG SEDAP RASA ===

Pilih menu:
1. Nasi Goreng - Rp15.000
2. Mie Ayam - Rp12.000
3. Es Teh - Rp5.000
4. Kopi Hitam - Rp8.000
Pilih (1-4): 1
Jumlah: 2
Tambah pesanan lagi? (y/n): y

Pilih menu:
1. Nasi Goreng - Rp15.000
2. Mie Ayam - Rp12.000
3. Es Teh - Rp5.000
4. Kopi Hitam - Rp8.000
Pilih (1-4): 3
Jumlah: 1
Tambah pesanan lagi? (y/n): n

===== NOTA PEMESANAN =====
Nasi Goreng x2 = Rp 30000.0
Es Teh x1 = Rp 5000.0
--------------------------
Total Bayar: Rp 35000.0
==========================
💡 Fitur Utama
Pencatatan Pesanan: Memungkinkan pengguna untuk memilih menu dan menentukan jumlah.

Penghitungan Subtotal: Otomatis menghitung subtotal per item (jumlah * harga).

Penghitungan Total: Otomatis menghitung total keseluruhan pembayaran.

Pencetakan Nota: Mencetak detail pesanan, termasuk subtotal setiap item dan total akhir, ke konsol.
