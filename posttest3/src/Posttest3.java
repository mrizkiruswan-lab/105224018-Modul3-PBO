import java.util.Scanner;

public class Posttest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        int saldo = 500000; 
        int jumlah;

        do {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();

            switch (pilih) {

                case 1:
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah setor tunai: Rp ");
                    jumlah = input.nextInt();
                    saldo += jumlah;
                    System.out.println("Setor tunai berhasil");
                    break;

                case 3:
                    System.out.print("Masukkan jumlah tarik tunai: Rp ");
                    jumlah = input.nextInt();

                    if (saldo - jumlah >= 50000) {
                        saldo -= jumlah;
                        System.out.println("Penarikan tunai berhasil");
                    } else {
                        System.out.println("Penarikan gagal karena Saldo minimal harus Rp 50.000");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilih != 4); 
        input.close();
    }
}