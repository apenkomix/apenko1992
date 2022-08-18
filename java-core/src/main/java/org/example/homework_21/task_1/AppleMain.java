package homework_21.task_1;

public class AppleMain {
    public static void main(String[] args) {
        Apple apple = new Apple(1L,"apple","red",10,100);
        AppleDtoConverter appleDtoConverter = new AppleDtoConverter();
        AppleDto converter = appleDtoConverter.converter(apple);

    }
}
