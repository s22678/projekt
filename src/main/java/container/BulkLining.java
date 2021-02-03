package main.java.container;

public class BulkLining extends Container {
    
    public String loadingSolution;

    public static String[] nameAttributes = {"20' containertip", "20' flex top", "20' open top"};
    public static String[] cargoAttributes = {"grain", "salt", "sand", "ore", "coal"};
    public static int[] tareWeightAttributes = {3550, 3560, 3130};
    public static int[] maxNetLoadAttributes = {28000, 28000, 28055};
    public static String[] loadingSolutionAttributes = {"lid", "rectractable lid", "open top"};

    public BulkLining(String name, String cargo, int tareWeight, int maxNetLoad, String loadingSolution) {
        super(name, cargo, tareWeight, maxNetLoad);
        this.loadingSolution = loadingSolution;
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

    public String getLoadingSolution() {
        return loadingSolution;
    }

    public int getTotalWeight() {
        return tareWeight + maxNetLoad;
    }

    @Override
    public String toString() {
        return " Name " + this.getName() + " cargo " + this.getCargo() + " tare weight " + this.getTareWeight() + " maximum net load " + this.getMaxNetLoad() + " loading solution " + getLoadingSolution() + " total weight " + getTotalWeight();
    }
}
