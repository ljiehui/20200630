package entity;

public enum Orientation {
    NORTH(0),
    EAST(1),
    SOUTH(2),
    WEST(3);

    private int value ;

    Orientation(int v) {
        this.value = v;
    }

    public int getValue() {
        return this.value;
    }

}
