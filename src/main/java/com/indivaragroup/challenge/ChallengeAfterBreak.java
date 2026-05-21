package com.indivaragroup.challenge;

public class ChallengeAfterBreak {

    public static void challangeAfterBreak() {

        int nilaiTugas = 75;
        int nilaiUjian = 76;
        int nilaiAbsen = 77;

        int rataRata = (nilaiTugas + nilaiUjian + nilaiAbsen) / 3;

        // lebih dari 90
        if (rataRata > 90) {
            System.out.println("Selamat anda lulus dengan apresiasi!");
        }
        // 75 - 90
        if (rataRata > 75 && rataRata <= 90) {
            System.out.println("Selamat anda lulus!");
        }
        // antara 65 sampai 75
        if (rataRata >= 65 && rataRata <= 75) {
            System.out.println("Informasi remedial");
        }
        // kurang dari 65
        if (rataRata < 65) {
            System.out.println("Silakan coba lagi tahun depan");
        }

    }

}