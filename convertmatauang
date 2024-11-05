import java.util.*;

public class konversimatauang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nilai tukar mata uang (contoh nilai tukar tetap)
        double USDtoIDR = 15000; // 1 USD ke IDR
        double EURtoIDR = 16500; // 1 EUR ke IDR
        double USDtoEUR = 0.91;  // 1 USD ke EUR

        // Input jumlah uang
        System.out.print("Masukkan jumlah uang: ");
        double nominal = input.nextDouble();

        // Pilih mata uang asal
        System.out.println("Pilih mata uang asal: 1. IDR  2. USD  3. EUR");
        int asal = input.nextInt();

        // Pilih mata uang tujuan
        System.out.println("Pilih mata uang tujuan: 1. IDR  2. USD  3. EUR");
        int tujuan = input.nextInt();

        double hasil = 0;

        // Konversi berdasarkan pilihan pengguna
        if (asal == 1 && tujuan == 2) { // IDR ke USD
            hasil = nominal / USDtoIDR;
        } else if (asal == 1 && tujuan == 3) { // IDR ke EUR
            hasil = nominal / EURtoIDR;
        } else if (asal == 2 && tujuan == 1) { // USD ke IDR
            hasil = nominal * USDtoIDR;
        } else if (asal == 2 && tujuan == 3) { // USD ke EUR
            hasil = nominal * USDtoEUR;
        } else if (asal == 3 && tujuan == 1) { // EUR ke IDR
            hasil = nominal * EURtoIDR;
        } else if (asal == 3 && tujuan == 2) { // EUR ke USD
            hasil = nominal / USDtoEUR;
        } else {
            System.out.println("Mata uang asal dan tujuan tidak valid atau sama.");
        }

        // Tampilkan hasil konversi
        if (hasil != 0) {
            System.out.printf("Hasil konversi: %.2f\n", hasil);
        }
        
        input.close();
    }
}
