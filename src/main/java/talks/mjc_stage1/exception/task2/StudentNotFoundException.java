package talks.mjc_stage1.exception.task2;

public class StudentNotFoundException extends IllegalArgumentException{
    public StudentNotFoundException(String message){
        super(message);
    }
}
