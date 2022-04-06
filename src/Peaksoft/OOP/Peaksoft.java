package Peaksoft.OOP;

import java.util.Arrays;

public class Peaksoft {
    private String name;
    private String[] rooms;
    private Student student;

    public Peaksoft(String name, String[] rooms, Student student) {
        this.name = name;
        this.rooms = rooms;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student  getStudent() {
        return student;
    }

    public void setStudents(Student student) {
        this.student = student;
    }

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

    @Override
    public String toString() {
        return "Peaksoft information: " +'\n'+
                "name=" + name + '\n' +
                "rooms=" + Arrays.toString(rooms) +'\n'+
                "student=" + student+'\n';
    }
}
