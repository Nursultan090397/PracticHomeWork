package Service;

import Dao.UserDao;
import Model.User;

public interface UserService {
    void addUser (User user);
    void srchUser (int a );
    void removeUser (int a);
    void getUsers ();

}
