package latihanVeryEasy;

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        // ak47.setPeluru(5);

        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 menembak ");
        ak47.menembak();
        System.out.println("Sisa Peluru: " + ak47.getPeluru());
    }
}
