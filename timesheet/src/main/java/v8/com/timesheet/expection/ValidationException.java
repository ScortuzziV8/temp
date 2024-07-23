package v8.com.timesheet.expection;

public class ValidationException extends RuntimeException{
    public ValidationException(String message) {
        super(message);
    }
}
