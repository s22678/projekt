package main.java.container;

public class Reefer extends Container {
    
    protected int temperature;

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
