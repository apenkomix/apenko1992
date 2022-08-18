package Homework_5.Task_3;

public class Main {
    public static void main(String[] args) {
        CountryHouse countryHouse = new CountryHouse(1, 10);
        HighRiseBuilding highRiseBuilding = new HighRiseBuilding(45, 900);
        List list = new List(new HouseMain[]{countryHouse, highRiseBuilding});
    }
}