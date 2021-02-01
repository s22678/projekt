package main.java.container;

public class DryBulk extends Container{
    
    String cargoType;

    public DryBulk(String name, String cargo, int tareWeight, int maxNetLoad, String cargoType) {
        super(name, cargo, tareWeight, maxNetLoad);
        this.cargoType = cargoType;
    }

    public String getName() {
        return name;
    }

    public String getCargo() {
        return cargo;
    }

    public int getTareWeight() {
        return tareWeight;
    }

    public int getMaxNetLoad() {
        return maxNetLoad;
    }

    public String getCargoType() {
        return cargoType;
    }
}
