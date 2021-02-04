package main.java.container;

public class Container {
    
    public String name, cargo;
    public int tareWeight, maxNetLoad;

    public Container(String name, String cargo, int tareWeight, int maxNetLoad) {
        this.name = name;
        this.cargo = cargo;
        this.tareWeight = tareWeight;
        this.maxNetLoad = maxNetLoad;
    }

    public String getName() {
        return name;
    }

    public int getTotalWeight() {
        return tareWeight + maxNetLoad;
    }
}