import Dao.UserDao;
import Model.Gender;
import Model.User;
import impl.UserServiceImpl;


public class Main {
    public static void main(String[] args) {

        User user1 = new User(1,"Nurs",25, Gender.MALE);
        User user2 = new User(2,"Bakai",30, Gender.MALE);
        User user3 = new User(3,"Suimyk",16,Gender.MALE );
        UserDao userDao = new UserDao();
        UserServiceImpl userService = new UserServiceImpl(userDao);
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);
        userService.srchUser(2);
        System.out.println("_____________Bardyk userler___________________");
        userService.getUsers();
        userService.removeUser(1);
        System.out.println("______________Kalgan userler__________________");
        userService.getUsers();
    }
}