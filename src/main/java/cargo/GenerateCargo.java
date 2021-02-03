package main.java.cargo;

import java.io.FileWriter;
import java.io.IOException;

import main.java.container.Container;
import main.java.container.ControlledAtmosphere;
import main.java.container.Reefer;

public class GenerateCargo {

    final int numberOfContainers;
    Reefer[] reefer;
    ControlledAtmosphere[] ca;

    String filePath = "C:\\Users\\10675543\\Documents\\workspace\\projekt\\myfile.txt";
    FileWriter fWriter = null;
    

    public GenerateCargo(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    public void createCargo(String[] nameAttributes, String[] cargoAttributes, int[] tareAttributes, int[] maxCargoWeightAttributes, Reefer[] reefer) {
        
        try {
            for(int i = 0; i < numberOfContainers; i++) {
                int randVal = (int) ((Math.random() * (100 - 1)) + 1);
                String containerName = nameAttributes[randVal%nameAttributes.length];
                String containerCargo;
                if(containerName == "45' super freezer") {
                    containerCargo = Reefer.superFreezerCargoAttributes[((int) ((Math.random() * 2)))%Reefer.superFreezerCargoAttributes.length];
                } else {
                    containerCargo = cargoAttributes[randVal%cargoAttributes.length];
                }
                int containerTareWeight = tareAttributes[randVal%tareAttributes.length];
                int containerCargoWeight = maxCargoWeightAttributes[randVal%maxCargoWeightAttributes.length]*randVal/100;
                reefer[i] = new Reefer(containerName, containerCargo, containerTareWeight, containerCargoWeight);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void createCargo(String[] nameAttributes, String[] cargoAttributes, int[] tareAttributes, int[] maxCargoWeightAttributes, int oxygenAttributes, int carbonDioxideAttributes, int temperature, ControlledAtmosphere[] ca) {
        
        try {
            for(int i = 0; i < numberOfContainers; i++) {
                int randVal = (int) ((Math.random() * (100 - 1)) + 2);
                String containerName = nameAttributes[randVal%nameAttributes.length];
                String containerCargo = cargoAttributes[randVal%cargoAttributes.length];
                int containerTareWeight = tareAttributes[randVal%tareAttributes.length];
                int containerCargoWeight = maxCargoWeightAttributes[randVal%maxCargoWeightAttributes.length]*randVal/100;
                int containerOxygenContent = randVal/10+oxygenAttributes;
                int containerCarbonDioxideContent = randVal/15+carbonDioxideAttributes;
                int containerTemperature = randVal/20+temperature;
                // System.out.println("rand: " + randVal + " oxy: " + containerOxygenContent + " carbon: " + containerCarbonDioxideContent + " temp: " + containerTemperature);
                ca[i] = new ControlledAtmosphere(containerName, containerCargo, containerTareWeight, containerCargoWeight, containerTemperature, containerOxygenContent, containerCarbonDioxideContent);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
