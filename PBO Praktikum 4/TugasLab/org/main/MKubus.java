 /**
 * File : MKubus.java 13/03/2024
 * Penulis : Rona Realita Najma (24060122140124)
 * Deskripsi : driver class untuk kubus
 */

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
  public static void main(String[] args){
    Kubus kubus = new Kubus(new BujurSangkar(4, 4));
    SegiTiga segiTiga = new SegiTiga(9, 12, 3);
	
	System.out.println("\n");

    double luasAlas = kubus.hitungLuasAlas();
    System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : " + luasAlas);
	
    double volumeKubus = kubus.hitungVolume();
    System.out.println("Volume Kubus dengan panjang sisi 4 satuan : " + volumeKubus);

    double luasSegitiga = segiTiga.hitungLuas();
    System.out.println("Luas Segitiga dengan panjang alas 9 satuan dan tinggi 12 satuan : " + luasSegitiga);

	}
}