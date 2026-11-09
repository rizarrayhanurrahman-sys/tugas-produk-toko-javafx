# Aplikasi Daftar Produk Toko (JavaFX)

Tugas individu: modifikasi aplikasi praktikum TiketApp menjadi aplikasi pencatatan produk toko.

Nama: Rizar Rayhanurrahman
NIM: 2506125

## Fitur
- Form tambah produk (kode otomatis, nama, kategori Makanan/Minuman, harga)
- Validasi: nama tidak boleh kosong, harga harus lebih dari nol
- Tabel daftar produk (kode, nama, kategori, harga)
- Pencarian berdasarkan nama produk lewat tombol Cari
- Halaman detail produk yang menerima objek Produk yang dipilih
- Data disimpan selama aplikasi berjalan (tanpa database)

## Cara menjalankan
Prasyarat: JDK 17 atau lebih baru dan Maven. Internet diperlukan saat pertama kali untuk mengunduh dependensi JavaFX.

1. Clone repositori ini, lalu masuk ke foldernya:
   ```
   git clone https://github.com/rizarrayhanurrahman-sys/tugas-produk-toko-javafx
   cd tugas-produk-toko-javafx
   ```
2. Jalankan:
   ```
   mvn clean javafx:run
   ```
   Atau buka project di NetBeans, lalu klik kanan project dan pilih Run.

## Screenshot

### Form tambah produk


![Form tambah produk](screenshots/form.jpeg)



### Daftar produk


![Daftar produk](screenshots/daftar.jpeg)



### Detail produk


![Detail produk](screenshots/detail.jpeg)