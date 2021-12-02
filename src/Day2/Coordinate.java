package Day2;

public class Coordinate {

    private final  int direction;
    private final int value;

    public Coordinate(int direction, int value) {
        this.direction = direction;
        this.value = value;
    }

    public int getDirection() {
        return direction;
    }

    public int getValue() {
        return value;
    }
}
