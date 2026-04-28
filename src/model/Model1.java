package model;

public class Model1 {
    private String kodeKota;
    private String namaKota;
    private int beratButet;
    private double beratUcok;
    private double totalBerat;
    private int tarifPerKg;
    private double totalOngkir;
    private String promo;

    public Model1(String kodeKota, int beratButet) {
        this.kodeKota = kodeKota;
        this.beratButet = beratButet;

        setKotaDanTarif();
        hitungBerat();
        hitungOngkir();
        setPromo();
    }

    private void setKotaDanTarif() {
        switch (kodeKota) {
            case "MDN":
                namaKota = "Medan";
                tarifPerKg = 8000;
                break;
            case "BLG":
                namaKota = "Balige";
                tarifPerKg = 5000;
                break;
            case "JKT":
                namaKota = "Jakarta";
                tarifPerKg = 12000;
                break;
            case "SBY":
                namaKota = "Surabaya";
                tarifPerKg = 13000;
                break;
            default:
                namaKota = "Tidak diketahui";
                tarifPerKg = 0;
        }
    }

    private void hitungBerat() {
        beratUcok = 1.5 * beratButet;
        totalBerat = beratButet + beratUcok;
    }

    private void hitungOngkir() {
        totalOngkir = totalBerat * tarifPerKg;
    }

    private void setPromo() {
        promo = "";

        if (totalBerat > 10) {
            totalOngkir *= 0.9;
            promo += "Diskon 10% ";
        }

        if (kodeKota.equals("JKT") || kodeKota.equals("SBY")) {
            promo += "Asuransi Gratis";
        }

        if (promo.equals("")) {
            promo = "Tidak ada promo";
        }
    }

    public void printStruk() {
        System.out.println("=== STRUK PEMBAYARAN ===");
        System.out.println("Kota Tujuan     : " + namaKota);
        System.out.println("Berat Butet     : " + beratButet + " kg");
        System.out.println("Berat Ucok      : " + beratUcok + " kg");
        System.out.println("Total Berat     : " + totalBerat + " kg");
        System.out.println("Total Ongkir    : Rp " + (int) totalOngkir);
        System.out.println("Promo           : " + promo);
        System.out.println();
    }
}