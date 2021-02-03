package main.java.container;

public class DryBulk extends Container{
    
    String cargoType;

    public static String[] nameAttributes = {"20' standard", "40' standard", "40' high cube", "45' high cube", "20' open top", "40' open top", "40' open top high cube", "20' flatrack", "40' flatrack"};
    public static String[] cargoTypeAttributes = {"dry bulk", "oversized cargo", "large items"};
    public static int[] tareWeightAttributes = {2180, 2630, 3810, 4850, 2250, 3810, 3940, 2500, 4200};
    public static int[] maxNetLoadAttributes = {28300, 28870, 28690, 27650, 30480, 26670, 32500, 21500, 40800};
    public static String[][] cargoAttributes = {{"coal","packaged goods", "electronics", "tools"},
                                                    {"tires", "prefabricated contruction elements"},
                                                    {"vehicles", "tanks"}};

    public DryBulk(String name, String cargoType, int tareWeight, int maxNetLoad, String cargo) {
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

    public int getTotalWeight() {
        return tareWeight + maxNetLoad;
    }

    @Override
    public String toString() {
        return " Name " + this.getName() + " cargo " + this.getCargo() + " tare weight " + this.getTareWeight() + " maximum net load " + this.getMaxNetLoad() + " cargo type" + getCargoType() + " total weight " + getTotalWeight();
    }
}
