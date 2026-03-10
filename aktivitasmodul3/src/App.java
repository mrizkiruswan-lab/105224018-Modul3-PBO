import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner i = new Scanner(System.in);
        System.out.println("Masukkan Usia");
        int usia = i.nextInt();

        if (usia > 17){
            System.out.println("oke boleh");
            System.out.println("Masukkan berat badan:");
            float bb = i.nextFloat();
            if (bb > 45){
                System.out.println("Boleh Lanjut");
                System.out.println("Masukkan Hemo:");
                float h = i.nextFloat();
                if (h > 12.5){
                    System.out.println("Mantap boleh");
                } else {
                    System.err.println("blm boleh kata mama");
                }
            } else{
                System.out.println("maaf kurang");
            }
        }
    }
}
