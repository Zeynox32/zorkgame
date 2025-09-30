package ch.bbw.zork;

public class Player implements Person {
    private String name;
    private Room position;

    public Player(String name, Room position) {
        this.name = name;
        this.position = position;
    }

    public Room getPosition() {
        return position;
    }

    public void setPosition(Room position) {
        this.position = position;
    }
}
