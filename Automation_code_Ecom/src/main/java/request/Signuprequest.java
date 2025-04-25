package request;

public class Signuprequest {

    private String username;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
    public Signuprequest(String username,String firstname,String lastname,String email,String mobile) {
        this.username = username;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.mobile=mobile;
    }
    @Override
    public String toString() {
        return "Signuprequest{" +
                "username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
    public static class builder{
        private String username;
        private String firstname;
        private String lastname;
        private String email;
        private String mobile;
        public  builder firstname(String firstname){
            this.firstname=firstname;
            return this;
        }
        public  builder lastname(String lastname){
            this.lastname=lastname;
            return this;
        }
        public  builder username(String username){
            this.username=username;
            return this;
        }
        public  builder email(String email){
            this.email=email;
            return this;
        }
        public  builder mobile(String mobile){
            this.mobile=mobile;
            return this;
        }
        public Signuprequest build(){
            Signuprequest signuprequest=new Signuprequest(username,firstname,lastname,email,mobile);
            return signuprequest;
        }
    }

}
