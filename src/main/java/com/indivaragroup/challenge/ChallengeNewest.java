package com.indivaragroup.challenge;

public class ChallengeNewest {
    public static void challengeNewest(int initHour, int endHour, String jenis) {
        int jamMasuk = initHour;
        int jamKeluar = endHour;
        String jenisKendaraan = jenis;

        int maxPriceMobil = 50000;
        int maxPriceMotor = 30000;
        int price;

        if(jenisKendaraan == "mobil") {
            int waktuMobil;
            if (jamKeluar < jamMasuk) {
                waktuMobil = (24 - jamMasuk) + jamKeluar;
            } else if (jamKeluar == jamMasuk) {
                waktuMobil = 1;
            } else {
                waktuMobil = jamKeluar - jamMasuk;
            }

            int rumusMobil = 8000 + ((waktuMobil - 1 ) * 5000);

            if (rumusMobil > maxPriceMobil) {
                price = maxPriceMobil;
                System.out.println("Biaya anda max: " + price);
            } else {
                if (initHour == endHour) {
                    price = 8000;
                    System.out.println("biaya parkir 1 jam mobil: " + price);
                } else {
                    System.out.println("Biaya anda parkir mobil <24h :" + rumusMobil);
                }
            }
        } else {
            int waktuMotor;
            if (jamKeluar < jamMasuk) {
                waktuMotor = (24 - jamMasuk) + jamKeluar;
            } else if (jamKeluar == jamMasuk) {
                waktuMotor = 1;
            } else {
                waktuMotor = jamKeluar - jamMasuk;
            }
            int rumusMotor = 5000 + ((waktuMotor - 1) * 3000);
            if (rumusMotor > maxPriceMotor) {
                price = maxPriceMotor;
                System.out.println("Biaya anda max: " + price);
            } else {
                if (initHour == endHour) {
                    price = 5000;
                    System.out.println("biaya parkir 1 jam motor: " + price);
                } else {
                    System.out.println("Biaya anda parkir motor <24h :" + rumusMotor);
                }
            }
        }
    }
}
