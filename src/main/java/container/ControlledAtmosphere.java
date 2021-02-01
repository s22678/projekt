package main.java.container;

public class ControlledAtmosphere extends Reefer {
    
    int oxygenPercentage, carbonDioxidePercentage;

    public ControlledAtmosphere(String name, String cargo, int tareWeight, int maxNetLoad, int temperature, int oxygenPercentage, int carbonDioxidePercentage) {
        super(name, cargo, tareWeight, maxNetLoad, temperature);
        if(oxygenPercentage < 2 || oxygenPercentage > 21) throw new IllegalArgumentException(oxygenPercentage + " is invalid, must be set between 2 and 21");
        if(carbonDioxidePercentage < 2 || carbonDioxidePercentage > 12) throw new IllegalArgumentException(oxygenPercentage + " is invalid, must be set between 2 and 21");
        this.oxygenPercentage = oxygenPercentage;
        this.carbonDioxidePercentage = carbonDioxidePercentage;
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
}
