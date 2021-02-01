package main.java.container;

public class Insulated extends Container {
    
    float thermalConductivity;

    public Insulated(String name, String cargo, int tareWeight, int maxNetLoad, float thermalConductivity) {
        super(name, cargo, tareWeight, maxNetLoad);
        this.thermalConductivity = thermalConductivity;
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

    public float getThermalConductivity() {
        return thermalConductivity;
    }
}
