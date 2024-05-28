import java.util.ArrayList;
import java.util.Collection;

public class ArmadaKendaraan {
    private ArrayList<Vehicle> allArmada;

    public ArmadaKendaraan() {
        this.allArmada = new ArrayList<>();
    }

    public void tambahArmada(Collection<? extends Vehicle> armada) {
        allArmada.addAll(armada);
    }

    public ArrayList<Vehicle> getAllArmada() {
        return new ArrayList<>(allArmada);
    }
}
