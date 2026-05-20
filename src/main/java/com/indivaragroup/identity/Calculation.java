package com.indivaragroup.identity;

public class Calculation {

    public static void calculateKtp(int uangSaya, int biayaKtp){

        System.out.println("Uang awal saya = " + uangSaya);
        System.out.println("Biaya KTP = " + biayaKtp);

        if(uangSaya >= 10000){

            System.out.println("Saya harus membuat KTP");

            uangSaya = uangSaya - biayaKtp;

            System.out.println("Uang saya setelah buat KTP = " + uangSaya);

        }else{

            System.out.println("Uang saya saat ini tidak perlu bikin KTP");

        }
    }
}