public class MGaris {
    public static void main(String args[]){
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3 = new Titik();
        Titik t4 = new Titik();
        t1.setAbsis(6);
        t1.setOrdinat(2);
        t2.setAbsis(4);
        t2.setOrdinat(-8);
        t3.setAbsis(-7);
        t3.setOrdinat(-2);
        t4.setAbsis(6);
        t4.setOrdinat(-3);
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat()+")");
        Garis g1 = new Garis(t1,t2);
        Garis g2 = new Garis(t3,t4);
        System.out.println(g1.isTegakLurus(g2));
        System.out.println("panjang garis = " + g1.getPanjang());
        System.out.println("gradien = " + g1.getGradien());
    }
}