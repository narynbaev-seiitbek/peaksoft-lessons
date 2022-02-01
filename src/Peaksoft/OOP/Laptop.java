package Peaksoft.OOP;

public class Laptop {

    private String name;
    private String cpu;
    private int memory;
    private int ram;
    private String color;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        if (memory < 0) {
            System.out.println("error memory is not a valid");
        } else {
            this.memory = memory;
        }
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void showInfoh() {

    }
    public void showInfo() {
        System.out.printf("Laptop info: \n" +
                "Laptop name: " + name + '\n' +
                "Laptop cpu: " + cpu + '\n' +
                "Laptop memory: " + memory + '\n'+
                "Laptop ram: " + ram + '\n'+
                "Laptop color: " + color + '\n');
    }
}
