package SI2B;


public class ClassMenu  {
    // Data responden / Atribute 
    private String pemesananMakanan;
    private String pemesananMinuman;
    private int hargaMakanan;
    private int hargaMinuman;

    // constructor Default
    public ClassMenu() {}
    
    // constructor dengan parameter
    public ClassMenu(String pemesananMakanan, String pemesananMinuman){
        this.pemesananMakanan = pemesananMakanan;
        this.pemesananMinuman = pemesananMinuman;
    }

    // private set - get
    public void setPemesananMakanan(String pemesananMakanan) {
        this.pemesananMakanan = pemesananMakanan;
    }
    public String getPemesananMakanan() {
        if (pemesananMakanan.equals("01")) {
            return "Nasi Ayam";
        } else if (pemesananMakanan.equals("02")) {
            return "Nasi Rendang";
        } else if (pemesananMakanan.equals("03")) {
            return "Nasi Uduk";
        } else {
            return "Tidak Tersedia";
        }
    }

    public void setPemesananMinuman(String pemesananMinuman) {
        this.pemesananMinuman = pemesananMinuman;
    }
    public String getPemesananMinuman() {
        if (pemesananMinuman.equals("01")) {
            return "Lemon Tea";
        } else if (pemesananMinuman.equals("02")) {
            return "Coca - Cola";
        } else if (pemesananMinuman.equals("03")) {
            return "Es Teh Manis";
        } else {
            return "Tidak Tersedia";
        }
    }

    public void setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }
    public int getHargaMakanan() {
        if (pemesananMakanan.equals("01")) {
            hargaMakanan = 20000;
        } else if (pemesananMakanan.equals("02")) {
            hargaMakanan = 35000;
        } else if (pemesananMakanan.equals("03")) {
            hargaMakanan = 15000;
        } else {
            hargaMakanan = 0;
        }
        return hargaMakanan;
    }

    public void setHargaMinuman(int hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }
    public int getHargaMinuman() {
        if (pemesananMinuman.equals("01")) {
            hargaMinuman = 20000;
        } else if (pemesananMinuman.equals("02")) {
            hargaMinuman = 15000;
        } else if (pemesananMinuman.equals("03")) {
            hargaMinuman = 10000;
        } else {
            hargaMinuman = 0;
        }
        return hargaMinuman;
    }

    public int getTotalHarga(){
        return getHargaMakanan() + getHargaMinuman();
    }

    void tampilHarga (){
        System.out.println("Harga Makanan\t: " + getHargaMakanan());
        System.out.println("Harga Minuman\t: " + getHargaMinuman());
        System.out.println("Total Harga\t: " + getTotalHarga());
    }
}
