package Homework_10.Task_1;

public class Summer <T> {
    private T day;
    private String comment;

    public <D> Summer(T day, D comment) {
        this.day = day;
        this.comment = comment.toString();
    }

    public T getDay() {
        return day;
    }

    public String getComment() {
        return comment;
    }
}