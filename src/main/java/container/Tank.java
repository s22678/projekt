package main.java.container;

public class Tank extends Container {
    
    int capacity;

    public Tank(String name, String cargo, int tareWeight, int maxNetLoad, int capacity) {
        super(name, cargo, tareWeight, maxNetLoad);
        this.capacity = capacity;
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
}
