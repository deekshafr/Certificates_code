package Request;

public class Loginreq {
   public String userEmail;
   public String userPassword;

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }

    public String getUsername() {
        return userEmail;
    }

    public void setUsername(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "Loginreq{" +
                "username='" + userEmail + '\'' +
                ", password='" + userPassword + '\'' +
                '}';
    }

    public Loginreq(String username, String password) {
        this.userEmail = username;
        this.userPassword=password;
    }
}
