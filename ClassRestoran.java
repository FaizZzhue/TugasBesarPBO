package SI2B;

public class ClassRestoran {
    String namaPerusahaan = "PT. Nusantara Kuliner";
    String alamat = "Jl. Makanan No. 123, Jakarta";
    String kontak = "\t021-12345678";
    String email= "info@nusantarakuliner.co.id";

    public void tampilProfil() {
        System.out.println("\n============ PROFIL PERUSAHAAN ============");
        System.out.println("\t" + namaPerusahaan);
        System.out.println("\t" + alamat);
        System.out.println("\t" + kontak);
        System.out.println("\t" + email);
    }
}
