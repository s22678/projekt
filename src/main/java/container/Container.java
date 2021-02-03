package main.java.container;

public class Container {
    
    protected String name, cargo;
    protected int tareWeight, maxNetLoad;

    public Container(String name, String cargo, int tareWeight, int maxNetLoad) {
        this.name = name;
        this.cargo = cargo;
        this.tareWeight = tareWeight;
        this.maxNetLoad = maxNetLoad;
    }
}