package driver;

import java.util.Scanner;
import model.Model1;

public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String kode = input.nextLine();

            if (kode.equals("END")) {
                break;
            }

            int berat = input.nextInt();
            input.nextLine(); // buang newline

            Model1 data = new Model1(kode, berat);
            data.printStruk();
        }

        input.close();
    }
}