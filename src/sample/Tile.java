package sample;

public class Tile {

    private boolean value;

    public Tile() {value = true;}
    public boolean isValue() {return value;}
    public void toggle() {value = !value;}
    public void setValue(boolean value) {this.value = value;}
}
