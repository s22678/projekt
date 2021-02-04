package main.java.container;

public class Container {
    
    public String name, cargo;
    public int tareWeight, maxNetLoad;
    public int totalWeight;
    public String stringTotalWeight;

    public Container(String name, String cargo, int tareWeight, int maxNetLoad) {
        this.name = name;
        this.cargo = cargo;
        this.tareWeight = tareWeight;
        this.maxNetLoad = maxNetLoad;
    }

    public Container(String name, String cargo, String totalWeight) {
        this.name = name;
        this.cargo = cargo;
        this.stringTotalWeight = totalWeight;
    }

    public String getName() {
        return name;
    }

    public int getTotalWeight() {
        return tareWeight + maxNetLoad;
    }

    public String getCargo() {
        return cargo;
    }

    public String getTotalStringWeight() {
        return stringTotalWeight;
    }
}