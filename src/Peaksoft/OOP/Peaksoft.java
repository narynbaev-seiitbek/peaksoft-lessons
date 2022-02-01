package Peaksoft.OOP;

public class Peaksoft {
    private String[] rooms;


    public String[] getRooms() {
        return rooms;
    }

    public void setRooms(String[] rooms) {
        this.rooms = rooms;
    }

    public void showRooms() {
        for (String room:rooms) {
            System.out.println(room);
        }
    }
}
