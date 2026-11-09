package kelas.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import kelas.Navigator;
import kelas.data.DataProduk;
import kelas.model.Produk;

public class FormController {
    @FXML private TextField namaField;
    @FXML private ComboBox<String> kategoriBox;
    @FXML private TextField hargaField;
    @FXML private Label pesanLabel;

    private Navigator navigator;
    private DataProduk data;

    @FXML
    private void initialize() {
        kategoriBox.getItems().addAll("Makanan", "Minuman");
        kategoriBox.setValue("Makanan");
    }

    public void setKonteks(Navigator navigator, DataProduk data) {
        this.navigator = navigator;
        this.data = data;
    }

    private void tampilPesan(String teks, boolean error) {
        pesanLabel.setText(teks);
        if (error) {
            pesanLabel.setStyle("");
        } else {
            pesanLabel.setStyle("-fx-text-fill: #15803d;");
        }
    }

    @FXML
    private void simpan() {
        try {
            long harga = Long.parseLong(hargaField.getText().trim());
            Produk p = data.tambah(namaField.getText(),
                    kategoriBox.getValue(), harga);
            tampilPesan("Produk " + p.getKode() + " (" + p.getNama()
                    + ") berhasil ditambahkan.", false);
            namaField.clear();
            hargaField.clear();
            kategoriBox.setValue("Makanan");
            namaField.requestFocus();
        } catch (NumberFormatException e) {
            tampilPesan("Harga harus berupa angka bulat tanpa titik/koma.", true);
        } catch (IllegalArgumentException e) {
            tampilPesan(e.getMessage(), true);
        }
    }

    @FXML
    private void bukaDaftar() {
        try {
            navigator.bukaDaftar();
        } catch (IOException e) {
            tampilPesan("Daftar gagal dibuka.", true);
            e.printStackTrace();
        }
    }
}