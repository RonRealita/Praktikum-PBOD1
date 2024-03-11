/* Nama : Rona Realita Najma */
/* NIM : 24060122140124 */
/* Hari, Tanggal : Rabu, 6 Maret 2024 */




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
        }catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}

//Ketika eksepsi terjadi, baris 12 tidak dieksekusi karena ketika cobaAngka(13) dipanggil dalam blok try-catch pada main, akan melemparkan sebuah AngkaSialException. Oleh karena itu, program tidak akan melanjutkan eksekusi di luar blok try-catch.

//Baris 21 akan dieksekusi karena setelah penanganan eksepsi pada baris 19, eksekusi program akan melanjutkan ke baris berikutnya, yaitu baris 21. Oleh karena itu, setelah pesan dari AngkaSialException dicetak pada baris 19 program akan mengeluarkan pesan "hati-hati memasukkan angka".