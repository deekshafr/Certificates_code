package Request;

public class Signupreq {
   public String confirmPassword;
   public String firstName;
   public String gender;
   public String lastName;
   public String  occupation;
   public String required;
   public String userEmail;
   public String userPassword;
   public String userRole;
   public  String userMobile;

    @Override
    public String toString() {
        return "Signupreq{" +
                "confirmPassword='" + confirmPassword + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", required='" + required + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRole='" + userRole + '\'' +
                ", userMobile='" + userMobile + '\'' +
                '}';
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }



    public Signupreq(String confirmPassword, String firstName, String gender, String lastName, String occupation, String required, String userEmail, String userPassword, String userRole,String userMobile) {

        this.confirmPassword = confirmPassword;
        this.gender=gender;
        this.firstName=firstName;
        this.userRole=userRole;
        this.userEmail=userEmail;
        this.occupation=occupation;
        this.userPassword=userPassword;
        this.lastName=lastName;
        this.required=required;
        this.userMobile=userMobile;
    }
}
