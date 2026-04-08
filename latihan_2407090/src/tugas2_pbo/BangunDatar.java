package tugas2_pbo;

public class BangunDatar {
// atribut (enkapsulasi → private)
    // atribut (enkapsulasi → private)
    private double panjang;
    private double lebar;

    // constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // method hitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}
