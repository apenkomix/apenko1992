package Homework_5.Task_2;

import javax.xml.namespace.QName;

public class Warehouse {
    private final String name;

    public Warehouse(String name) {
        this.name = name;
    }
    public Warehouse() {
        this("Uncknown");
    }
    public static void main(String[] args) {
        Warehouse[] warehouse = new Warehouse[4];
        warehouse[0] = new Warehouse("Books");
        warehouse[1] = new Warehouse("Hats");
        warehouse[2] = new Warehouse("Shoes");
        warehouse[3] = new Warehouse("Computers");

        for (int i = 0; i < warehouse.length; i++) {
            System.out.println(warehouse[i].name);
        }
    }
}

