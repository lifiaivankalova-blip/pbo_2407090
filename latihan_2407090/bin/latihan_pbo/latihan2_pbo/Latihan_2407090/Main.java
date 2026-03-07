package latihan_2407090.bin.latihan_pbo.latihan2_pbo.Latihan_2407090;

public class Main {
     public Main() {
   }

   public static void main(String[] args) {
      Coba pp1 = new Coba();
      pp1.setPanjang((double)9.0F);
      System.out.println("Panjangnya adalah : " + pp1.getPanjang());
      pp1.setLebar((double)13.0F);
      pp1.cetakLuas();
      System.out.println("Luasnya adalah : " + pp1.hitungLuas());
   }
}
