package Peaksoft.OOP;

public class Main {

    public static void main(String[] args) {

        Laptop hp = new Laptop("HP","AMD",128,32,"Black");
        Laptop fujitsu = new Laptop("Fujitsu","Core i5",128,16,"White");
        Laptop aser = new Laptop("Aser", "Corei7",360,8,"Red");
        Laptop toshiba = new Laptop("Toshiba","AMD Razon 5",360,4,"Green");
        Laptop asus = new Laptop("Asus","Core i9",560,64,"Yellow");

        Student sadyr = new Student("Sadyr","Japarov", (byte) 55,185,
                85,'M',"Kyrgyz","Married",true, toshiba);

        Peaksoft java5 = new Peaksoft("Java 5",
                new String[]{"FACEBOOK", "GOOGLE", "APPLE", "SPACE", "STARLING", "CAFETERIA"},sadyr);

        System.out.println(java5);

    }
}
