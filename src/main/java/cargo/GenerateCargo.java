package main.java.cargo;

import main.java.container.Container;
import main.java.container.ControlledAtmosphere;
import main.java.container.Reefer;

public class GenerateCargo {

    final int numberOfContainers;
    Reefer[] reefer;
    ControlledAtmosphere[] ca;
    

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

    public void createCargo(String[] nameAttributes, String[] cargoAttributes, int[] tareAttributes, int[] maxCargoWeightAttributes, ControlledAtmosphere[] ca) {
        
        try {
            for(int i = 0; i < numberOfContainers; i++) {
                int randVal = (int) ((Math.random() * (100 - 1)) + 1);
                String containerName = nameAttributes[randVal%nameAttributes.length];
                String containerCargo = cargoAttributes[randVal%cargoAttributes.length];
                int containerTareWeight = tareAttributes[randVal%tareAttributes.length];
                int containerCargoWeight = maxCargoWeightAttributes[randVal%maxCargoWeightAttributes.length]*randVal/100;
                int containerOxygenContent = randVal*15/100;
                int containerCarbonDioxideContent = randVal*7/100;
                int containerTemperature = randVal*5/100;
                ca[i] = new ControlledAtmosphere(containerName, containerCargo, containerTareWeight, containerCargoWeight, containerTemperature, containerOxygenContent, containerCarbonDioxideContent);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
