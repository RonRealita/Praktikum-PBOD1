




public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        else{
            System.out.println("Angka "+angka+" bukan angka sial");
        }
    }

    public static void main(String[] args){
        AngkaSial angkasial = new AngkaSial();
        try{
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        }
        catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}

//Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? baris 12 pada AngkaSial.java tidak dieksekusi karena masukan angka == 14 yang mana baris 12 akan dieksekusi ketika panjang 2 meter taoii tanganyya , juuga pacarmu