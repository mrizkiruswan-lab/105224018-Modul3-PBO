import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pinBenar = 123456;
        int pin;
        int percobaan = 0;

        while (percobaan < 3) {
            System.out.print("Masukkan PIN: ");
            pin = input.nextInt();

            if (pin == pinBenar) {
                System.out.println("Login berhasil");
                break;
            } else {
                percobaan++;
                System.out.println("PIN salah");
            }

            if (percobaan == 3) {
                System.out.println("Akun diblokir.");
            }
        }
    }
}