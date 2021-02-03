package main.java.container;

public class ControlledAtmosphere extends Reefer {
    
    int oxygenPercentage, carbonDioxidePercentage, temperature;

    public static String[] nameAttributes = {"40' CA", "45' CA"};
    public static String[] cargoAttributes = {"bananas", "oranges", "carrots", "kiwis"};
    public static int[] tareAttributes = {4330, 4700};
    public static int[] maxCargoWeightAttributes = {29670, 27650};
    public static int oxygenAttributes = 5;
    public static int carbonDioxideAttributes = 5;
    public static int temperatureAttributes = 3;

    public ControlledAtmosphere(String name, String cargo, int tareWeight, int maxNetLoad, int temperature, int oxygenPercentage, int carbonDioxidePercentage) {
        super(name, cargo, tareWeight, maxNetLoad);
        if(oxygenPercentage < 2 || oxygenPercentage > 21) throw new IllegalArgumentException("oxygen " + oxygenPercentage + " is invalid, must be set between 2 and 21");
        if(carbonDioxidePercentage < 2 || carbonDioxidePercentage > 12) throw new IllegalArgumentException("carbon dioxide " + carbonDioxidePercentage + " is invalid, must be set between 2 and 12");
        if(temperature < 0 || temperature > 8) throw new IllegalArgumentException("temp " + temperature + " is invalid, must be set between 0 and 8");
        this.oxygenPercentage = oxygenPercentage;
        this.carbonDioxidePercentage = carbonDioxidePercentage;
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

    public int getCapacity() {
        return temperature;
    }

    public int getOxygenPercentage() {
        return oxygenPercentage;
    }

    public int getCarbonDioxidePercentage() {
        return carbonDioxidePercentage;
    }

    public int getNitrogenPercentage() {
        return (100 - (carbonDioxidePercentage + oxygenPercentage));
    }

    public int getTemperature() {
        return temperature;
    }

    public int getTotalWeight() {
        return tareWeight + maxNetLoad;
    }

    @Override
    public String toString() {
        return " Name " + this.getName() + " cargo " + this.getCargo() + " tare weight " + this.getTareWeight() + " maximum net load " + this.getMaxNetLoad() + " oxygen levels " + getOxygenPercentage() + " carbon dioxide levels" + getCarbonDioxidePercentage() + " nitrogen levels " + getNitrogenPercentage() + " temperature " + getTemperature() + " total weight " + getTotalWeight();
    }
}
