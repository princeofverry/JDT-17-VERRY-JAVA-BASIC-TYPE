package com.indivaragroup.converter.character;

public class CharConversion {
    public void showCharConversion(){
        char huruf = 'A';
        char angka = '7';
        char simbol = '#';
        char spasi = ' ';

        System.out.println("Huruf : " + huruf);
        System.out.println("Angka : " + angka);
        System.out.println("Simbol : " + simbol);
        System.out.println("Spasi : [" + spasi + "]");

        // escape sequence
        char newline = '\n';
        char tab = '\t';
        char quote = '\'';

        System.out.println("Escape Sequence: ");
        System.out.println("Baris 1 " + newline + "baris 2");
        System.out.println("Kolom1" + tab + "kolom2");
        System.out.println("Tanda kutip: " + quote);
    }
}
