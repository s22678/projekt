package main.java.container;

public class BulkLining extends Container {
    
    public String loadingSolution;

    public BulkLining(String name, int tareWeight, int maxNetLoad, String cargo, String loadingSolution) {
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

    @Override
    public String toString() {
        return "Name " + this.getName() + " cargo " + this.getCargo() + " tare weight " + this.getTareWeight() + " maximum net load " + this.getMaxNetLoad() + " loading solution " + getLoadingSolution();
    }
}
