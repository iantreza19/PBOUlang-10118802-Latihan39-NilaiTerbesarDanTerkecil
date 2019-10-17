
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Petugas petugas = new Petugas();
        DaftarNilai daftarNilai = new DaftarNilai();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
        petugas.inputPetugas();
        daftarNilai.inputJumlahMhs();

//        input nilai mhs
        for (int i=0; i<daftarNilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            daftarNilai.nilaiMhs[i] = scanner.nextInt();
            daftarNilai.hitungNilaiTerbesar(i);
            daftarNilai.hitungNilaiTerkecil(i);
        }
        daftarNilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah "+daftarNilai.nBesar);
        System.out.println("Nilai Terkecil adalah "+daftarNilai.nKecil);

        System.out.print("\nPetugas : "+petugas.namaPetugas+"\n");
        
    }
    
}
