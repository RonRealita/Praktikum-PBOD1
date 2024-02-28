public class Garis {
    Titik titikAwal, titikAkhir;
    public String panjang;
	public String getGradien;

    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public float getPanjang(){
        double absis = titikAkhir.getAbsis()-titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat()-titikAwal.getOrdinat();
        return (float) Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public double getGradien(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return ordinat/absis;  
    }

    public Garis getRefleksiY(){
        Garis hasil = new Garis(titikAwal.getRefleksiY(), titikAkhir.getRefleksiY());
        return hasil;
    }

    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien()==-1;
    }

}