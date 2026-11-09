package kelas.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import kelas.model.Produk;

public class DataProduk {
    private final ObservableList<Produk> daftar =
            FXCollections.observableArrayList();
    private int urutan = 1;

    public ObservableList<Produk> getDaftar() {
        return FXCollections.unmodifiableObservableList(daftar);
    }

    // Membuat Produk baru (kode otomatis PRD001, PRD002, ...).
    // Jika data tidak valid, Produk melempar IllegalArgumentException
    // dan urutan kode tidak bertambah.
    public Produk tambah(String nama, String kategori, long harga) {
        Produk p = new Produk(String.format("PRD%03d", urutan),
                nama, kategori, harga);
        daftar.add(p);
        urutan++;
        return p;
    }
}