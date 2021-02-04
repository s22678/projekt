package main.java.container;

public class Insulated extends Container {

    double thermalConductivity;

    public static String[] nameAttributes = {"20' standard", "40' standard", "40' high cube"};
    public static String[] cargoAttributes = {"fishing bait", "furniture", "paper goods", "electronics", "banana"};
    public static int[] tareWeightAttributes = {2200, 3801, 3900};
    public static int[] maxNetLoadAttributes = {27800, 26200, 26580};
    public static double[] thermalConductivityAttributes = {0.045, 0.036, 0.035, 0.025};

    public Insulated(String name, String cargo, int tareWeight, int maxNetLoad, double thermalConductivity) {
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

    public double getThermalConductivity() {
        return thermalConductivity;
    }

    public int getTotalWeight() {
        return tareWeight + maxNetLoad;
    }

    @Override
    public String toString() {
        return "Name " + this.getName() + ", cargo " + this.getCargo() + ", tare weight " + this.getTareWeight() + ", maximum net load " + this.getMaxNetLoad() + ", thermal conductivity " + getThermalConductivity() + ", total weight: " + getTotalWeight();
    }
}
