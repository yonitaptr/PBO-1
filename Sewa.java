package com.company.penyewaan;
import java.util.*;
import java.util.Scanner;

public class Sewa {

    //Membuat method dengan nama SetObjek
    public static void SetObjek() {
        System.out.println("Daftar Mobil Matic: ");
        Set<String> matic = new LinkedHashSet<String>();
        matic.add("New Dihatsu Ayla 1.2 R Deluxe AT");
        matic.add("Honda Brio Satya E CVT");
        matic.add("Daihatsu Sigra 1.2 R Deluxe");
        matic.add("Daihatsu Sirion 1.3 Sport");
        matic.add("Suzuki Ignis GX AGS");
        matic.add("Suzuki Karimun Wagon R AGS Airbag");
        matic.add("New Toyota Agya 1.2 A/T TRD");

        //Meambahkan data dengan nilai yang sama
        matic.add("New Toyota Agya 1.2 A/T TRD");

        for (String cetak : matic) {
            System.out.println("" + cetak);
        }
    }

    //Membuat method dengan nama ListObjek
    public static void ListObjek() {
        System.out.println("\nDaftar Mobil Manual: ");
        List<String> manual = new LinkedList<String>();
        manual.add("Toyota Calya");
        manual.add("Toyota Avanza");
        manual.add("Toyota Sienta");
        manual.add("Nissan Grand Livina");
        manual.add("Wuling Confero");

        //Menambahkan data ke indek ke-0
        manual.add(0, "Daihatsu Xenia");
        for (int i = 0; i < manual.size(); i++) {
            System.out.println(manual.get(i));
        }
    }

    //Membuat mrthod dengan Nama MapObjek
    public static void MapObjek() {
        System.out.println("\nDaftar Kode Mobil: ");
        Map<Integer, String> kode = new LinkedHashMap<Integer, String>();
        kode.put(1, "= New Dihatsu Ayla 1.2 R Deluxe AT");
        kode.put(2, "= Honda Brio Satya E CVT");
        kode.put(3, "= Daihatsu Sigra 1.2 R Deluxe");
        kode.put(4, "= Daihatsu Sirion 1.3 Sport");
        kode.put(5, "= Suzuki Ignis GX AGS");
        kode.put(6, "= Suzuki Karimun Wagon R AGS Airbag");
        kode.put(7, "= New Toyota Agya 1.2 A/T TRD");
        kode.put(8, "= Daihatsu Xenia");
        kode.put(9, "= Toyota Calya");
        kode.put(10, "= Toyota Avanza");
        kode.put(11, "= Toyota Sienta");
        kode.put(12, "= Nissan Grand Livina");
        kode.put(13, "= Wuling Confero ");
        for (Map.Entry<Integer, String> map : kode.entrySet()) {
            System.out.println("" + map.getKey() + " " + map.getValue());
        }
    }

    //Membuat method dengan Nama Konfirmasi
    public static void Konfirmasi() {
        int pilihan;
        Scanner aa = new Scanner(System.in);
        System.out.println("Terima Kasih sudah melakukan sewa di Sewa Mobil Kita");
        System.out.print("Ingin melakukan sewa kembali? (1 = ya, 2 = tidak) :  ");
        pilihan = (char) aa.nextInt();
        if (pilihan == 1){
            //Pemanggilan fungsi penyewaan
            Penyewaan();
        }
        else{
            System.exit(0);
        }
    }

    //Fungsi Utama atau Main
    public static void main(String[] args) {
        Penyewaan();
    }

    //Membuat method dengan nama Penyewaan
    public static void Penyewaan() {
        System.out.println("\n======================================");
        System.out.println("Selamat Datang di Sewa Mobil Kita");
        System.out.println("Menyewakan segala macam mobil");
        System.out.println("Dengan Harga Paling terjangkau");
        System.out.println("======================================\n");

        //Melakukan pemanggilan mrthod
        SetObjek();
        ListObjek();
        MapObjek();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nMasukkan Nama Anda : ");
        String nama = sc.nextLine();

        System.out.println("Masukkan Kode Mobil: ");
        int code = sc.nextInt();
        int harga_sewa = 0;

        if (code == 1) {
            harga_sewa = 650000;
        } else if (code == 2) {
            harga_sewa = 400000;
        } else if (code == 3) {
            harga_sewa = 800000;
        } else if (code == 4) {
            harga_sewa = 750000;
        } else if (code == 5) {
            harga_sewa = 550000;
        } else if (code == 6) {
            harga_sewa = 590000;
        } else if (code == 7) {
            harga_sewa = 750000;
        } else if (code == 8) {
            harga_sewa = 400000;
        } else if (code == 9) {
            harga_sewa = 800000;
        } else if (code == 10) {
            harga_sewa = 780000;
        } else if (code == 11) {
            harga_sewa = 930000;
        } else if (code == 12) {
            harga_sewa = 780000;
        } else if (code == 13) {
            harga_sewa = 550000;
        } else {
            System.out.println("Mohon Maaf, Kode Tidak Valid!");
            System.exit(0);
        }
        System.out.println("Masukkan Jumlah Sewa : ");
        int jumlah_sewa = sc.nextInt();

        //Rumus Menghitung Harga Sewa
        int total_harga = harga_sewa * jumlah_sewa;

        System.out.println("\n============================================");
        System.out.println("              Detail Penyewaan                ");
        System.out.println("Penyewa         : " + nama);
        System.out.println("Jumlah Sewa     : " + jumlah_sewa);
        System.out.println("Total Harga     : " + total_harga);
        System.out.println("=============================================");

        //Melakukan pemanggilan method
        Konfirmasi();

    }
}

