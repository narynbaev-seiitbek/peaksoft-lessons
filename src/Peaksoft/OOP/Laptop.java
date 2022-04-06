package Peaksoft.OOP;

public class Laptop {

    private String name;
    private String cpu;
    private int memory;
    private int ram;
    private String color;

    public Laptop(String name, String cpu, int memory, int ram, String color ) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
        this.ram = ram;
        this.color = color;
    }

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
        if (memory <= 0) {
            System.err.println("error memory is not valid");
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

    @Override
    public String toString() {
        return "Laptop information:n " +'\n'+
                "name='" + name + '\n' +
                "cpu='" + cpu + '\n' +
                "memory=" + memory +'\n'+
                "ram=" + ram +'\n'+
                "color='" + color + '\n';
    }
}
