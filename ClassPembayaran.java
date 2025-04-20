package SI2B;

public class ClassPembayaran extends ClassMenu{
    private boolean caraPembayaran;
    private String metodePembayaran;
    private int totalHarga;
    private int diskon;
    private float nilai;


    public ClassPembayaran(){}

    public ClassPembayaran(int totalHarga, int diskon, float nilai) {
        this.totalHarga = 0;
        this.diskon = 0;
        this.nilai = nilai;
    }

    public void setNilai(float nilai) {
        this.nilai = nilai;
    }
    public float getNilai() {
        return nilai;
    }

    public void tambahHarga(int harga) {
        this.totalHarga += harga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    @Override
    public int getTotalHarga() {
        return totalHarga;
    }
    
    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }
    public int getDiskon() {
        if (getNilai() == 5) {
            return totalHarga * 10 / 100;
        } else {
            return 0;
        }
    }

    public int getTotalBayar() {
        return totalHarga - getDiskon();
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
    public String getMetodePembayaran() {
        if(metodePembayaran.equals("01")) {
            return "Metode Pembayaran : Kartu Kredit";
        } else if (metodePembayaran.equals("02")) {
            return "Metode Pembayaran : E-Wallet";
        } else if (metodePembayaran.equals("03")) {
            return "Metode Pembayaran : Tunai";
        } else {
            return "Metode pembayaran tidak dikenali";
        }
    }

    public void setCaraPembayaran(boolean caraPembayaran) {
        this.caraPembayaran = caraPembayaran;
    }
    public boolean isCaraPembayaran() {
        if (metodePembayaran.equals("01") && totalHarga > 50000) {
            return true;
        } else if (metodePembayaran.equals("02") && totalHarga > 30000) {
            return true;
        } else if (metodePembayaran.equals("03") && totalHarga > 0 ) {
            return true;
        } else {
            return false;
        }
    }

    void tampilMetodePembayaran() {
        System.out.println("\n============================================");
        System.out.println("\t\tMetode Pembayaran");
        System.out.println("============================================\n");
        System.out.println("01. Kartu Kredit \n02. E-Wallet \n03. Tunai");
    }
}
