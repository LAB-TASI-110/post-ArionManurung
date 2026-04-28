package driver;

import java.util.Scanner;
import model.Model3;

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Model3 cafe = new Model3();

        int pilihan;

        do {
            System.out.println("=== KAFETARIA IT DEL ===");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Pesanan");
            System.out.println("3. Proses Pesanan");
            System.out.println("4. Panggil Pesanan Siap");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Pesanan: ");
                    String makanan = input.nextLine();

                    cafe.tambahPesanan(nama, makanan);
                    break;

                case 2:
                    cafe.tampilkanPesanan();
                    break;

                case 3:
                    System.out.print("Masukkan index pesanan: ");
                    int index = input.nextInt();
                    cafe.prosesPesanan(index);
                    break;

                case 4:
                    cafe.panggilPesanan();
                    break;
            }

        } while (pilihan != 0);

        input.close();
    }
}