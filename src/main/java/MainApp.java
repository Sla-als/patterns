import model.Auto;
import model.User;
import service.UserService;

import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = new User("Masha",26);
        //userService.saveUser(user);
        userService.findAllUsers();
    }
}
