package com.example.vinh;

import java.util.ArrayList;
public class UserStorage {
    public static ArrayList <User> users= new ArrayList<>();
    private static UserStorage userStorage =  null;
    public  UserStorage(){

    }
    public static UserStorage getInstance(){
        if (userStorage == null){
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public ArrayList <User> getUsers(){
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(int id){

    }
}
