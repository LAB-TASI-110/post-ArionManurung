package model;

import java.util.ArrayList;

public class Model3 {

    // Inner class untuk Order
    class Order {
        String nama;
        String makanan;
        boolean statusSiap;

        Order(String nama, String makanan) {
            this.nama = nama;
            this.makanan = makanan;
            this.statusSiap = false;
        }
    }

    private ArrayList<Order> daftarPesanan;

    public Model3() {
        daftarPesanan = new ArrayList<>();
    }

    public void tambahPesanan(String nama, String makanan) {
        Order o = new Order(nama, makanan);
        daftarPesanan.add(o);
    }

    public void tampilkanPesanan() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        for (int i = 0; i < daftarPesanan.size(); i++) {
            Order o = daftarPesanan.get(i);
            System.out.println("Index: " + i);
            System.out.println("Nama: " + o.nama);
            System.out.println("Pesanan: " + o.makanan);
            System.out.println("Status: " + (o.statusSiap ? "SIAP" : "MENUNGGU"));
            System.out.println("----------------------");
        }
    }

    public void prosesPesanan(int index) {
        if (index >= 0 && index < daftarPesanan.size()) {
            daftarPesanan.get(index).statusSiap = true;
            System.out.println("Pesanan diproses.");
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    public void panggilPesanan() {
        boolean ada = false;

        for (Order o : daftarPesanan) {
            if (o.statusSiap) {
                System.out.println("Pesanan atas nama " + o.nama + " sudah siap!");
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Belum ada pesanan yang siap.");
        }
    }
}