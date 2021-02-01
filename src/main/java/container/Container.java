package main.java.container;

public abstract class Container {
    
    protected String name, cargo;
    protected int tareWeight, maxNetLoad;

    protected Container(String name, String cargo, int tareWeight, int maxNetLoad) {
        this.name = name;
        this.cargo = cargo;
        this.tareWeight = tareWeight;
        this.maxNetLoad = maxNetLoad;
    }

    abstract String getName();
    abstract String getCargo();
    abstract int getTareWeight();
    abstract int getMaxNetLoad();
}