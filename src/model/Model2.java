package model;

public class Model2 {
    private int[] data;
    private String kategori;
    private int total;

    public Model2(int[] data, String kategori) {
        this.data = data;
        this.kategori = kategori;
        hitungTotal();
    }

    private void hitungTotal() {
        total = 0;

        if (kategori.equals("A")) {
            // index genap
            for (int i = 0; i < data.length; i += 2) {
                total += data[i];
            }
        } else if (kategori.equals("B")) {
            // index ganjil
            for (int i = 1; i < data.length; i += 2) {
                total += data[i];
            }
        }
    }

    public void printHasil() {
        System.out.println("Total stok kategori " + kategori + " = " + total);
    }
}