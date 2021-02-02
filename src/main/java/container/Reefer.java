package main.java.container;

public class Reefer extends Container {
    
    protected int temperature;
    public static String[] nameAttributes = {"20' standard", "40' standard", "40' high cube", "45' super freezer"};
    public static String[] cargoAttributes = {"food", "chemicals", "medicine"};
    public static int[] tareAttributes = {2710, 4330, 4620, 4850};
    public static int[] maxCargoWeightAttributes = {27770, 29670, 29380, 27650};

    public Reefer(String name, String cargo, int tareWeight, int maxNetLoad, int temperature) {
        super(name, cargo, tareWeight, maxNetLoad);
        this.temperature = temperature;
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

    public int getTemperature() {
        return temperature;
    }
}
