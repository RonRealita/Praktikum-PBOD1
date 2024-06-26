/**
 * File : Kubus.java 13/03/2024
 * Penulis : Rona Realita Najma (24060122140124)
 * Deskripsi : representasi dasar dari objek kubus
 */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
	}
	
	public double hitungLuasAlas(){
		double luasAlas = permukaan.hitungLuas();
		return luasAlas;
	}
}