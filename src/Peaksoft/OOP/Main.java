package Peaksoft.OOP;

public class Main {

    public static void main(String[] args) {

        Person adilet = new Person();
       adilet.setName("Adilet");
       adilet.setLastName("Jumakadyrov");
       adilet.setGender('M');
       adilet.setHeight(185);
       adilet.setEducation(true);
       adilet.setNationality("Kyrgyz");
       adilet.setStatus("Single");
       adilet.setWeight(85);
       adilet.setAge((byte) 18);

        System.out.println(adilet.toString());


        Laptop hp = new Laptop();
        hp.setCpu("AMD");
        hp.setMemory(128);
        hp.setRam(32);
        hp.setColor("Black");
        hp.setName("HP");

        Laptop fujitsu = new Laptop();
        fujitsu.setName("Fujisu");
        fujitsu.setCpu("Core i5");
        fujitsu.setRam(16);
        fujitsu.setMemory(128);
        fujitsu.setColor("White");

        Laptop aser = new Laptop();
        aser.setName("Aser");
        aser.setCpu("Core i7");
        aser.setMemory(360);
        aser.setRam(8);
        aser.setColor("Red");

        Laptop toshiba = new Laptop();
        toshiba.setName("Toshiba");
        toshiba.setCpu("AMD Razon 5");
        toshiba.setRam(4);
        toshiba.setMemory(320);
        toshiba.setColor("Green");

        Laptop asus = new Laptop();
        asus.setName("Asus");
        asus.setCpu("Core i9");
        asus.setRam(64);
        asus.setMemory(-1);
        asus.setColor("Yellow");



        System.out.println();

        Peaksoft peaksoft = new Peaksoft();


        String[] rooms = {"FACEBOOK", "GOOGLE", "APPLE", "SPACE", "STARLING", "CAFETERIA"};

        hp.showInfo();


    }
}
