package homework_10.task_3;

public class GarageMain {
    public static void main(String[] args) {
        Garage<String,Integer> garage = new Garage<>("BMW", 10);
        String garageType = garage.getType();
        Garage<String,Integer> garage1 = new Garage<>("Lada", 15);
        String garage1Type = garage1.getType();
        Garage<String,Integer> garage2 = new Garage<>("AnyCar", 40);
        String garage2Type = garage2.getType();
        System.out.println(garageType);
        System.out.println(garage1Type);
        System.out.println(garage2Type);
    }
}