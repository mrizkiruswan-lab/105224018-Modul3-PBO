import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextFloat();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextFloat();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case '/':
                if (angka2 != 0)
                    System.out.println("Hasil = " + (angka1 / angka2));
                else
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                break;

            default:
                System.out.println("Operator tidak valid.");
        }
    }
}