/**
 * File : Poligon.java 13/03/2024
 * Penulis : Rona Realita Najma (24060122140124)
 * Deskripsi : representasi dasar dari objek poligon
 */
 
 package org.poligon;
 
 public class Poligon{
	protected int jumlahSisi;

	public Poligon(int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }
	 
	 public void setJumlahSisi(int sisi){
		 this.jumlahSisi = sisi;
	 }
	 
	 public int getJumlahSisi(){
		 return this.jumlahSisi;
	 }
 }