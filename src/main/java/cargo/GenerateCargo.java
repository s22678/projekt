package main.java.cargo;

public class GenerateCargo {

    int numberOfContainers;

    String containerName;
    String containerCargo;
    int containerTareWeight;
    int containerCargoWeight;


    public GenerateCargo(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    public void createCargoValues(String[] nameAttributes, String[] cargoAttributes, int[] containerTareWeight, int[] maxCargoWeightAttributes) {

        for(int i = 0; i < numberOfContainers; i++) {
            int randVal = (int) (Math.random() * (100));
            containerName = nameAttributes[randVal%nameAttributes.length];
            containerCargo = cargoAttributes[randVal%cargoAttributes.length];
            containerCargoWeight = maxCargoWeightAttributes[randVal%maxCargoWeightAttributes.length]*randVal/100;
            System.out.println(containerName + " " + containerCargo + " " + containerCargoWeight);
            
            //System.out.println("Name: " + names[randVal%names.length]] + " Cargo: " + randVal%attributes[1] + " Weight: " + randVal*277 + " Temperature: " + randVal%10);

        }
    }
}
