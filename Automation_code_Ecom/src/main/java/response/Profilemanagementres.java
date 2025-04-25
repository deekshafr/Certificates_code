package response;

public class Profilemanagementres {
    private int id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    public Profilemanagementres() {
    }

    public Profilemanagementres(int id, String username, String email, String firstName, String lastname, String mobile) {
        this.id = id;
        this.email=email;
        this.firstName=firstName;
        this.lastName=lastname;
        this.username=username;
        this.mobileNumber=mobile;
    }

    public String getMobile() {
        return mobileNumber;
    }

    public void setMobile(String mobile) {
        this.mobileNumber = mobile;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "profilemanagement{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", mobile='" + mobileNumber + '\'' +
                '}';
    }
}
