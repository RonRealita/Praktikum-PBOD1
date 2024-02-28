public class MOperasiTitik {
    public static void main(String args[]){
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(3);
        t2.setAbsis(4);
        t2.setOrdinat(5);
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat()+")");
        t1.getRefleksiX();
        t1.getRefleksiY();
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        t1.refleksiX(t1);
        t1.refleksiY(t1);
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("Jarak =" + " " + t1.getJarakPusat());
    }
}