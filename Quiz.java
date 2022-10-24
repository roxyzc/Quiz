import java.text.DecimalFormat;
import java.util.*;

class KonvertDollar {
    private double mataUang;
    private double hasil;

    public double getHasil() {
        return hasil;
    }

    public void konvertUang(int x, int i) {
        switch (x) {
            case 1:
                this.mataUang = 0.000064d;
                this.hasil = mataUang * i;
                break;
            case 2:
                this.mataUang = 0.00010d;
                this.hasil = mataUang * i;
                break;
            case 3:
                this.mataUang = 0.000092d;
                this.hasil = mataUang * i;
            default:
                System.out.println("Nggak ada bang");
                break;
        }
    }
}

public class Quiz {
    public static void main(String[] args) {
        nama();
        DecimalFormat db = new DecimalFormat("#.###");
        KonvertDollar coba = new KonvertDollar();
        Scanner input = new Scanner(System.in);
        System.out.print("Uang rupiah anda: ");
        int y = input.nextInt();
        System.out.print("1. dolar amerika serikat\n2. dolar australia\n3. dolar singapura\nPilih: ");
        int x = input.nextInt();
        coba.konvertUang(x, y);
        double uang = coba.getHasil();
        System.out.println(db.format(uang));
        input.close();
    }

    static void nama() {
        System.out.println("Nama\t: Ridho Pikriyansyah");
        System.out.println("Kelas\t: TI.21.A.3");
        System.out.println("Nim\t: 312110169");
        System.out.println("");
    }
}