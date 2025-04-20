package SI2B;


public class ClassData {
    // Atribut
    private String nama;
    private String restoran;
    private String respon;

    public ClassData() {}
    
    public ClassData(String nama, String restoran, String respon) {
        this.nama = nama;
        this.restoran = restoran;
        this.respon = respon;
        
    }
    // set & get
    public void setNama (String nama) {
        this.nama = nama;
    }
    public String getNama () {
        return nama;
    }
    
    public void setRestoran (String restoran) {
        this.restoran = restoran;
    }
    public String getRestoran () {
        return restoran;
    }

    public void setRespon(String respon) {
        this.respon = respon;
    }
    public String getRespon() {
        return respon;
    }
    

    void tampilkanHasilMenu() {
        System.out.println("Daftar Menu :\n");
        for (int menu = 1; menu <= 3; menu++) {
            System.out.println("Menu ke-" + menu + ":");
            for (int jenis = 1; jenis <= 3; jenis++) {
                if (menu == 1 && jenis == 1) {
                    System.out.println("01. Nasi Ayam \t\t\t Rp. 20.000");
                    System.out.println("01. Lemon Tea \t\t\t Rp. 20.000\n");
                } if (menu == 2 && jenis == 2) {
                    System.out.println("02. Nasi Rendang \t\t Rp. 35.000");
                    System.out.println("02. Coca - Cola \t\t Rp. 15.000\n");
                } if (menu == 3 && jenis == 3) {
                    System.out.println("03. Nasi Uduk \t\t\t Rp. 15.000");
                    System.out.println("03. Es Teh Manis \t\t Rp. 10.000\n");
                }
            }
        }
    }
}
