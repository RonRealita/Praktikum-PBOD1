package latihanMedium;

public class KontrolSenjata{
    private Senjata senjata;
    private int jumlahPeluru;
    
    public KontrolSenjata (Senjata senjata){
        this.senjata = senjata;
        this.jumlahPeluru = 0;
    }
    
    public boolean isAdaPeluru() {
        if (jumlahPeluru <= 0) {
            System.out.println("Peluru Habis");
            return false;
        }
        return true;
    }
    
    public void isiPeluru(int newJumlahPeluru){
        jumlahPeluru = jumlahPeluru + newJumlahPeluru; 
        senjata.setPeluru(jumlahPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()){
            if (jumlahPeluru < jumlah){
                for (int i = 0; i < jumlahPeluru; i++){
                    System.out.println(senjata.getBunyi() + " ");
                }
                for (int i = 0; i < jumlah - jumlahPeluru; i++){
                    System.out.println("Gagal tembak, Peluru Habis");
                }
                jumlahPeluru = 0;
                System.out.println(">> Peluru sisa: " + jumlahPeluru);
            }
            else{
                for (int i = 0; i < jumlah; i++){
                    System.out.println(senjata.getBunyi() + " ");
                }
                jumlahPeluru -= jumlah;
                System.out.println(">> Peluru sisa: " + jumlahPeluru);
            }
        }
        System.out.println(" ");
    }

    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb!";
        }
        else{
            return "Gagal, belum pasang bayonet";
        }
    }

    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}