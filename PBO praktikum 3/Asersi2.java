class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0): "jari-jari tidak boleh nol";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling li8ngkaran = "+kelilingLingkaran);
    }
}

//program tersebut kurang tepat karena pada message seharusnya jari-jari tidak boleh kurang dari sama dengan 0
//program tersebut akan mengeluarkan "jari-jari tidak boleh nol" jika jari-jari<=0, jika jari-jari>0 maka akan melanjutkan progam dan mencetak keliling lingkaran