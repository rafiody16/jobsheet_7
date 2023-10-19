import java.util.Scanner;

public class DoWhileCuti22 {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.println("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) 
            {
                System.out.println("Jumlah Hari: ");
                jumlahHari = sc.nextInt();
                
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }
                else
                {
                    System.out.println("Sisa jatah cuti tidak mencukupi!");
                }
            }
            else if (konfirmasi.equalsIgnoreCase("t"))
            {
                System.out.println("Program Keluar");
                break;
            }
            else
            {
                System.out.println("Inputan tidak valid! Silahkan input (y/t)");
            }
        } while (jatahCuti > 0);
    }
    
}
