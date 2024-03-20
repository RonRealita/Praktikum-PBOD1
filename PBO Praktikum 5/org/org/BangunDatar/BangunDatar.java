public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}

//apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar maka akan mengalami error (luas cannot be resolved to a variable) karena kelas BujurSangkar akan mengimplementasikan semua metode pada kelas BangunDatar sedangkan kelas BujurSangkar tidak memiliki implementasi metode abstrak yang ada pada kelas BangunDatar