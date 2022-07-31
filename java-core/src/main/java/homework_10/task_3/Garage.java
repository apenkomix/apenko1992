package homework_10.task_3;

public class Garage<T,S> {
    private T type;
    private S number;

    public Garage(T type, S number) {
        this.type = type;
        this.number = number;
    }
    public T getType(){
        return type;
    }
    public S getNumber(){
        return number;
    }
}
