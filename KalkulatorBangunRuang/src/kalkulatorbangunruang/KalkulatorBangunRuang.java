/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatorbangunruang;

/**
 *
 * @author ASUS
 */
public class KalkulatorBangunRuang {
    
class Kubus {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}

// CLASS BALOK
class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar
                + panjang * tinggi
                + lebar * tinggi);
    }
}

// CLASS TABUNG
class Tabung {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
    public double getJariJari() {
        return jariJari;
    }
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari
                * (jariJari + tinggi);
    }
}

}
