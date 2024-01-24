import java.util.Scanner;

public class customerservice {
public static User createUser(String username, String password, String name){

    User user= new User(username, password,name);

        return user;

    }
}
