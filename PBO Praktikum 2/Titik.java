public class Titik {
    private double x,y;
    public void setAbsis(double x){
        this.x = x;
    }

    public void setOrdinat(double y){
        this.y = y;
    }

    public double getAbsis(){
        return this.x;
    }

    public double getOrdinat(){
        return this.y;
    }

    public static void main(String args[]) {
        Titik t1 = new Titik();
        t1.x = 3;
        t1.y = 4;
        System.out.println("Titik("+ t1.x + ", " + t1.y + ")");
    }

    public double getJarakPusat(){
        return Math.sqrt((x-0)*(x-0) + (y-0)*(y-0));
    }

    public void refleksiX(Titik t1){
        t1.setOrdinat(t1.getOrdinat()*-1);
    }

    public void refleksiY(Titik t1){
        t1.setAbsis(t1.getAbsis()*-1);
    }

    public void getRefleksiX(){
        refleksiX(this);
    }

    public void getRefleksiY(){
        refleksiY(this);
    }
        


}