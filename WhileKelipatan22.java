import java.util.Scanner;

public class WhileKelipatan22 {
    
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0, rata2 = 0, i = 1;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        while (i <= 50)
        {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter ++;
                rata2 = jumlah/counter;
            }
            i++;
        }
        System.out.printf("Banykanya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata dari seluruh bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, rata2);
    }

}
