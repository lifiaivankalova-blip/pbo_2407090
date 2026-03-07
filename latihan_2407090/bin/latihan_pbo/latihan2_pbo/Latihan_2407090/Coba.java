package latihan_2407090.bin.latihan_pbo.latihan2_pbo.Latihan_2407090;

public class Coba {
      protected double panjang;
   protected double lebar;
   protected double sisi;

   public Coba() {
   }

   public void setPanjang(double panjang) {
      this.panjang = panjang;
   }

   public double getPanjang() {
      return this.panjang;
   }

   public void setLebar(double lebar) {
      this.lebar = lebar;
   }

   public void cetakLuas() {
      double var10001 = this.panjang * this.lebar;
      System.out.println("Luasnya adalah : " + var10001);
   }

   public double hitungLuas() {
      double luas = this.panjang * this.lebar;
      return luas;
   }
}
