package Homework_10.Task_2;

public enum Direct {
    FILES("files");
    private String name;

    Direct(String name) {
        this.name = name;
    }
    public void LC() {
        System.out.println(name.toLowerCase());
    }
    public void Caps(){
        System.out.println(name.toUpperCase());
    }
    public void  FirstLetter(){
        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1));
    }
}
