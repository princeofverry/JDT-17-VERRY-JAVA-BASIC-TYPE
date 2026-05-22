package com.indivaragroup.credit;

public class RiskCredit {
    public static void riskCredit(int gaji, int umur, int hargaRumah, int lamaCicilan) {

        // kalkulasi
        int cicilan = hargaRumah / (lamaCicilan * 12);

        // key
        boolean isApproved = false;
        boolean needPenjamin = false;
        String kategori = "Dipertimbangkan";

        // validasi
        if (umur < 21) {
            System.out.println("Pengajuan ditolak sebab masih dibawah umur");
            return;
        }

        if (lamaCicilan > 20) {
            System.out.println("Pengajuan ditolak sebab kelamaan!");
            return;
        }

        // cicilan perbulan > 40% gaji
        if (cicilan > (gaji * 40 / 100)) {
            System.out.println("Pengajuan ditolak: cicilan melebihi 40% gaji");
            return;
        }

        // high value valid?
        if (gaji > 15_000_000 && cicilan < (gaji * 30 / 100)) {
            kategori = "High Value Credit";
            isApproved = true;
        } else if (gaji >= 7_000_000 && gaji <= 14_999_999 && umur > 25) {
            kategori = "Medium Risk Credit";
            isApproved = true;
        }

        // butuh penjamin
        if (umur >= 21 && umur <= 24) {
            needPenjamin = true;
        }

        // high risk
        if (gaji < 7_000_000 && lamaCicilan >= 15) {
            kategori = "High Risk Credit - dipertimbangkan";
        }

        System.out.println("===== HASIL ANALISIS KREDIT =====");
        System.out.println("Gaji               : " + gaji);
        System.out.println("Umur               : " + umur);
        System.out.println("Harga Rumah        : " + hargaRumah);
        System.out.println("Lama Cicilan       : " + lamaCicilan + " tahun");
        System.out.println("Cicilan Per Bulan  : " + cicilan);

        System.out.println("Status Approve     : " + (isApproved ? "APPROVED" : "DIPERTIMBANGKAN"));
        System.out.println("Butuh Penjamin     : " + (needPenjamin ? "YA" : "TIDAK"));
        System.out.println("Kategori Kredit    : " + kategori);


    }

    public static void main(String[] args) {
        // risk credit with every testcase
        // test case 1
        // expected ditolak karena umur
        RiskCredit.riskCredit(
                5_000_000,
                19,
                500_000_000,
                10
        );

        // test case 2
        // tenor lebih dari 20 tahun
        // expected ditolak sebab lama
        RiskCredit.riskCredit(
                10_000_000,
                30,
                300_000_000,
                25
        );

        // test case 3
        // ditolak
        // karena cicilan terlalu besar (secara perhitungan)
        RiskCredit.riskCredit(
                5_000_000,
                28,
                800_000_000,
                10
        );

        // test case 4
        // high value
        // gaji diatas 15 juta
        // cicilan kurang dari 30% gaji
        RiskCredit.riskCredit(
                20_000_000,
                30,
                500_000_000,
                15
        );

        // test case 5
        // umur 21-24
        // butuh penjamin
        // approved and butuh penjamin and high value credit
        RiskCredit.riskCredit(
                18_000_000,
                23,
                400_000_000,
                15
        );

        // test case 6
        // gaji 7 juta - 14.999
        // Umur lebih dari 25
        // Expected:
        // - Approved
        // - Medium Risk Credit
        RiskCredit.riskCredit(
                10_000_000,
                27,
                300_000_000,
                12
        );

        // TEST CASE 7
        // Tidak masuk kategori mana pun
        // Expected:
        // - Dipertimbangkan
        // - Kategori default
        RiskCredit.riskCredit(
                8_000_000,
                24,
                350_000_000,
                10
        );

        // TEST CASE 8
        // Gaji kecil dan tenor panjang
        // Expected:
        // - Dipertimbangkan
        // - High Risk CrediT
        RiskCredit.riskCredit(
                5_000_000,
                35,
                250_000_000,
                15
        );

        // TEST CASE 9
        // Umur pas 21 tahun
        // Expected:
        // - Butuh penjamin
        // - Tidak otomatis approved
        // - Kategori default
        RiskCredit.riskCredit(
                6_500_000,
                21,
                200_000_000,
                10
        );
    }
}
