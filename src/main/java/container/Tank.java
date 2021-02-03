package main.java.container;

public class Tank extends Container {
    
    int capacity;

    public static String[] nameAttributes = {"20' T1", "40' T1", "20' T4", "20' T11", "20' T14", "20' T50", "20' T75"};
    public static String[] cargoAttributes = {"grain", "salt", "sand", "ore", "coal"};
    public static int[] tareWeightAttributes = {3600, 6200, 11315, 3500, 3500, 4500, 11600};
    public static int[] maxNetLoadAttributes = {32400, 43600, 23685, 30500, 30500, 29500, 22400};

    public Tank(String name, String cargo, int tareWeight, int maxNetLoad) {
        super(name, cargo, tareWeight, maxNetLoad);

        switch (name) {
            case "20' T1":
                capacity = 25000;
                break;
            case "40' T1":
                capacity = 44500;
                break;
            case "20' T4":
                capacity = 20000;
                break;
            case "20' T11":
                capacity = 26000;
                break;
            case "20' T14":
                capacity = 26000;
                break;
            case "20' T50":
                capacity = 24500;
                break;
            case "20' T75":
                capacity = 20000;
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

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return maxNetLoad + tareWeight;
    }

    @Override
    public String toString() {
        return " Name " + this.getName() + " cargo " + this.getCargo() + " tare weight " + this.getTareWeight() + " maximum net load " + this.getMaxNetLoad() + " capacity " + getCapacity() + " total weight " + getTotalWeight();
    }
}
