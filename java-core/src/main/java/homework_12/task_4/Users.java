package homework_12.task_4;

public interface Users {
  User createUser(String name);
  Users users = name -> new User(name);
}
