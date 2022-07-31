package homework_5.task_3;

public class HighRiseBuilding implements HouseMain {
    private int numberOfFloors;
    private boolean turnedOnHeating = true;
    private int numberOfResidents;

    public HighRiseBuilding(int numberOfFloors, int numberOfResidents) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public int getFloresNumber() {
        return numberOfFloors;
    }

    @Override
    public int getResidentsNumber() {
        return numberOfResidents;
    }

    @Override
    public boolean turnOnTheHeating() {
        return turnedOnHeating;
    }
}
