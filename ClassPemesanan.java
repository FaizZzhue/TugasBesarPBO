package SI2B;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassPemesanan {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        ClassData data1 = new ClassData();
        ClassMenu data2 = new ClassMenu();
        ClassPembayaran data3 = new ClassPembayaran();
        ClassRestoran data4 = new ClassRestoran();

        System.out.print("Masukkan Nama Anda \t: ");
        data1.setNama(s.nextLine());

        System.out.print("Masukkan Nama Restoran \t: ");
        data1.setRestoran(s.nextLine());

        data4.tampilProfil();
        System.out.println("\n============================================");
        System.out.println("\t\t" + data1.getRestoran());
        System.out.println("============================================\n");

        data1.tampilkanHasilMenu(); 

        // array
        ArrayList<ClassMenu> pesananList = new ArrayList<>();

        char jawab = 'Y';

        // while
        while (jawab == 'Y' || jawab == 'y') {
            data2 = new ClassMenu(); 

            System.out.print("Masukkan Menu Makanan yang Dipesan <01/02/03> : ");
            data2.setPemesananMakanan(s.nextLine());

            System.out.print("Masukkan Menu Minuman yang Dipesan <01/02/03> : ");
            data2.setPemesananMinuman(s.nextLine());

            pesananList.add(data2);

            System.out.print("\nApakah Ingin Menambah Pemesanan <Y/T> : ");
            jawab = s.nextLine().charAt(0);
            System.out.println("=================================================");
        }

        ClassCetak.tampilRingkasan(data1, pesananList, data3);

        System.out.println("Subtotal\t: Rp. " + data3.getTotalHarga());

        System.out.print("\nMasukkan Kritik/Saran Anda : ");
        data1.setRespon(s.nextLine());

        System.out.print("Rating Terhadap Pesanan Anda <1-5> : ");
        data3.setNilai(s.nextFloat());
        s.nextLine();

        // Input Pembayaran
        if (data3.getNilai() == 5) {
            ClassCetak.tampilPembayaran(data3);
        } else if (data3.getNilai() == 1){
            jawab = 'Y';
            while (jawab == 'Y' || jawab == 'y') { 
                System.out.print("Masukkan kata makanan yang tidak sesuai (misal: Nasi Ayam): ");
                String makananKeyword = s.nextLine();

                System.out.print("Masukkan kata minuman yang tidak sesuai (misal: Es Teh Manis): ");
                String minumanKeyword = s.nextLine();

                ClassCetak.tampilTidakSesuai(pesananList, makananKeyword, minumanKeyword);

                System.out.print("Ingin Memasukan Kembali Makanan Yang Tidak Sesuai (Y/T): ");
                jawab = s.next() .charAt(0);
                s.nextLine();
            }
        } else {
            ClassCetak.tampilPembayaran(data3);
        }

        data3.tampilMetodePembayaran();
        
        do { 
            System.out.print("Pilih Metode Pembayaran <01/02/03>: ");
            data3.setMetodePembayaran(s.nextLine());
            
            if (!data3.isCaraPembayaran()) {
                System.out.println("Metode pembayaran tidak dikenali");
            } else {
                System.out.println(data3.getMetodePembayaran());
            }
            System.out.println("-----------------------------------------------------");
        } while (!data3.isCaraPembayaran());
        
        int totalHarga;
        do { 
            System.out.print("\nMasukkan nominal pembayaran: Rp. ");
            totalHarga = Integer.parseInt(s.nextLine());
            
            if (totalHarga < data3.getTotalBayar()) {
                System.out.println("Uang Anda kurang. Masukkan Transaksi Ulang.");
            } else {
                int kembalian = totalHarga - data3.getTotalBayar();
                System.out.println("Kembalian Anda: Rp. " + kembalian);
            }
        } while (totalHarga < data3.getTotalBayar());

        ClassCetak.tampilStrukPembayaran(data1, data3);

        s.close();
    }
}