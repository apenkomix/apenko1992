package Homework_6.Task_2;

public class Transmision {
    private int speed = 0;

    public int getSpeed(){
        return speed;
    }
    public void addSpeed(){
        if(speed == 7){
            return;
        }
        speed++;
    }
    public void reduceSpeed(){
        if(speed == 0){
            return;
        }
        speed--;
    }
}
