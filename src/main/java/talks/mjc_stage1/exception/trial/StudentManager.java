package talks.mjc_stage1.exception.trial;

public class StudentManager {
    public Student find(String studentID) throws StudentNotFoundException {
        if (studentID.equals("123456")) {
            Student student = new Student();
            return student;
        } else {
            throw new StudentNotFoundException(
                    "Could not find student with ID " + studentID);
        }
    }
}
