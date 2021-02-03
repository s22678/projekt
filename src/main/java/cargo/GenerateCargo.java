package main.java.cargo;

import java.io.FileWriter;
import java.io.IOException;

import main.java.container.BulkLining;
import main.java.container.Container;
import main.java.container.ControlledAtmosphere;
import main.java.container.DryBulk;
import main.java.container.Insulated;
import main.java.container.Reefer;
import main.java.container.Tank;

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
                int randVal = (int) ((Math.random() * (100 - 1)) + 1);
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

    public void createCargo(String[] nameAttributes, String[] cargoAttributes, int[] tareAttributes, int[] maxCargoWeightAttributes, double[] thermalConductivityAttributes, Insulated[] insulated) {
        
        try {
            for(int i = 0; i < numberOfContainers; i++) {
                int randVal = (int) ((Math.random() * (100 - 1)) + 1);
                String containerName = nameAttributes[randVal%nameAttributes.length];
                String containerCargo = cargoAttributes[randVal%cargoAttributes.length];
                int containerTareWeight = tareAttributes[randVal%tareAttributes.length];
                int containerCargoWeight = maxCargoWeightAttributes[randVal%maxCargoWeightAttributes.length]*randVal/100;
                double containerThermalConductivity = thermalConductivityAttributes[randVal%thermalConductivityAttributes.length];
                // System.out.println("rand: " + randVal + " oxy: " + containerOxygenContent + " carbon: " + containerCarbonDioxideContent + " temp: " + containerTemperature);
                insulated[i] = new Insulated(containerName, containerCargo, containerTareWeight, containerCargoWeight, containerThermalConductivity);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void createCargo(String[] nameAttributes, String[] cargoAttributes, int[] tareAttributes, int[] maxCargoWeightAttributes, String[] loadingSolutionAttributes, BulkLining[] bulkLining) {
        
        try {
            for(int i = 0; i < numberOfContainers; i++) {
                int randVal = (int) ((Math.random() * (100 - 1)) + 1);
                String containerName = nameAttributes[randVal%nameAttributes.length];
                String containerCargo = cargoAttributes[randVal%cargoAttributes.length];
                int containerTareWeight = tareAttributes[randVal%tareAttributes.length];
                int containerCargoWeight = maxCargoWeightAttributes[randVal%maxCargoWeightAttributes.length]*randVal/100;
                String cargoLoadingSolution = loadingSolutionAttributes[randVal%loadingSolutionAttributes.length];
                // System.out.println("rand: " + randVal + " oxy: " + containerOxygenContent + " carbon: " + containerCarbonDioxideContent + " temp: " + containerTemperature);
                bulkLining[i] = new BulkLining(containerName, containerCargo, containerTareWeight, containerCargoWeight, cargoLoadingSolution);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void createCargo(String[] nameAttributes, String[] cargoAttributes, int[] tareAttributes, int[] maxCargoWeightAttributes, Tank[] tank) {
        
        try {
            for(int i = 0; i < numberOfContainers; i++) {
                int randVal = (int) ((Math.random() * (100 - 1)) + 1);
                String containerName = nameAttributes[randVal%nameAttributes.length];
                String containerCargo = cargoAttributes[randVal%cargoAttributes.length];
                int containerTareWeight = tareAttributes[randVal%tareAttributes.length];
                int containerCargoWeight = maxCargoWeightAttributes[randVal%maxCargoWeightAttributes.length]*randVal/100;
                // System.out.println("rand: " + randVal + " oxy: " + containerOxygenContent + " carbon: " + containerCarbonDioxideContent + " temp: " + containerTemperature);
                tank[i] = new Tank(containerName, containerCargo, containerTareWeight, containerCargoWeight);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void createCargo(String[] nameAttributes, String[] cargoTypeAttributes, int[] tareAttributes, int[] maxCargoWeightAttributes, String[][] cargoAttributes, DryBulk[] dryBulk) {
        
        try {
            for(int i = 0; i < numberOfContainers; i++) {
                int randVal = (int) ((Math.random() * (100 - 1)) + 1);
                String containerName = nameAttributes[randVal%nameAttributes.length];
                String containerCargo;
                String containerCargoType;
                switch (containerName) {
                    case "20' standard":
                    case "40' standard":
                    case "40' high cube":
                    case "45' high cube":
                        containerCargo = cargoAttributes[0][((int) ((Math.random() * cargoAttributes[0].length)))%cargoAttributes[0].length];
                        containerCargoType = cargoTypeAttributes[0];
                        break;
                    case "20' open top":
                    case "40' open top":
                    case "40' open top high cube":
                        containerCargo = cargoAttributes[1][((int) ((Math.random() * cargoAttributes[1].length)))%cargoAttributes[1].length];
                        containerCargoType = cargoTypeAttributes[1];
                        break;
                    case "20' flatrack":
                    case "40' flatrack":
                        containerCargo = cargoAttributes[2][((int) ((Math.random() * cargoAttributes[2].length)))%cargoAttributes[2].length];
                        containerCargoType = cargoTypeAttributes[2];
                        break;
                    default:
                        containerCargo = "iPhones";
                        containerCargoType = "dry bulk";
                }
                int containerTareWeight = tareAttributes[randVal%tareAttributes.length];
                int containerCargoWeight = maxCargoWeightAttributes[randVal%maxCargoWeightAttributes.length]*randVal/100;
                dryBulk[i] = new DryBulk(containerName, containerCargoType, containerTareWeight, containerCargoWeight, containerCargo);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
