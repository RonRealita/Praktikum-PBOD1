/**
 * File : BujurSangkar.java 13/03/2024
 * Penulis : Rona Realita Najma (24060122140124)
 * Deskripsi : representasi dasar dari objek bujur sangkar, turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi, int jumlahSisi) {
		super(jumlahSisi);
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	
	public double getPanjangSisi(){
		 return this.panjangSisi;
	}
}

