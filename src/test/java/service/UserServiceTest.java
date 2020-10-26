package service;

import api.UserService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import enity.User;

public class UserServiceTest {

    @Test
    public void testGetAllUser(){
        List<User> users = new ArrayList<User>();
        users.add(new User(1l, "admin", "admin"));
        users.add(new User(2l, "pablo", "admin"));

        UserServiceImpl userService = new UserServiceImpl(users);
        List<User> userFromTestClass = userService.getAllUsers();

        Assert.assertEquals(users, userFromTestClass);
    }

    @Test
    public void testAddUser(){
        List<User> users = new ArrayList<User>();
        User admin = new User(1l, "admin", "admin");
        users.add(admin);

        UserServiceImpl userService = new UserServiceImpl(users);
        userService.addUser(admin);
        List<User> userFromTestClass = userService.getAllUsers();

        Assert.assertEquals(users, userFromTestClass);
    }

    @Test
    public void testRemoveUser(){
        List<User> users = new ArrayList<User>();
        User admin = new User(1l, "admin", "admin");
        User pablo = new User(2l, "pablo", "admin");
        users.add(admin);
        users.add(pablo);

        UserServiceImpl userService = new UserServiceImpl(users);
        userService.removeUserById(1l);
        users.remove(admin);
        List<User> userFromTestClass = userService.getAllUsers();

        Assert.assertEquals(users, userFromTestClass);
    }
}
