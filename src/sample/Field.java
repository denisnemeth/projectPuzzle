package sample;

import java.util.Random;

public class Field {

    private Tile[][] arr;

    public Field() {initField();}
    public Tile[][] getArr() {return arr;}
    public void setArr(Tile[][] arr) {this.arr = arr;}
    public void initField() {
        arr = new Tile[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = new Tile();
            }
        }
        arr[3][3].setValue(false);
    }
    public boolean isWinner() {
        if (arr[3][3].isValue()) return false;
        else return true;
    }
    public void switchTiles(int code) {
        int x = (code-1)%arr.length, y = (code-1)/arr.length;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if ((x+i >= 0 && x+i < arr.length) && (y+j >= 0 && y+j < arr.length) && !(i == 0 && j == 0) && !arr[x][y].isValue()) {
                    arr[x+i][y+j].toggle();
                }
            }
        }
        arr[x][y].toggle();
        print();
    }
    public void print () {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j].isValue() ? " true  " : " false ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void shuffle() {
        Random rnd = new Random();
        do {
            for (int i = 0; i < 50; i++) switchTiles(rnd.nextInt(15));
        } while (!isWinner());
    }
}
