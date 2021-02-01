package main.java;

import java.io.FileWriter;
import java.io.IOException;

import main.java.container.BulkLining;
import main.java.container.Container;

public class S22678 {
    public static void main(String [] args) throws Exception {
        System.out.println("Hello world");
        String filePath = "C:\\Users\\10675543\\Documents\\workspace\\projekt\\myfile.txt";
        int number = 12345;
        FileWriter fWriter = null;

        final int CARGO_UNITS = 15000;

        Container[] containers = new Container[15000];
        for(int i = 0; i < containers.length; i++) {
            BulkLining bulkLining = new BulkLining("20' containertip", 3550, 28000, "grain", "lid");
            containers[i] = bulkLining;
        }

        try {
            fWriter = new FileWriter(filePath);
            for(int i = 0; i < containers.length; i++) {
                fWriter.write(i + " " + containers[i].toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fWriter != null) {
                fWriter.close();
            }
        }
    }
}
