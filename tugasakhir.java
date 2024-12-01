import java.util.*;

public class tugasakhir {
    
    // Method untuk melakukan konversi mata uang
    public static void konversi(double nominal, int asal, int tujuan, double[][] rates) {
        // Cek apakah asal dan tujuan valid
        if (asal == tujuan) {
            System.out.println("Mata uang asal dan tujuan sama.");
        } else if (asal >= 0 && asal < 11 && tujuan >= 0 && tujuan < 11) {
            // Menghitung konversi
            double hasil = nominal * rates[asal][tujuan];
            System.out.printf("Hasil konversi: %.2f\n", hasil);
        } else {
            System.out.println("Pilihan mata uang tidak valid.");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Matriks nilai tukar (baris: asal, kolom: tujuan)
        double[][] rates = {
            { 1, 1 / 15670.0, 1 / 16808.0, 1 / 103.5, 1 / 20.8, 1 / 10.8, 1 / 11.6, 1 / 2.3, 1 / 11.5, 1 / 15.3, 1 / 121.6 }, // IDR ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
            { 15670.0, 1, 0.93, 15670.0 / 103.5, 15670.0 / 20.8, 15670.0 / 10.8, 15670.0 / 11.6, 15670.0 / 2.3, 15670.0 / 11.5, 15670.0 / 15.3, 15670.0 / 121.6 }, // USD ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
            { 16808.0, 1 / 0.93, 1, 16808.0 / 103.5, 16808.0 / 20.8, 16808.0 / 10.8, 16808.0 / 11.6, 16808.0 / 2.3, 16808.0 / 11.5, 16808.0 / 15.3, 16808.0 / 121.6 }, // EUR ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
            { 103.5, 103.5 / 15670.0, 103.5 / 16808.0, 1, 103.5 / 20.8, 103.5 / 10.8, 103.5 / 11.6, 103.5 / 2.3, 103.5 / 11.5, 103.5 / 15.3, 103.5 / 121.6 }, // JPY ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
            { 20.8, 20.8 / 15670.0, 20.8 / 16808.0, 20.8 / 103.5, 1, 20.8 / 10.8, 20.8 / 11.6, 20.8 / 2.3, 20.8 / 11.5, 20.8 / 15.3, 20.8 / 121.6 }, // GBP ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
            { 10.8, 10.8 / 15670.0, 10.8 / 16808.0, 10.8 / 103.5, 10.8 / 20.8, 1, 10.8 / 11.6, 10.8 / 2.3, 10.8 / 11.5, 10.8 / 15.3, 10.8 / 121.6 }, // AUD ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
            { 11.6, 11.6 / 15670.0, 11.6 / 16808.0, 11.6 / 103.5, 11.6 / 20.8, 11.6 / 10.8, 1, 11.6 / 2.3, 11.6 / 11.5, 11.6 / 15.3, 11.6 / 121.6 }, // CAD ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
            { 2.3, 2.3 / 15670.0, 2.3 / 16808.0, 2.3 / 103.5, 2.3 / 20.8, 2.3 / 10.8, 2.3 / 11.6, 1, 2.3 / 11.5, 2.3 / 15.3, 2.3 / 121.6 }, // CNY (Yuan) ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
            { 11.5, 11.5 / 15670.0, 11.5 / 16808.0, 11.5 / 103.5, 11.5 / 20.8, 11.5 / 10.8, 11.5 / 11.6, 11.5 / 2.3, 1, 11.5 / 15.3, 11.5 / 121.6 }, // SGD ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
            { 15.3, 15.3 / 15670.0, 15.3 / 16808.0, 15.3 / 103.5, 15.3 / 20.8, 15.3 / 10.8, 15.3 / 11.6, 15.3 / 2.3, 15.3 / 11.5, 1, 15.3 / 121.6 }, // CHF (Franc Swiss) ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
            { 121.6, 121.6 / 15670.0, 121.6 / 16808.0, 121.6 / 103.5, 121.6 / 20.8, 121.6 / 10.8, 121.6 / 11.6, 121.6 / 2.3, 121.6 / 11.5, 121.6 / 15.3, 1 }  // HKD (Dolar Hongkong) ke [IDR, USD, EUR, JPY, GBP, AUD, CAD, CNY, SGD, CHF, HKD]
        };
        // Program utama dengan perulangan
        while (true) {
            // Input jumlah uang
            System.out.print("Masukkan jumlah uang: ");
            double nominal = input.nextDouble();

            // Pilih mata uang asal
            System.out.println("Pilih mata uang asal: 1. IDR  2. USD  3. EUR  4. JPY  5. GBP  6. AUD  7. CAD  8. CNY  9. SGD  10. CHF  11. HKD");
            int asal = input.nextInt() - 1;  // Menyesuaikan dengan indeks array (0 untuk IDR, 1 untuk USD, 2 untuk EUR, dll)

            // Pilih mata uang tujuan
            System.out.println("Pilih mata uang tujuan: 1. IDR  2. USD  3. EUR  4. JPY  5. GBP  6. AUD  7. CAD  8. CNY  9. SGD  10. CHF  11. HKD");
            int tujuan = input.nextInt() - 1; // Menyesuaikan dengan indeks array

            // Panggil method konversi
            konversi(nominal, asal, tujuan, rates);

            // Tanya apakah ingin melakukan konversi lagi
            System.out.print("Apakah Anda ingin melakukan konversi lagi? (yes/no): ");
            String ulang = input.next();
            if (ulang.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Terima kasih telah menggunakan program konversi mata uang.");
        input.close();
    }
}
