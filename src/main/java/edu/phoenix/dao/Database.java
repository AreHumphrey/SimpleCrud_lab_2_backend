package edu.phoenix.dao;

import edu.phoenix.model.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
  public static List<User> dataBase = new ArrayList<>();


  public static void addUser(String name, String login, String password) {
    // Реализуйте этот метод
  }

  public static User getUser(String login, String password) {
    // Реализуйте этот метод. Он должен вернуть пользователя, а не null
    return null;
  }

  public static void deleteUser(String login) {
    // Реализуйте этот метод
  }

  public static void updateUser(User user) {
    // Реализуйте этот метод
  }

  static class UserAlreadyExists extends Exception {
    public void errorMessage(){
      System.out.println("Пользователь с такими данными уже сужествует");
    }
  };

}
