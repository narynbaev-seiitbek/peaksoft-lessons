package Peaksoft.OOP;

public class Main {

    public static void main(String[] args) {

        Person adilet = new Person();
        adilet.name = "Adilet";
        adilet.lastName = "Jumakadyr";
        adilet.age = 18;
        adilet.color = "white";
        adilet.education = true;
        adilet.gender = 'm';
        adilet.height = 185;
        adilet.weight = 85.2;
        adilet.nationality = "kyrgyz";
        adilet.status = "Single";

        Person aziza = new Person();
        aziza.name = "Aziza";
        aziza.lastName = "Jumakadyrova";
        aziza.age = 25;
        aziza.color = "white";
        aziza.education = true;
        aziza.gender = 'f';
        aziza.height = 155;
        aziza.weight = 55.2;
        aziza.nationality = "kyrgyz";
        aziza.status = "Single";

        adilet.sayHello();
        aziza.run();

        System.out.println();


        Laptop hp = new Laptop();
        hp.cpu = "AMD";
        hp.memory = 128;
        hp.ram = 32;
        hp.color = "black";
        hp.name = "HP";

        Laptop fujitsu = new Laptop();
        fujitsu.name = "Fujitsu";
        fujitsu.cpu = "Core i5";
        fujitsu.ram = 16;
        fujitsu.memory = 128;
        fujitsu.color = "White";

        Laptop aser = new Laptop();
        aser.name = "Aser";
        aser.cpu = "Core i7";
        aser.memory = 360;
        aser.ram = 8;
        aser.color = "Red";

        Laptop toshiba = new Laptop();
        toshiba.name = "toshiba";
        toshiba.cpu = "AMD Razon 5";
        toshiba.ram = 4;
        toshiba.memory = 320;
        toshiba.color = "Green";

        Laptop asus = new Laptop();
        asus.name = "Asus";
        asus.cpu = "Core i9";
        asus.ram = 64;
        asus.memory = 560;
        asus.color = "Yellow";

        asus.turnOff();
        hp.turnOn();
        aser.turnOn();
        toshiba.turnOff();
        fujitsu.turnOff();

            System.out.println();

        Peaksoft peaksoft = new Peaksoft();

        String[] rooms = {"FACEBOOK", "GOOGLE", "APPLE", "SPACE", "STARLING", "CAFETERIA"};
        peaksoft.rooms = rooms;
        peaksoft.showRooms();


    }
}
