/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;
import java.util.Scanner;


/**
 *
 * @author MOKLET-2
 */
public class JavaApplication20 {

    public static void main(String[] args) {
        //deklarasi variabel
        String nama;
        int nilai;
        
        //menggunakan scanner
        
        Scanner io = new Scanner (System.in);        
       System.out.print("Nama Siswa : ");
       nama = io.nextLine ();
       System.out.print ("Nilai Siswa : ");
       nilai = io.nextInt ();
        
        //struktur kondisi if
        if (nilai >= 90){
            System.out.println ("Grade A");
        }
        else if (nilai >= 80){
             System.out.println ("Grade B+");
        }
        else if (nilai >= 70){
            System.out.println ("Grade B");
        }
            else{
             System.out.println ("Grade F");
                    }
        }
            }