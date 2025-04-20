package SI2B; 

import java.util.ArrayList;

public class ClassCetak {
    
    public static void tampilRingkasan(ClassData data1, ArrayList<ClassMenu> pesananList, ClassPembayaran data3) {
        System.out.println("\n===================== RINGKASAN =====================");
        System.out.println("Nama Pemesan\t: " + data1.getNama());
        System.out.println("Nama Restoran\t: " + data1.getRestoran());
        System.out.println("-----------------------------------------------------");
        // Perulangan For
        for (int i = 0; i < pesananList.size(); i++) {
            ClassMenu pesanan = pesananList.get(i);
            String makanan = pesanan.getPemesananMakanan();
            String minuman = pesanan.getPemesananMinuman();

            System.out.println("Pesanan ke-" + (i + 1));
            System.out.println("Makanan\t\t: " + makanan);
            System.out.println("Minuman\t\t: " + minuman);
            pesanan.tampilHarga();
            int hargaPesanan = pesanan.getTotalHarga();
            data3.tambahHarga(hargaPesanan);
            System.out.println("-----------------------------------------------------");
        }
    }

    public static void tampilTidakSesuai(ArrayList<ClassMenu> pesananList, String makananKeyword, String minumanKeyword) {
        System.out.println("\n========== Makanan Yang Tidak Sesuai ==========");
        int i = 0;
        for (ClassMenu pesanan : pesananList) {
            if (pesanan.getPemesananMakanan().equalsIgnoreCase(makananKeyword) && pesanan.getPemesananMinuman().equalsIgnoreCase(minumanKeyword)) {
                System.out.println("Pesanan ke-" + (i + 1));
                System.out.println("Makanan\t\t: " + pesanan.getPemesananMakanan());
                System.out.println("Minuman\t\t: " + pesanan.getPemesananMinuman());
                pesanan.tampilHarga();
                System.out.println("-----------------------------------------------------");
            }
            i++;
        }
    }
    
    public static void tampilPembayaran(ClassPembayaran data3) {
        
        System.out.println("\n================= INFORMASI PEMBAYARAN =================");
        System.out.println("Total Harga\t: Rp. " + data3.getTotalHarga());
        System.out.println("Diskon\t\t: Rp. " + data3.getDiskon());
        System.out.println("Total Bayar\t: Rp. " + data3.getTotalBayar());
        System.out.println("-----------------------------------------------------");
    }
    
    public static void tampilStrukPembayaran(ClassData data1, ClassPembayaran data3) {

        System.out.println("\n=========== STRUK PEMBAYARAN ===========");
        System.out.println("Nama Pemesan\t  : " + data1.getNama());
        System.out.println("Nama Restoran\t  : " + data1.getRestoran());
        System.out.println("Kritik/Saran\t  : " + data1.getRespon());
        System.out.println("Rating\t\t  : " + data3.getNilai());
        System.out.println(data3.getMetodePembayaran());
        System.out.println("Total Bayar\t  : Rp. " + data3.getTotalBayar()+" <Lunas> ");
        System.out.println("============== TERIMAKASIH ===============");
    }
}
