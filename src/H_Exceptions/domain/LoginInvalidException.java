package H_Exceptions.domain;

public class LoginInvalidException extends Exception{
    public LoginInvalidException(String message) {
        super(message);
    }
}
