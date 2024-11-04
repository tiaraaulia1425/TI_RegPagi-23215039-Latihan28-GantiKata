
package pertemuan5new;

import java.util.Scanner;

/**
 *
 *  Nama : Tiara Aulia Maharani
 * NIM  : 23215039
 * TEKNIK INFORMATIKA
 * 
 */
public class latihan28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti Kata : ");
        String kataLama = scanner.nextLine();

        System.out.print("Menjadi Kata : ");
        String kataBaru = scanner.nextLine();

        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);

        scanner.close();
        System.out.println("BUILD SUCCESSFUL (total time: 50 seconds)");
    }
}
 

    
