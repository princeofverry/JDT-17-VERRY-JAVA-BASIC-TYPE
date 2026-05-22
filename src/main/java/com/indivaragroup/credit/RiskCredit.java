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
}
