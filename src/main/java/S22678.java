package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import main.java.cargo.GenerateCargo;
import main.java.container.BulkLining;
import main.java.container.ControlledAtmosphere;
import main.java.container.DryBulk;
import main.java.container.Reefer;
import main.java.container.Insulated;
import main.java.container.Tank;
import main.java.ship.ContainerBlock;
import main.java.ship.ContainerShip;
import main.java.container.Container;

public class S22678 {

    static String[] cargoData;
    public static void main(String [] args) throws Exception {

        final int REEFER_NUMBER = 0;
        final int CA_NUMBER = 1;
        final int INSULATED_NUMBER = 2;
        final int BULK_LINING_NUMBER = 3;
        final int TANKER_NUMBER = 4;
        final int DRY_BULK_NUMBER = 5;

        int[] cargoTypeNumber = new int[6];
        int cargoTypeSize = 0;

        for(int i =0; i < 5; i++) {
            cargoTypeNumber[i] = ((int) ((Math.random() * (3000 - 2000)) + 2000));
            cargoTypeSize += cargoTypeNumber[i];
            System.out.println("cargoTypeNumber[" + i + "] " + cargoTypeNumber[i] + " cargoTypeSize " + cargoTypeSize);
        }
        cargoTypeNumber[5] = 15000 - cargoTypeSize;
        cargoTypeSize += cargoTypeNumber[5];
        System.out.println("cargoTypeNumber[" + 5 + "] " + cargoTypeNumber[5] + " cargoTypeSize " + cargoTypeSize);

        GenerateCargo reefers = new GenerateCargo(cargoTypeNumber[REEFER_NUMBER]);
        Reefer[] reefer = new Reefer[cargoTypeNumber[REEFER_NUMBER]];
        reefers.createCargo(Reefer.nameAttributes, Reefer.cargoAttributes, Reefer.tareAttributes, Reefer.maxCargoWeightAttributes, reefer);

        GenerateCargo cas = new GenerateCargo(cargoTypeNumber[CA_NUMBER]);
        ControlledAtmosphere[] ca = new ControlledAtmosphere[cargoTypeNumber[CA_NUMBER]];
        cas.createCargo(ControlledAtmosphere.nameAttributes, ControlledAtmosphere.cargoAttributes, ControlledAtmosphere.tareAttributes, ControlledAtmosphere.maxCargoWeightAttributes, ControlledAtmosphere.oxygenAttributes, ControlledAtmosphere.carbonDioxideAttributes, ControlledAtmosphere.temperatureAttributes, ca);

        GenerateCargo insulatedContainers = new GenerateCargo(cargoTypeNumber[INSULATED_NUMBER]);
        Insulated[] insulated = new Insulated[cargoTypeNumber[INSULATED_NUMBER]];
        insulatedContainers.createCargo(Insulated.nameAttributes, Insulated.cargoAttributes, Insulated.tareWeightAttributes, Insulated.maxNetLoadAttributes, Insulated.thermalConductivityAttributes, insulated);

        GenerateCargo bulkLiningContainers = new GenerateCargo(cargoTypeNumber[BULK_LINING_NUMBER]);
        BulkLining[] bulk = new BulkLining[cargoTypeNumber[BULK_LINING_NUMBER]];
        bulkLiningContainers.createCargo(BulkLining.nameAttributes, BulkLining.cargoAttributes, BulkLining.tareWeightAttributes, BulkLining.maxNetLoadAttributes, BulkLining.loadingSolutionAttributes, bulk);

        GenerateCargo tankers = new GenerateCargo(cargoTypeNumber[TANKER_NUMBER]);
        Tank[] tank = new Tank[cargoTypeNumber[TANKER_NUMBER]];
        tankers.createCargo(Tank.nameAttributes, Tank.cargoAttributes, Tank.tareWeightAttributes, Tank.maxNetLoadAttributes, tank);

        GenerateCargo dryBulkContainers = new GenerateCargo(cargoTypeNumber[DRY_BULK_NUMBER]);
        DryBulk[] dryBulk = new DryBulk[cargoTypeNumber[DRY_BULK_NUMBER]];
        dryBulkContainers.createCargo(DryBulk.nameAttributes, DryBulk.cargoTypeAttributes, DryBulk.tareWeightAttributes, DryBulk.maxNetLoadAttributes, DryBulk.cargoAttributes, dryBulk);

        Container[][] allContainers = {reefer, ca, insulated, bulk, tank, dryBulk};
        
        for(int i = 0; i < allContainers.length; i++) {
            S22678.writeToFile(allContainers[i], true);   
        }

        cargoData = S22678.readFromFile();
        Container[] containers = new Container[cargoData.length];
        ContainerShip containerShip = new ContainerShip("Maersk");
        
        for(int i = 0; i < cargoData.length; i++) {
            containers[i] = new Container(cargoData[i].split(",")[0],  cargoData[i].split(",")[1].split(" ")[2], cargoData[i].split(": ")[1]);
            containerShip.loadBay(containers[i], i);
            //System.out.println(cargoData[i].split(": ")[1]);
            // System.out.print("Container number: " + (i+1) + " Name: " + cargoData[i].split(",")[0] + ", cargo: " + cargoData[i].split(",")[1].split(" ")[2] + ", total weight " + cargoData[i].split(": ")[1]);
            // System.out.println();
        }
    }

    public static String[] readFromFile() {
        
        String[] cargoData = new String[15000];
        BufferedReader reader;
        int i = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\myfile.txt"));
            String line = reader.readLine();
            while(line != null) {
                cargoData[i] = line;
                i++;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cargoData;
    }

    public static void writeToFile(Container[] arr, boolean append) throws IOException {
        String filePath = "C:\\myfile.txt";
        FileWriter fWriter = null;

        fWriter = new FileWriter(filePath, append);
        for(int i = 0; i < arr.length; i++) {
            fWriter.write(arr[i].toString() + "\n");
            fWriter.flush();
        }

        if(fWriter != null) {
            fWriter.close();
        }
    }
}
