package latihan_2407090.bin.latihan_pbo.latihan1_pbo.Latihan_2407090;

public class Cafe {
      String nama;
   String alamat;
   String menu;

   Cafe(String nama, String alamat, String menu) {
      this.nama = nama;
      this.alamat = alamat;
      this.menu = menu;
      System.out.println("Nama Cafe  : " + nama);
      System.out.println("Alamat     : " + alamat);
      System.out.println("Menu       : " + menu);
      System.out.println();
   }

   void buka() {
      System.out.println("Cafe sudah buka");
   }
}
