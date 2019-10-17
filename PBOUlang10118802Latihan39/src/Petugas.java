
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
public class Petugas {
    
    public String namaPetugas;
    DaftarNilai daftarNilai = new DaftarNilai();
    Scanner scanner = new Scanner(System.in);

    public void inputPetugas() {
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.next();
    }
    
}
