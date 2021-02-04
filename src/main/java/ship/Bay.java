package main.java.ship;

import main.java.container.Container;

public class Bay {

    String cargoName;

    String posX;
    String posY;

    int weight = 0;

    ContainerBlock[][] block = new ContainerBlock[10][10];

    public Bay(String cargoName) {
        this.cargoName = cargoName;

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                block[i][j] = new ContainerBlock(i, j);
            }
        }
    }

    public int getBayWeight() {
        
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                weight = block[i][j].getWeight();
            }
        }
        return weight;
    }

    public void sortContainerBlocksByWeight(ContainerBlock [][] containerBlock){
        
        for (int row = 0; row <containerBlock.length-1 ; row++) {
            for (int col = 0; col <containerBlock[row].length ; col++) {
                placeCurrentElementAtCorrectPosition(containerBlock, row, col, row+1);
            }
        }
    }

    public void placeCurrentElementAtCorrectPosition(ContainerBlock [][] containerBlock, int curRow, int curCol, int rowIndex){
        
        ContainerBlock containerBlockMin = containerBlock[curRow][curCol];
        int min = containerBlock[curRow][curCol].getWeight();
        int minRow = curRow;
        for (int i = rowIndex; i <containerBlock.length ; i++) {
            if(min>containerBlock[i][0].getWeight()){
                min = containerBlock[i][0].getWeight();
                containerBlockMin = containerBlock[curRow][curCol];
                minRow = i;
            }
        }

        if(curRow!=minRow){
            ContainerBlock containerBlockTmp = containerBlock[curRow][curCol];
            containerBlock[curRow][curCol] = containerBlock[minRow][0];
            containerBlock[minRow][0] = containerBlockTmp;
            reorderContainerBays(containerBlock, minRow);
        }
    }

    public void reorderContainerBays(ContainerBlock [][] containerBlock, int row){
        
        for (int col = 0; col <containerBlock[row].length-1 ; col++) {
            if(containerBlock[row][col].getWeight()>containerBlock[row][col+1].getWeight()) {
                ContainerBlock containerBlockTmp = containerBlock[row][col];
                containerBlock[row][col] = containerBlock[row][col+1];
                containerBlock[row][col+1] = containerBlockTmp;
            }else{
                break;
            }
        }
    }

    public boolean loadContainerToBlock(Container container) {

        boolean isLoaded = false;
        if(container.getName().contains("40")){
            System.out.println("contains 40");
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    if(block[i][j].is40SpaceAvailable()){
                        System.out.println("40 available " + "i " + i + " j " + j);
                        block[i][j].loadContainer(container);
                        setPosX(i);
                        setPosY(j);
                        return true;
                    } else {
                        continue;
                    }
                }
            }
        }

        if(container.getName().contains("45")){
            System.out.println("contains 45");
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    if(block[i][j].is40SpaceAvailable()){
                        System.out.println("45 available " + "i " + i + " j " + j);
                        block[i][j].loadContainer(container);
                        setPosX(i);
                        setPosY(j);
                        return true;
                    } else {
                        continue;
                    }
                }
            }
        }

        if(container.getName().contains("20")){
            System.out.println("contains 20");
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    if(block[i][j].is20SpaceAvailable()){
                        System.out.println("20 available " + "i " + i + " j " + j);
                        block[i][j].loadContainer(container);
                        setPosX(i);
                        setPosY(j);
                        return true;
                    } else {
                        continue;
                    }
                }
            }
        }
        return isLoaded;
    }

    public void setPosX(int n) {
        this.posX = Integer.toString(n);
    }

    public void setPosY(int n) {
        this.posY = Integer.toString(n);
    }

    public String getPosX() {
        return posX;
    }

    public String getPosY() {
        return posY;
    }

    public String getCargoName() {
        return cargoName;
    }
}
