package main.java.ship;

import main.java.container.Container;

public class ContainerBlock {

    int twentyBlockFront;
    int twentyBlockBack;
    int fortyBlock;
    int weight;
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
        if(posY > 18) isBelowDeck = false;
    }

    public void loadContainer(Container container) {
        if (container.getName().contains("40")) {
            this.setWeight(container.getTotalWeight());
            isFrontLoaded = true;
            isBackLoaded = true;
        }
        if(container.getName().contains("20")) {
            
        }
    }

    public void setWeight(int weight) {

    }

    public boolean is40SpaceAvailable() {
        return isFrontLoaded & isBackLoaded;
    }

    public boolean is20SpaceAvailable() {
        return isFrontLoaded | isBackLoaded;
    }
    
}
