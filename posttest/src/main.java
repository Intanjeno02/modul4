import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input data user
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nomor HP: ");
        String nomor = input.nextLine();

        DuitKu user = new DuitKu(nama, nomor);

        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Setor");
            System.out.println("2. Bayar");
            System.out.println("3. Cek Saldo");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan jumlah setor: ");
                int jumlah = input.nextInt();
                user.setor(jumlah);

            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah bayar: ");
                int jumlah = input.nextInt();
                user.bayar(jumlah);

            } else if (pilihan == 3) {
                System.out.println("Saldo saat ini: Rp " + user.saldou);
            }

        } while (pilihan != 0);

        System.out.println("Program selesai.");
    }
}
