package main.java;

import java.io.FileWriter;
import java.io.IOException;
import main.java.cargo.GenerateCargo;

import main.java.container.BulkLining;
import main.java.container.Container;
import main.java.container.Reefer;

public class S22678 {
    public static void main(String [] args) throws Exception {

        String[] reeferContainers = {"20' standard", "40' standard", "40' high cube", "45' super freezer"};
        String[] CAContainers = {"40' CA"};
        String[] insulatedContainers = {"20' standard", "40' standard", "40' high cube"};
        String[] bulkLiningContainers = {"20' containertip", "20' flex top", "20' open top"};
        String[] tankContainers = {"20' T1", "40' T1", "20' T4", "20' T11", "20' T14", "20' T50", "20' T75"};
        String[] dryBulkContainers = {"20' standard", "40' standard", "40' high cube", "45' high cube", "20' open top", "40' open top", "40' open top", "20' flatrack", "40' flatrack"};

        int[] cargoTypeNumber = new int[6];
        int cargoTypeSize = 0;

        for(int i =0; i < 5; i++) {
            cargoTypeNumber[i] = ((int) ((Math.random() * (3000 - 2000)) + 2000));
            System.out.println("cargoTypeNumber[" + i + "] " +cargoTypeNumber[i]);
            cargoTypeSize += cargoTypeNumber[i];
        }
        cargoTypeNumber[5] = 15000 - cargoTypeSize;
        System.out.println("cargoTypeNumber[" + 5 + "] " +cargoTypeNumber[5]);

        GenerateCargo reefers = new GenerateCargo(cargoTypeNumber[0]);
        reefers.createCargoValues(Reefer.nameAttributes, Reefer.cargoAttributes, Reefer.tareAttributes, Reefer.maxCargoWeightAttributes);


 
        String filePath = "C:\\Users\\10675543\\Documents\\workspace\\projekt\\myfile.txt";
        FileWriter fWriter = null;

        // GenerateCargo cargo = new GenerateCargo();
        // cargo.printCargo();
        // cargo.generateRandomCargo(cargo.createReefers());

        //generate number of each container
        //for(int i =0; i < 5; i++) {
        //    cargoTypeNumber[i] = ((int) ((Math.random() * (3000 - 2000)) + 2000));
        //    System.out.println("cargoTypeNumber[" + i + "] " +cargoTypeNumber[i]);
        //    cargoValue += cargoTypeNumber[i];
        //}
        //cargoTypeNumber[5] = 15000 - cargoValue;
        //System.out.println("cargoTypeNumber[" + 5 + "] " +cargoTypeNumber[5]);
        //System.out.println("cargoValue: " + cargoValue);
        //System.out.println("final value: " + (cargoValue+cargoTypeNumber[5]));

        //Container[] containers = new Container[15000];
        //for(int i = 0; i < containers.length; i++) {
        //    BulkLining bulkLining = new BulkLining("20' containertip", 3550, 28000, "grain", "lid");
        //    containers[i] = bulkLining;
        //}
//
        //try {
        //    fWriter = new FileWriter(filePath);
        //    for(int i = 0; i < containers.length; i++) {
        //        fWriter.write(i + " " + containers[i].toString() + "\n");
        //    }
        //} catch (IOException e) {
        //    e.printStackTrace();
        //} finally {
        //    if(fWriter != null) {
        //        fWriter.close();
        //    }
        //}
    }
}
