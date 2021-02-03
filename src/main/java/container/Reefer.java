package main.java.container;

public class Reefer extends Container {
    
    protected int temperature;
    public static String[] nameAttributes = {"20' standard", "40' standard", "40' high cube", "45' super freezer"};
    public static String[] cargoAttributes = {"food", "chemicals", "medicine"};
    public static String[] superFreezerCargoAttributes = {"frozen tuna", "vaccines"};
    public static int[] tareAttributes = {2710, 4330, 4620, 4850};
    public static int[] maxCargoWeightAttributes = {27770, 29670, 29380, 27650};

    public Reefer(String name, String cargo, int tareWeight, int maxNetLoad) {
        super(name, cargo, tareWeight, maxNetLoad);
        
        switch (cargo) {
            case "food":
                this.temperature = 5;
                break;
            case "chemicals":
                this.temperature = 0;
                break;
            case "medicine":
                this.temperature = -10;
                break;
            case "frozen tuna":
            case "vaccines":
                this.temperature = -60;
                break;
        }
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
    
    public int getTotalWeight() {
        return tareWeight + maxNetLoad;
    }

    @Override
    public String toString() {
        return " Name " + this.getName() + " cargo " + this.getCargo() + " tare weight " + this.getTareWeight() + " maximum net load " + this.getMaxNetLoad() + " temperature " + getTemperature() + " total weight " + getTotalWeight();
    }
}
