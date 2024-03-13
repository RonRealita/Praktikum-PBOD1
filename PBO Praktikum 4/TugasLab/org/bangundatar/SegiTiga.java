/**
 * File : BujurSangkar.java 13/03/2024
 * Penulis : Rona Realita Najma (24060122140124)
 * Deskripsi : representasi dasar dari objek bujur sangkar, turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.Poligon;

public class SegiTiga extends Poligon {
    private double alas, tinggi;

    public SegiTiga(double alas, double tinggi, int jumlahSisi) {
        super(jumlahSisi);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas(){
        return alas * tinggi * 0.5;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang berisi " +this.getJumlahSisi());
    }
}