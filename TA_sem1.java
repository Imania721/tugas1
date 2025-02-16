import java.util.Scanner;

public class TA_sem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlPoliteknik = 0;
        while (true) {
            System.out.print("Masukkan Jumlah Politeknik: ");
            
            if (sc.hasNextInt()) {
                jmlPoliteknik = sc.nextInt();
                sc.nextLine(); // Membersihkan buffer

                if (jmlPoliteknik > 0) {
                    break; // Input valid, keluar dari loop
                
                } else {
                    System.out.println("Jumlah politeknik harus lebih dari nol. Silakan masukkan kembali.");
                }
            } else {
                System.out.println("Input tidak valid. Masukkan angka yang benar.");
                sc.nextLine(); // Membersihkan input yang tidak valid
            }
        }

        String[][][] atlet = new String[3][jmlPoliteknik][3];
        String[] cabor = {"Badminton", "Basket", "Bola Voli"}; 

        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Masukkan nama atlet untuk cabang " + cabor[i] + ":");
            for (int j = 0; j < jmlPoliteknik; j++) {
                System.out.println("Politeknik " + (j + 1) + ":");
                for (int k = 0; k < 3; k++) {
                    System.out.print("Atlet " + (k + 1) + ": ");
                    String namaAtlet = sc.nextLine();

                    if (namaAtlet.isEmpty()) {
                        System.out.println("Nama atlet tidak boleh kosong. Silakan masukkan kembali.");
                        k--;
                    } else {
                        atlet[i][j][k] = namaAtlet;
                    }
                }
            }
        }
        System.out.println("\n-----------------------");
        System.out.println("Informasi Nama Atlet:");
        System.out.println("-----------------------");
        for (int olahraga = 0; olahraga < cabor.length; olahraga++) {
            System.out.println("Cabang " + cabor[olahraga] + ":");
            for (int politeknik = 0; politeknik < jmlPoliteknik; politeknik++) {
                System.out.println("Politeknik " + (politeknik + 1) + ":");
                for (int nama = 0; nama < 3; nama++) {
                    System.out.println("Atlet " + (nama + 1) + ": " + atlet[olahraga][politeknik][nama]);
                }
                System.out.println();
            }
        }
    }
}
