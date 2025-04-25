package Response;

public class Loginresponse {
   private String token;
   private String userId;
   private String message;

    public Loginresponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Loginres{" +
                "token='" + token + '\'' +
                ", userId='" + userId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public Loginresponse(String token, String userId, String message) {
        this.token = token;
        this.userId=userId;
        this.message=message;
    }
}
