package Homework_5.Task_3;

public class CountryHouse implements HouseMain {
    private int numberOfFloors;
    private boolean turnedOnHeating = true;
    private int numberOfResidents;

    public CountryHouse(int numberOfFloors, int numberOfResidents) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfResidents = numberOfResidents;
    }


    @Override
    public int getFloresNumber() {
        return numberOfFloors;
    }

    @Override
    public boolean turnOnTheHeating() {
        return turnedOnHeating;
    }

    @Override
    public int getResidentsNumber() {
        return numberOfResidents;
    }

}
