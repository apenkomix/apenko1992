package Homework_12.Task_4;

public interface Users {
  User createUser(String name);
  Users users = name -> new User(name);
}
