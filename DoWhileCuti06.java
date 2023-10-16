import java.util.Scanner;

public class DoWhileCuti06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = sc.nextInt();
        do {
            System.out.print("Apakah anda ingin mengammbil cuti (y/t)? ");
            konfirmasi = sc.nextLine();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }
                else if (jumlahHari > jatahCuti) {
                    System.out.println("Jumlah hari yang dimasukkan melebihi jatah cuti");
                    System.out.println("Sisa jatah cuti anda: " + jatahCuti);
                    System.out.println("Silahkan ulang kembali");
                }
                else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    break;
                }
                
            }
            else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("bye-bye");
            }

        }while (jatahCuti > 0);

    }
}        