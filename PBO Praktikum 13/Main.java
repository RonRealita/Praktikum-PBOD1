import java.util.*;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(1000);
        System.out.println(truck);
        
        SeaPlane sPlane = new SeaPlane(500);
        System.out.println(sPlane);
        
        Helicopter copter = new Helicopter(200);
        Helicopter copter1 = new Helicopter(200);
        System.out.println(copter);
        
        System.out.println("############################################");
        
        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();
        
        // Menambahkan kendaraan ke kelompok armada yang sesuai
        armadaTruck.add(truck);
        armadaTruck.add(new Truck(1000));
        armadaTruck.add(new Truck(1000));
        
        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());
        
        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());
        
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());
        
        System.out.println("############################################");
        
        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();
        
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
        
        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
        
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
    }
}
