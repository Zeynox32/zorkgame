package ch.bbw.zork;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Enemy implements Person {
    private String name;
    private Room position;

    public Enemy(String name) {
        this.name = name;
    }

    public void randomStartPosition(ArrayList<Room> rooms) {
        Room zufallsObjekt = rooms.get(
                ThreadLocalRandom.current().nextInt(rooms.size())
        );
        position = zufallsObjekt;
    }

    public void changeRoom() {
        String[] optionen = {"norden", "osten", "sueden", "westen"};
        int zufallsIndex = ThreadLocalRandom.current().nextInt(optionen.length);
        String zufallsRichtung = optionen[zufallsIndex];

        Room nextRoom = position.nextRoom(zufallsRichtung);

        if (nextRoom == null) {
            changeRoom();
        } else {
            position = position.nextRoom(zufallsRichtung);
            System.out.print("----------------------------------------------------------------------------------------------------------------------");
            System.out.println();
        }
    }

    public Room getPosition() {
        return position;
    }
}
