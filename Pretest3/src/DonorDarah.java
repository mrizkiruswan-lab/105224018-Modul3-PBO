import java.util.Scanner;

public class DonorDarah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int usia;
        float beratBadan, hemoglobin;

        System.out.print("Masukkan usia: ");
        usia = input.nextInt();

        System.out.print("Masukkan berat badan (kg): ");
        beratBadan = input.nextFloat();

        System.out.print("Masukkan kadar hemoglobin (g/dL): ");
        hemoglobin = input.nextFloat();

        if (usia >= 17 && usia <= 60) {

            if (beratBadan >= 45) {

                if (hemoglobin >= 12.5 && hemoglobin <= 17) {
                    System.out.println("anda layak menjadi pendonor darah.");
                } else {
                    System.out.println("ditolak karena Kadar hemoglobin tidak memenuhi syarat.");
                }

            } else {
                System.out.println("ditolak karena Berat badan minimal 45 kg.");
            }

        } else {
            System.out.println("ditolak karena Usia harus antara 17 - 60 tahun.");
        }

        input.close();
    }
}