package main.java.ship;

import main.java.container.Container;

public class ContainerBlock {

    int twentyBlockFront;
    int twentyBlockBack;
    int fortyBlock;
    int weight;
    int weightFront;
    int weightBack;
    boolean isFrontLoaded;
    boolean isBackLoaded;

    boolean isBelowDeck;

    int posX;
    int posY;

    public ContainerBlock(int posX, int posY) {
        weight = 0;
        this.posX = posX;
        this.posY = posY;
        isFrontLoaded = false;
        isBackLoaded = false;
        if(posY > 4) isBelowDeck = false;
        this.weightFront = 0;
        this.weightBack = 0;
    }

    public void loadContainer(Container container) {
        if (container.getName().contains("40")) {
            this.setWeight(container.getTotalWeight());
            isFrontLoaded = true;
            isBackLoaded = true;
        }
        if (container.getName().contains("45")) {
            this.setWeight(container.getTotalWeight());
            isFrontLoaded = true;
            isBackLoaded = true;
        }
        if(container.getName().contains("20")) {
            if(!isBackLoaded) {
                isBackLoaded = true;
                this.setWeightBack(container.getTotalWeight());
            } else {
                isFrontLoaded = true;
                this.setWeightFront(container.getTotalWeight());
            }
        }
    }

    public void setWeightFront(int weight) {
        this.weightFront = weight;
    }

    public void setWeightBack(int weight) {
        this.weightBack = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weightBack + weightFront;
    }

    public boolean is40SpaceAvailable() {
        return (!isFrontLoaded) & (!isBackLoaded);
    }

    public boolean is20SpaceAvailable() {
        return isFrontLoaded | isBackLoaded;
    }

    public boolean isFull() {
        return this.is40SpaceAvailable();
    }

    public boolean isBelowDeck() {
        return isBelowDeck;
    }
    
}
