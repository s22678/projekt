package main.java.ship;

import java.io.FileWriter;
import java.io.IOException;

import main.java.container.Container;

public class ContainerShip {

    String name;

    Bay[] bays = new Bay[100];

    String manifestFilePath = "C:\\manifest.txt";
    FileWriter fWriter = null;

    public ContainerShip(String name) {
        this.name = name;
        for(int i = 0; i < bays.length; i++) {
            bays[i] = new Bay(Integer.toString(i));
        }
    }

    public void sortedBaysByWeight(Bay[] bays) {
        for (int i = 0; i < bays.length; i++) {  
            for (int j = i + 1; j < bays.length; j++) {
                if (bays[i].getBayWeight() > bays[j].getBayWeight()) {
                    Bay tmp = bays[i];
                    bays[i] = bays[j];
                    bays[j] = tmp;
                }
            }
        }
    }

    public void loadBay(Container container, int number) throws IOException {
        
        bays[0].loadContainerToBlock(container);

        fWriter = new FileWriter(manifestFilePath, true);
        fWriter.write("Number: " + number + ", position: " + bays[0].getPosX() + " " + bays[0].getPosY() + ", weight: " + container.getTotalStringWeight() + ", cargo: " + container.getCargo() + "\n");
        fWriter.flush();
        if(fWriter != null) {
            fWriter.close();
        }
        this.sortedBaysByWeight(bays);
    }
}