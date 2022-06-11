package login.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {

    @NotEmpty(message = "User name should not be empty")
    @Size(min = 2, max = 30, message = "User name should be between 2 and 20 characters")
    private String userName;
    @NotEmpty(message = "Password should not be empty")
    @Size(min = 8, max = 30, message = "Password should be between 8 and 30 characters")
    private String password;

    public User(){}

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
