package talks.mjc_stage1.exception.trial;

public class StudentNotFoundException extends IllegalArgumentException{
    public StudentNotFoundException(String message) {
        super(message);
    }
}
