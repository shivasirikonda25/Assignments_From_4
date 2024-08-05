package userservice;
import java.util.HashSet;
import java.util.Set;
public class UserService {
    private Set<String> users = new HashSet<>();

    public void registerUser(String username) throws UserAlreadyExistsException {
        if (users.contains(username)) {
            throw new UserAlreadyExistsException("User '" + username + "' already exists.");
        }
        users.add(username);
        System.out.println("User '" + username + "' registered successfully.");
    }

    public void checkUserExistence(String username) throws UserNotFoundException {
        if (!users.contains(username)) {
            throw new UserNotFoundException("User '" + username + "' not found.");
        }
        System.out.println("User '" + username + "' exists in the system.");
    }

    public static void main(String[] args) {
        UserService userService = new UserService();

        try {
            userService.registerUser("SHIVA_SIRIKONDA");
            userService.registerUser("VARSHITH");

            userService.checkUserExistence("SHIVA_SIRIKONDA");
            userService.checkUserExistence("VARSHITH");
        } catch (UserAlreadyExistsException e) {
            System.err.println("Registration Error: " + e.getMessage());
        } catch (UserNotFoundException e) {
            System.err.println("Check User Error: " + e.getMessage());
        }
    }
}