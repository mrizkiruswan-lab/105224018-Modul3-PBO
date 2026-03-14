import java.util.Scanner;

public class THT3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int stokVIP = 5;
        int stokFestival = 25;
        int stokTribune = 35;

        int hargaVIP = 1500000;
        int hargaFestival = 800000;
        int hargaTribune = 500000;

        boolean jalan = true;

        while (jalan) {

            System.out.println("\n=== KIOSK TIKET SOUNDFEST 2026 ===");
            System.out.println("Sisa Stok:");
            System.out.println("1. VIP (Rp 1.500.000) - Stok: " + stokVIP);
            System.out.println("2. Festival (Rp 800.000) - Stok: " + stokFestival);
            System.out.println("3. Tribune (Rp 500.000) - Stok: " + stokTribune);
            System.out.println("4. Matikan Mesin");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            if (pilihan == 4) {
                System.out.println("Mesin dimatikan oleh teknisi.");
                jalan = false;
                break;
            }

            int stok = 0;
            int harga = 0;
            int usiaMin = 0;

            if (pilihan == 1) {
                stok = stokVIP;
                harga = hargaVIP;
                usiaMin = 18;
            } else if (pilihan == 2) {
                stok = stokFestival;
                harga = hargaFestival;
                usiaMin = 15;
            } else if (pilihan == 3) {
                stok = stokTribune;
                harga = hargaTribune;
                usiaMin = 0;
            } else {
                System.out.println("Menu tidak valid.");
                continue;
            }

            System.out.print("Masukkan jumlah tiket: ");
            int jumlah = input.nextInt();

            if (jumlah > stok) {
                System.out.println("Stok tidak mencukupi.");
                continue;
            }

            int tiketBerhasil = 0;
            int totalHarga = 0;
            boolean batal = false;

            for (int i = 1; i <= jumlah; i++) {

                int usia;

                while (true) {
                    System.out.print("Masukkan usia untuk tiket ke-" + i + ": ");
                    usia = input.nextInt();

                    if (usia == -1) {
                        batal = true;
                        break;
                    }

                    if (usia <= 0 || usia > 120) {
                        System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                    } else {
                        break;
                    }
                }

                if (batal) {
                    System.out.println("Pembatalan darurat. Kembali ke menu utama.");
                    break;
                }

                if (usia < usiaMin) {
                    System.out.println("Usia tidak memenuhi syarat. Tiket dibatalkan.");
                    continue;
                }

                System.out.println("Tiket ke-" + i + " berhasil diproses.");
                tiketBerhasil++;
                totalHarga += harga;
            }

            if (!batal) {
                if (pilihan == 1) {
                    stokVIP -= tiketBerhasil;
                } else if (pilihan == 2) {
                    stokFestival -= tiketBerhasil;
                } else if (pilihan == 3) {
                    stokTribune -= tiketBerhasil;
                }

                System.out.println("\n=== NOTA PEMBELIAN ===");
                System.out.println("Tiket berhasil: " + tiketBerhasil);
                System.out.println("Total bayar: Rp " + totalHarga);
            }
        }

        input.close();
    }
}